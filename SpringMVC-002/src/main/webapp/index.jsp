<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/req.action" method="post">
    <input type="submit" value="提交">
</form>
</body>
<h2>1.单个数据提交</h2>
<form action="/one.action" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<h2>2.对象封装数据提交</h2>
<%--
    get请求不会乱码:
        tomcat版本在7以上都被tomcat自动解决
    post请求会乱码:
        需要专门处理
--%>
<form action="/two.action" method="get">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<h2>3.动态占位符提交</h2>
<%--
    仅限于超链接或地址栏提交数据
--%>
<a href="/three/张三/99.action">动态</a>
</html>
