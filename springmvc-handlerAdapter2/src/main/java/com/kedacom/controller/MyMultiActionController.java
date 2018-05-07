package com.kedacom.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@SuppressWarnings("deprecation")
public class MyMultiActionController extends MultiActionController {
	//自定义方法需要加上request和response参数，否则无法执行
	public ModelAndView doFirst(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("执行MyMultiActionController的doFirst方法");
		modelAndView.setViewName("/index.html");
		return modelAndView;
	}
	public ModelAndView doSecond(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("执行MyMultiActionController的doSecond方法");
		modelAndView.setViewName("/index.html");
		return modelAndView;
	}
}
