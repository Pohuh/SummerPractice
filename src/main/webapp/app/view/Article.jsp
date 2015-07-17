<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <form action="Delete" method="go">
    <input name="id" type="hidden" value=${article.getId()}>
    <input type="submit" value="Удалить">
  </form>
  <table border="2" bgcolor=#f9f0ef cellspacing="3" width="60%">
    <font color=#618c5e>
      <jsp:useBean id="article" class="model.Table" scope="request"/>
      <tr>
        <td width="90%"  align="center">
          <font color=#618c5e>
            ${article.getTitle()}
          </font>
        </td>
      </tr>
      <tr>
        <td align="center">
          <font color=#618c5e>
            ${article.getText()}
          </font>
        </td>
      </tr>
        <jsp:useBean id="CommentsList" class="java.util.ArrayList" scope="request"/>
        <c:forEach items="${CommentsList}" var="cell">
      <tr>
        <td align="center">
          <font color=#618c5e>
            ${cell.getComm()}
          </font>
        </td>
      </tr>
        </c:forEach>
      <tr>
        <td align="center">
          <form action="Comments" method="go">
            <input name="id" type="hidden" value=${article.getId()}>
            Текст комментария<textarea rows="8" cols="200" name="comment"></textarea><br>
            <input type="submit" value="Добавить комментарий">
          </form>
          <form action="/Blog" method="go">
            <p><input id="go" type="submit" value="Назад"></p>
          </form>
        </td>
      </tr>
    </font>
  </table>
</center>
</body>
</html>
