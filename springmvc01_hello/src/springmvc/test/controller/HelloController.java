package springmvc.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//ʵ��Controller�ӿ�
public class HelloController implements Controller{
	//ʵ��handleRequest����
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		//����һ��ModelAndView��ͼ����
		ModelAndView mView = new ModelAndView();
		//��װҪ��ʾ����ͼ�е����ݣ���ModelAndView�������������
		mView.addObject("msg","Hello MVC URL��ӦBean");
		//������ͼ��
		mView.setViewName("hello");
		//���ظ���ͼ
		return mView;
	}
}
