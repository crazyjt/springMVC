package springmvc02.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//��ʶ����Ϊע��
@Controller
public class HelloController {
//	�ύ��/hello�����󶼻ᱻhello��������
	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest request,HttpServletResponse response)
	{
		ModelAndView mView = new ModelAndView();
		mView.addObject("msg", "Hello springMVC02");
		mView.setViewName("hello");
		return mView;
	}
	
}
