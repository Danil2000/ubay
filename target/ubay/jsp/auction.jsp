<%--
  Created by IntelliJ IDEA.
  User: vynchuk
  Date: 2/19/21
  Time: 12:32 дп
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="description" content="Ubay">
    <meta name="keywords" content="ubay, ucode, unit factory">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Ubay</title>
    <link rel="stylesheet" href="CSS/global.css">
    <link rel="stylesheet" href="CSS/auction.css">
    <link rel="stylesheet" href="CSS/reset.css">
</head>
<body>
<div class="help_footer">

    <header class="header">
        <div class="header-top">
            <div class="header-logo">
                <span>UBAY</span>
                </span>
            </div>
            <div class="header-menu">
                <ul>
                    <li><a style="color: #ffffff" href="/ubay/">Home</a></li>
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

    <nav class="breadcrumps">
        <ul class="page crumbs">
            <li><a class="abutton" href="${pageContext.request.contextPath}/main">Home</a></li>
            <li><a id="lotId">Lot #</a></li>
        </ul>
    </nav>

    <h3 id="title" class="page"></h3>

    <main class="page height">
        <div class="personal-section lot-img">
            <img src="" alt="image">
        </div>
        <div class="personal-section lot-description">
            <div class="personal-section__header">
                <div></div>
                <div>
                    <a style="color: #494d5f" href="#" onclick="viewProfile(this)"><span id="aboutProfile">seller</span>
                        <span class="seller-rating seller-rating fa fa-fw fa-star field-icon"></span><span id="rate" class="seller-rating"></span>
                    </a>
                    <a id="biddersFeedbacks" class="button" href="#"
                       onclick="viewFeedbacks(document.querySelector('#aboutProfile').innerHTML)">feedbacks</a>
                </div>
            </div>
            <p>Current price:&emsp;<span id="price"></span></p>
            <p>Start time:&emsp;<span id="startTime"></span></p>
            <p>Time left to closure:&emsp;<span id="timer"></span></p>
            <p id="description"></p>

            <div class="personal-section__header">
                <div>
                    <div id="newBit" style="display: none">
                        <label for="newPrice">New price </label>
                        <input id="newPrice" class="button" type="number" name="price"
                               min=".01" step=".01" max="10000" required>
                        <button id="butSubmit" type="button" class="button" onclick="send()" >Submit new bit</button>
                        <a class="button" href="#" onclick="location.reload()">Return</a>
                    </div>
                </div>
                <div id="addBit-buttons" style="display: none">
                    <a class="button" href="#" onclick="auctions.addBit()">Add bit</a>
                    <a class="button" href="#" onclick="window.history.back()">Return</a>
                </div>
            </div>

            <div class="personal-section__header" id="winner" style="display: none">
                <p>Winner: -</p>
                <p id="add-feedback-button" style="display: none">
                    <a class="button" href="#" onclick="auctions.addFeedback(this)">Add feedback</a>
                </p>
            </div>
            <p id="feedback"></p>
        </div>
    </main>

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
