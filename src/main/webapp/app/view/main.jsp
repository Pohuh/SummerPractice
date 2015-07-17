<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
                <form action="new-post.jsp" method="new-post">
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
                <tr>
                    <td> ${time} </td>
                    <td>< ${title}></td>
                    <td>
                        <form action="Article.jsp" method="go">
                            <p><input id="go1"  type="submit" value="Ссылка"></p>
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>Uno</td>
                    <td>Uno</td>
                    <td>
                        <form action="Article.jsp" method="go">
                            <p><input id="go2" type="submit" value="Ссылка"></p>
                        </form>
                    </td>
                </tr>
            </font>
        </table>
    </center>
</font>
</BODY>

</HTML>