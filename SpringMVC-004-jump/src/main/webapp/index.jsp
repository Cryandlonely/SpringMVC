<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/one.action">请求转发页面</a><br><br>
<a href="<%=request.getContextPath()%>/two.action">请求转发action</a><br><br>
<a href="<%=request.getContextPath()%>/three.action">重定向页面</a><br><br>
<a href="<%=request.getContextPath()%>/four.action">重定向页面action</a><br><br>
<a href="<%=request.getContextPath()%>/five.action">随便跳转页面</a><br><br>
<a href="<%=request.getContextPath()%>/data.action">数据</a><br>
<a href="<%=request.getContextPath()%>/data.action?name=741">取url数据</a>
<br><br>
<form action="<%=request.getContextPath()%>/date.action">
    日期：<input type="date" name="mydate">
    <input type="submit" value="提交">
</form>
<br><br>
<a href="<%=request.getContextPath()%>/list.action">日期显示</a>
</body>
</html>
