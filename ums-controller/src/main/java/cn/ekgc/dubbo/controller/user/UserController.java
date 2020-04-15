package cn.ekgc.dubbo.controller.user;

import cn.ekgc.dubbo.controller.base.BaseController;
import cn.ekgc.dubbo.model.User;
import cn.ekgc.dubbo.transport.UserTransport;
import cn.ekgc.dubbo.utils.page.Page;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Reference(version = "3.0.0") //远程调用
	private UserTransport userTransport;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String forwardUserIndex() throws Exception {
		return "user/user_index";
	}
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public Page<User> getUserListByPage(Integer pageNum, Integer pageSize, Integer draw) throws Exception {
		Page<User> page = new Page<>(pageNum, pageSize, draw);
		return userTransport.getUserListByPage(page);

	}

}
