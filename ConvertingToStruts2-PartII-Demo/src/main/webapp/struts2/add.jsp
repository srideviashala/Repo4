<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head><title>Add Blog Entry</title></head>
  <body>
    <form action="save.action" method="post">
        Title: <input type="text" name="title" /><br/>
        Entry: <textarea rows="3" cols="25" name="entry"></textarea> <br/>
        <input type="submit" value="Add"/>
    </form>
  </body>
</html>