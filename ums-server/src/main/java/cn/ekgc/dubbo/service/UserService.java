package cn.ekgc.dubbo.service;

import cn.ekgc.dubbo.model.User;
import cn.ekgc.dubbo.utils.page.Page;

public interface UserService {
	Page<User> getUserListByPage(Page<User> page) throws Exception;
}
