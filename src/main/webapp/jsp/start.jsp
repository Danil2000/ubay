<%--
  Created by IntelliJ IDEA.
  User: dyanchuk
  Date: 1/2/21
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ubay</title>
    <script src="../js/start.js"></script>
</head>
<body>
    <h1>Welcome</h1>
    <p>Please choose sign in or sign up</p>
    <form method="post" action="http://localhost:8080/ubay/signIn" class="login">
        <input type="submit" value="Sign in">  <Br>
    </form>
    <form method="post" action="http://localhost:8080/ubay/signUp" class="login">
        <input type="submit" value="Sign up">  <Br>
    </form>
    <form method="post" action="http://localhost:8080/ubay/bay" class="login">
        <input type="submit" value="With out sign in">  <Br>
    </form>

</body>
</html>
