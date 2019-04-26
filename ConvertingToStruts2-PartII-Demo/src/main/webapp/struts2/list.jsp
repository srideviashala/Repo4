<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<html>
<head><title>List Blogs</title></head>
<body>

My Blogs:<br/>
<c:forEach var="blog" items="${requestScope.bloglist}">
    <a href="view.action?id=<c:out value="${blog.id}"/>"><c:out value="${blog.title}"/></a>
    [ Updated <fmt:formatDate value="${blog.created.time}" pattern="MM/dd/yyyy"/> ]
    (<a href="remove.action?id=<c:out value="${blog.id}"/> ">remove</a>)
    <br/>
</c:forEach>

<a href="add.action">Add a new entry</a>

</body>
</html>