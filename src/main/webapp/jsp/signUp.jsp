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
    <link rel="stylesheet" href="CSS/global.css">
    <title>Sign Up</title>
</head>
<body>
    <form class="form-signup form-signup-left" id="formSignUp" action="/ubay/signUp" method="POST" name="form">
        <div class="login-input">
            <label for="loginSignUp"></label>
            <input id="loginSignUp" class="form-styling username-input-style" type="text" name="login" placeholder="Username" required autofocus/>
            <label for="passwordSignUp"></label>
        </div>
        <div class="password-input">
            <input id="passwordSignUp" class="form-styling password-input-style" type="password" name="password" placeholder="Password" autocomplete="on" required/>
            <span toggle="#passwordSignUp" class="fa fa-fw fa-eye field-icon toggle-password"></span>
        </div>
        <div class="role-balance-style">
            <input class="form-styling" style="display: none" type="text" name="type" placeholder="" value="signup"/>
            <input class="form-styling" style="display: none" type="text" name="verification" placeholder="" value="not verificated"/>
            <label for="userRole" class="role-label">Role</label>

            <select id="userRole" class="form-styling role-select" name="userRole">
                <option>seller</option>
                <option>bidder</option>
            </select>

            <label for="balance" class="balance-label">Balance</label>
            <input id="balance" class="form-styling balance-input" type="number" name="balance"
                   step="1" min="100" max="50000" value="100" size="5" required/>
        </div>
        <div class="button-singup">
            <input class="btn-signup" type="submit" onclick="checkPasswordMatch()" value="Sign up">
        </div>
</form>
</body>
</html>
