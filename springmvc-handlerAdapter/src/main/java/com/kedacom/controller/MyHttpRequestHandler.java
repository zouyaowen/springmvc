package com.kedacom.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class MyHttpRequestHandler implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//页面跳转有两种方式
		request.getRequestDispatcher("/skip.html").forward(request, response);
		//或者以转发的方式，转发的方式是不能直接传递参数
		//后台路径中有一个特例，转发中的后台路径不能加斜杠
		//response.sendRedirect("skip.html");
	}

}
