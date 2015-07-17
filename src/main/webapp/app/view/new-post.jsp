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
      <form name="reply" id="reply" method="POST" action="null" class="ks">
          <div>
              <p><input type="text" name="Название" id="name" value="" size="79" />
              <%--<p><textarea rows="1" cols="80" name="reply" id="reply-input-title" class="rtext autosize focused" spellcheck="false" tabindex="1" maxlength="300"></textarea></p></p>--%>
              <p><textarea rows="30" cols="80" name="reply" id="reply-input-article" class="rtext autosize focused" spellcheck="false" tabindex="1" maxlength="3000"></textarea></p>
          </div>
      </form>
      <form action="Article.jsp" method="create">
          <div>
              <p><input id="create" type="submit" value="Создать запись"></p>
          </div>
      </form>
      <form action="main.jsp" method="back">
          <div>
              <p><input id="back" type="submit" value="Назад"></p>
          </div>
      </form>
  </center>
</body>
</html>
