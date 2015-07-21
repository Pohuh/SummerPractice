<%--
  Created by IntelliJ IDEA.
  User: ооо
  Date: 11.07.2015
  Time: 3:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article</title>
</head>
<body bgcolor="#cccccc">
<center>
  <jsp:useBean id="post" class="model.Table" scope="request"/>
  <form action="Delete" method="go">
    <input name="id" type="hidden" value=${post.getId()}>
    <p><input type="submit" value="Удалить"></p>
  </form>
  <table border="2" bgcolor=#f9f0ef cellspacing="3" width="60%">
    <font color=#618c5e>
      <tr>
        <td width="90%"  align="center">
          <font color=#618c5e>
            ${post.getTitle()}
          </font>
        </td>
      </tr>
      <tr>
        <td align="center">
          <font color=#618c5e>
            ${post.getText()}
          </font>
        </td>
      </tr>
      <tr>
        <td align="center">
          <p><b>Комментарии</b></p>
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
            <input name="id" type="hidden" value=${post.getId()}>
            <p><b>Добавить комментарий</b></p>
            <p><textarea rows="8" cols="80" name="comment"></textarea></p>
            <p><input type="submit" value="Отправить"></p>
          </form>
          <form action="/Blog" method="back">
            <p><input id="back" type="submit" value="Назад"></p>
          </form>
        </td>
      </tr>
    </font>
  </table>
</center>
</body>
</html>
