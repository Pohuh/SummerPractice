<%--
  Created by IntelliJ IDEA.
  User: ооо
  Date: 11.07.2015
  Time: 3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article</title>
</head>
<body bgcolor="#cccccc">
<center>
  <form action="main.jsp" method="delete">
    <p><input type="submit" value="Удалить"></p>
  </form>
  <table border="2" bgcolor=#f9f0ef cellspacing="3" width="60%">
    <font color=#618c5e>
      <tr>
        <td width="90%"  align="center">
          <font color=#618c5e>
            ${getTitle}
          </font>
        </td>
      </tr>
      <tr>
        <td align="center">
          <font color=#618c5e>
            ${getText}
          </font>
        </td>
      </tr>
      <tr>
        <td align="center">
          <font color=#618c5e>
            Комментарии
          </font>
        </td>
      </tr>
      <tr>
        <td align="center">
          <p><b>Добавить комментарий</b></p>
          <p><textarea rows="8" cols="80" name="text"></textarea></p>
          <form action="Article.jsp" method="post">
            <p><input type="submit" value="Отправить"></p>
          </form>
          <form action="main.jsp" method="back">
            <p><input id="back" type="submit" value="Назад"></p>
          </form>
        </td>
      </tr>
    </font>
  </table>
</center>
</body>
</html>
