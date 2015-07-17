<%--
  Created by IntelliJ IDEA.
  User: ооо
  Date: 10.07.2015
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<BODY BGCOLOR="#ffffcc">
<% if (request.getParameter("name")==
        null && request.getParameter("email")
        == null) { %>
<CENTER>
  <H2>User Info Request Form</H2>
  <FORM METHOD="GET" ACTION="example-of-jsp.jsp">
    <P>
      Your name: <input type="text" name=
            "name" size=26>
    <P>
      Your email: <input type="text" name=
            "email" size=26>
    <P>
      <input type="submit" value="Process">
  </FORM>
</CENTER>
<% } else { %>
<%! String name, email; %>
<%
  name = request.getParameter("name");
  email = request.getParameter("email");
%>
<P>
  <B>You have provided the following
    info</B>:
<P>
  <B>Name</B>: <%= name %><P>
  <B>Email</B>: <%= email %>
    <% } %>
</body>
</html>
