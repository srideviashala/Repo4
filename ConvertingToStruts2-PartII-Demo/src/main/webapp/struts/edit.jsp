<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<html>
  <head><title>Update Blog Entry</title></head>
  <body>
    <form action="update.do" method="post">
        <input type="hidden" name="id" value="<c:out value="${requestScope.blog.id}" />" />
        Id: <c:out value="${requestScope.blog.id}" /><br/>
        Title: <input type="text" name="title" value="<c:out value="${requestScope.blog.title}" />"/><br/>
        Entry: <textarea rows="3" cols="25" name="entry"><c:out value="${requestScope.blog.entry}" /></textarea> <br/>
        Updated: <fmt:formatDate value="${requestScope.blog.created.time}" pattern="MM/dd/yyyy"/><br/>
        <input type="submit" value="Update"/>
    </form>
  </body>
</html>