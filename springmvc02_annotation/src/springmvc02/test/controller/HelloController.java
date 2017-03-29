package springmvc02.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//标识该类为注解
@Controller
public class HelloController {
//	提交到/hello的请求都会被hello方法处理
	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mView = new ModelAndView();
		mView.addObject("msg", "Hello springMVC02");
		mView.setViewName("hello");
		return mView;
	}
	
}
