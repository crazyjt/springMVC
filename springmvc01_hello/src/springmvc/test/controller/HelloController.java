package springmvc.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//实现Controller接口
public class HelloController implements Controller{
	//实现handleRequest方法
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		//创建一个ModelAndView视图对象
		ModelAndView mView = new ModelAndView();
		//封装要显示到视图中的数据，向ModelAndView对象中添加数据
		mView.addObject("msg","Hello MVC URL对应Bean");
		//设置视图名
		mView.setViewName("hello");
		//返回该视图
		return mView;
	}
}
