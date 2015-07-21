<%--
  Created by IntelliJ IDEA.
  User: ооо
  Date: 14.07.2015
  Time: 4:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
<HEAD>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Blog</title>
</HEAD>
<BODY bgcolor="#cccccc">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<font color=#65789a size="6">
  <center><b>Блог</b>
    <table border="2" bgcolor=#f9f0ef cellspacing="3" width="60%">
      <div>
        <form action="app/view/new-post.jsp" method="new-post">
          <p><input id="create" type="submit" value="Создать запись"></p>
        </form>
      </div>
      <font color=#618c5e>
        <tr>
          <td width="15%"  align="center">
            <font color=#618c5e>
              Дата
            </font>
          </td>
          <td width="75%" align="center">
            <font color=#618c5e>
              Название
            </font>
          </td>
          <td align="center">
            <font color=#618c5e>
              Ссылка
            </font>
          </td>
        </tr>
        <jsp:useBean id="listResults" class="java.util.ArrayList" scope="request"/>
        <c:forEach items="${listResults}" var="cell">
        <tr>
          <td width="15%" align="center">
            <font color=#618c5e>
                ${cell.getData()}
            </font>
          </td>
          <td width="75%" align="center">
            <font color=#618c5e>
                ${cell.getTitle()}
            </font>
          </td>
          <td align="center">
            <form action="Post" method="go">
              <p><input name="id"  type="hidden" value=${cell.getId()}></p>
              <p><input name="idButton"  type="submit" value="Ссылка"></p>
            </form>
          </td>
        </tr>
          </c:forEach>
      </font>
    </table>
  </center>
</font>
</BODY>

</HTML>