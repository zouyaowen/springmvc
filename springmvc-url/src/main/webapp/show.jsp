<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>show</title>
</head>
<body>
<h2><a href="mySecondController">跳转到本页面</a></h2>
<h2><a href="test/mySecondController">前面加/test跳转到本页面</a></h2>
<h2><a href="${pageContext.request.contextPath}/test/mySecondController">使用动态路径跳转到本页面</a></h2>
</body>
</html>