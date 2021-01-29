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
    <title>Sign Up</title>
</head>
<body>
<form class="form-signup form-signup-left" id="formSignUp" action="/ubay/signUp" method="POST" name="form">
    <input class="form-styling" style="display: none" type="text" name="type" placeholder="" value="signup"/>
    <input class="form-styling" style="display: none" type="text" name="verification" placeholder="" value="not verificated"/>
    <label for="userRole">Role</label>
    <select id="userRole" class="form-styling" name="userRole">
        <option>seller</option>
        <option>bidder</option>
    </select>
    <label for="balance">Balance</label>
    <input id="balance" class="form-styling" type="number" name="balance"
           step="1" min="100" max="50000" value="100" size="5" required/>
    <label for="loginSignUp">Username</label>
    <input id="loginSignUp" class="form-styling" type="text" name="login" required autofocus/>
    <label for="email">Email</label>
    <input id="email" class="form-styling" type="email" name="email" required/>
    <label for="passwordSignUp">Password</label>
    <div>
        <input id="passwordSignUp" class="form-styling" type="password" name="password" autocomplete="on" required/>
        <span toggle="#passwordSignUp" class="fa fa-fw fa-eye field-icon toggle-password"></span>
    </div>
    <div>
        <label for="confirmpassword">Confirm password</label>
        <input id="confirmpassword" class="form-styling" type="password" name="confirmpassword" required
               autocomplete="on" />
        <span toggle="#confirmpassword" class="fa fa-fw fa-eye field-icon toggle-password"></span>
    </div>
    <input class="btn-signup" type="submit" onclick="checkPasswordMatch()" value="Sign up">
</form>
</body>
</html>
