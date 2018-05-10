package com.kedacom.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {
	/* 
	 * modelAndView添加属性底层是一个ModelMap
	 * ModelMap继承LinkedHashMap，LinkedHashMap继承HashMap,
	 * HashMap底层是一个数组加链表的呈现方式，且是一个单向链表；
	 * LinkedHashMap是一个双向链表，操作更加灵活
	 * */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("执行MyController的handleRequest方法");
		modelAndView.addObject("Message", "这里是跳转界面");
		modelAndView.setViewName("/skip.jsp");
		return modelAndView;
	}

	

   
}