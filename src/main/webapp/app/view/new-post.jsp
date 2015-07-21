<%--
  Created by IntelliJ IDEA.
  User: ооо
  Date: 10.07.2015
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New post</title>
</head>
<body bgcolor="#cccccc">
  <center>
      <font color=#65789a size="6">
          <b>Новая запись</b>
      </font>
      <form action="/NewPost" method="create">
          <div>
              <p><input type="text" name="title" id="name" value="" size="79" />
              <p><textarea rows="30" cols="80" name="text" class="rtext autosize focused" spellcheck="false" tabindex="1" maxlength="30000"></textarea></p>
          </div>
          <div>
              <p><input id="create" type="submit" value="Создать запись"></p>
          </div>
      </form>
      <form action="/Blog" method="back">
          <div>
              <p><input id="back" type="submit" value="Назад"></p>
          </div>
      </form>
  </center>
</body>
</html>
