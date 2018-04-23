package com.kedacom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class PageSkipController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		//直接跳转页面
		//modelAndView.setViewName("/WEB-INF/jsp/skipPage.jsp");
		//使用视图解析器跳转页面
		modelAndView.setViewName("skipPage");
		return modelAndView;
	}

}
