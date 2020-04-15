package cn.ekgc.dubbo.transport.imp;

import cn.ekgc.dubbo.model.User;
import cn.ekgc.dubbo.service.UserService;
import cn.ekgc.dubbo.transport.UserTransport;
import cn.ekgc.dubbo.utils.page.Page;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

//这里用的是dubbo的@service
@Service(version = "3.0.0")  //version 最好和项目版本一致，好记！
public class TransportImpl implements UserTransport {
	@Resource(name="userService") //本地调用
	private UserService userService;
	@Override
	public Page<User> getUserListByPage(Page<User> page) throws Exception {
		return userService.getUserListByPage(page);
	}
}
