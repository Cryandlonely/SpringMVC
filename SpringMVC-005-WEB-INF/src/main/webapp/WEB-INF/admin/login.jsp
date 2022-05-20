<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/showLogin2">
    账号<input type="text" name="name">
    密码<input type="text" name="password">
    <input type="submit" value="提交">
</form>
<br>
${msg}
</body>
</html>
