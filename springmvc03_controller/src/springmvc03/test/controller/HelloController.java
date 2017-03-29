package springmvc03.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mView = new ModelAndView();
		mView.addObject("msg", "Hello springMVC URL∑÷≈‰Bean");
		mView.setViewName("hello");
		return mView;
	}
}
