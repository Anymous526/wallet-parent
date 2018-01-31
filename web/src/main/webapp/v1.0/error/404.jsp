﻿﻿<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="webRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE 
    html
    PUBLIC
    "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="REFRESH" CONTENT="5; URL=${webRoot}/user/list" />
<title>您访问的页面可能已经被删除</title>
<link href="/css/style.css" rel="stylesheet" type="text/css" />
<style>
.neri {
	width: 550px;
	top: 200px;
	margin: 0 auto;
	padding-top: 140px
}

.neri ul {
	padding-top: 30px;
}

.neri ul li {
	line-height: 30px;
	font-family: "微软雅黑";
	font-size: 18px;
	font-weight: bold;
	line-height: 30px;
	padding-left: 30px;
	color: #7e7e7e;
}

.neri ul li a {
	float: right;
	color: #7e7e7e;
	font-size: 14px;
}
</style>
</head>
<body style="background: #fff;">
	<div class="neri">
		<img src="/error/404.jpg" />
		<ul>
			<li>您访问的页面可能已经被删除，由此为您造成的不便请谅解！！</li>
			<!-- 
      <li>
       如果您有什么问题，请联系我们的客服　<span class="font14_red"><strong>TEL: 400-702-0808</strong></span>
    </li>
     -->
			<li><a href="">返回首页&gt;&gt;</a></li>
		</ul>
	</div>
</body>
</html>
