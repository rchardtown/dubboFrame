package cn.ekgc.dubbo.service.impl;

import cn.ekgc.dubbo.dao.UserDao;
import cn.ekgc.dubbo.model.User;
import cn.ekgc.dubbo.service.UserService;
import cn.ekgc.dubbo.utils.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//切记这里的@service是springframework的@service，原因是，这里的service层要处理事务，后面跟@Transactional ,
//而 ，dubbo框架不能处理事务，dubbo的@service和事务不能共存,用了dubbo的@service后发布出去的代码也不能用
//  那么问题来了，事务要处理，肯定要用springframework的@service
// dubbo框架是肯定要用的，代码也要发布，注册接口时，需要用dubbo的@service
// 怎么办？
// 解决方法是： 在controller层 和service层中间加了一层传输层Transport。service层调dao层，用springframework的@service 处理事务
//             事务处理完后，通过传输层Transport来调用service层，此时对象的注解用dubbo的@service。
//             而传输层Transport的接口直接：发布给zookeeper供consumer层进行调用。
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public Page<User> getUserListByPage(Page<User> page) throws Exception{
// 设定查询参数集合
		Map<String, Object> paramMap = new HashMap<String, Object>();

		paramMap.put("begin", page.getBegin()); // MySQL分页开始下标
		paramMap.put("size", page.getSize());// MySQL分页连续查询条数

		List<User> list = userDao.findUserByQueryForPage(paramMap);
		Long totalSize = (long) userDao.findUserByQueryForPage(paramMap).size();

		page.setList(list);
		page.setTotalSize(totalSize);
		page.setTotalPage();
		return page;

	}
}
