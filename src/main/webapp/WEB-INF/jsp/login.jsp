<%--
  Created by IntelliJ IDEA.
  User: Mr.Wu
  Date: 2020/6/10
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
    <form action="login" method="post">
       用户： <input type="text" name="username"><br>
       密码： <input type="text" name="password"><br>
        <input type="submit">
    </form>
</body>
</html>
