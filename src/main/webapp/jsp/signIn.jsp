<%--
  Created by IntelliJ IDEA.
  User: dyanchuk
  Date: 1/2/21
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign in</title>
</head>
<body>
<form class="form-signin form-signin-left">
    <input class="form-styling" style="display: none" type="text" name="type" value="signin"/>
    <label for="loginLogin">Username</label>
    <input id="loginLogin" class="form-styling" type="text" name="login" required/>
    <label for="passwordLogin">Password</label>
    <div>
        <input id="passwordLogin" class="form-styling" type="password" autocomplete="on"
               name="password" required/>
        <span toggle="#passwordLogin" class="fa fa-fw fa-eye field-icon toggle-password"></span>
    </div>
    <input class="btn-signin" type="submit" value="Sign in">
</form>
</body>
</html>
