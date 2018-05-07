package com.kedacom.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MyMultiActionController extends MultiActionController {
	public ModelAndView doFirst(){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("执行MyMultiActionController的doFirst方法");
		modelAndView.setViewName("/index.html");
		return modelAndView;
	}
	public ModelAndView doSecond(){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("执行MyMultiActionController的doSecond方法");
		modelAndView.setViewName("/index.html");
		return modelAndView;
	}
}
