<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>
show.........
${mydate}<br>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.name}</td>
            <td>${stu.date}--- <fmt:formatDate value="${stu.date}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
