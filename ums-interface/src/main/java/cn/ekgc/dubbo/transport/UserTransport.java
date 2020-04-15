package cn.ekgc.dubbo.transport;

import cn.ekgc.dubbo.model.User;
import cn.ekgc.dubbo.utils.page.Page;

public interface UserTransport {
	Page<User> getUserListByPage(Page<User> page) throws  Exception;
}
