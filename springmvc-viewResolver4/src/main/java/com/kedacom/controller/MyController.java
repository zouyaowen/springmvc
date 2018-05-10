package com.kedacom.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("执行MyController的handleRequest方法");
		//modelAndView.addObject("Message", "HelloWorld");
		modelAndView.setViewName("baidu");
		return modelAndView;
	}
   
}