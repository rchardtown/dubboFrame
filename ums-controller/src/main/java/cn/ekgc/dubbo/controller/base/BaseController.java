package cn.ekgc.dubbo.controller.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest httpServletRequest;
	@Autowired
	protected HttpServletResponse httpServletResponse;
	@Autowired
	protected HttpSession httpSession;

}
