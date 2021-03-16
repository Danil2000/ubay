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
    <meta charset="utf-8">
    <meta name="description" content="Ubay">
    <meta name="keywords" content="HTML, CSS, JS, Java, ucode, unitfactory, cbl, cblworld">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="CSS/global.css">
    <link rel="stylesheet" href="CSS/reset.css">
    <title>Sign Up</title>
</head>
<body>

<header class="header">
    <div class="header-top">
        <div class="header-logo">
            <span>UBAY</span>
            </span>
        </div>
        <div class="header-menu">
            <ul>
                <li><a style="color: #ffffff" href="/ubay">Home</a></li>
                <li><a style="color: #ffffff" href="#">About Us</a></li>
                <li><a style="color: #ffffff" href="#">FAQ</a></li>
                <li><a style="color: #ffffff" href="#">Contacts Us</a></li>
            </ul>
        </div>
        <div id="header-login-first" class="header-login">
            <a style="color: #ffffff" class="abutton" href="/ubay/signIn">Sign in</a>
        </div>
        <div id="header-login-second" class="header-login" style="display: none">
            <a id="authorizedLogin" class="abutton" href=""></a>
            <a style="color: #ffffff" class="abutton" href="/logout">Sign out</a>
        </div>
    </div>
</header>

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
        <div>
            <p>Or <a href="/ubay/signIn">Sign In</a> </p>
        </div>
</form>
<footer>
    <div class="footer-back"></div>
    <div class="footflexbox page">
        <div class="copyright footbox">
            <p>Copyright &copy; 2021 | Ubay Ucode | All Rights Reserved</p>
        </div>
        <div class="terms footbox">
            <p>Terms of Service | Privacy Policy</p>
        </div>
    </div>
</footer>

</body>
</html>
