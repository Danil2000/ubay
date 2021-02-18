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
    <meta charset="utf-8">
    <meta name="description" content="Ubay">
    <meta name="keywords" content="HTML, CSS, JS, Java, ucode, unitfactory, cbl, cblworld">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Ubay</title>
    <link rel="stylesheet" href="CSS/global.css">
    <link rel="stylesheet" href="CSS/reset.css">
    <script src="../js/start.js"></script>
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

    <div class="form-start-style">
    <h1>Welcome</h1>
    <p>Please choose sign in or sign up</p>
    <a href="/ubay/signIn"> Sign In</a>
    <a href="/ubay/signUp"> Sign Up</a>
    </div>

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
