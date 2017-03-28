<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-03-28
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示所有的用户</title>
</head>
<body>
<form>
    <table >
        <c:forEach var="user" items="${list}">
            <tr>
                <td>${user.Id}</td>
                <td>${user.name}</td>
                <td>${user.code}</td>
                <td>${user.sex}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>