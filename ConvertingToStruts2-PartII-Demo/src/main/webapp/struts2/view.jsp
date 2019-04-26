<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<html>
<head><title>View Blog Entry</title></head>
<body>
    Id: <c:out value="${requestScope.blog.id}" /><br/>
    Title: <c:out value="${requestScope.blog.title}" /><br/>
    Entry: <c:out value="${requestScope.blog.entry}" /><br/>
    Updated: <fmt:formatDate value="${requestScope.blog.created.time}" pattern="MM/dd/yyyy"/><br/>

    <br/>
    <a href="list.action">Back to List</a> |
    <a href="edit.action?id=<c:out value="${requestScope.blog.id}"/>">Edit</a>
</body>
</html>