<%--
  Created by IntelliJ IDEA.
  User: vynchuk
  Date: 2/6/21
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="description" content="Ubay Create new Lot">
    <meta name="keywords" content="HTML, CSS, JS, Java, ucode, unitfactory, cbl, cblworld">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Create New Lot</title>
    <link rel="stylesheet" href="CSS/global.css">
    <link rel="stylesheet" href="CSS/reset.css">
</head>
<body id="body">

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

<div class="addLot">
    <div id="window" class="shadow-large">
        <div class="page-header addLot-header">Add lot</div>
        <form class="addLot-form" action="addLot" method="POST" name="form" enctype="multipart/form-data">

            <label for="photo">Photo</label>
            <input id="photo" class="button" type="file" name="photo" value="photo" required/>

            <label for="title">Title</label>
            <input id="title" class="button" type="text" name="title" required/>

            <label for="category">Category</label>
            <select id="category" class="button" name="category">
                <option>flowers</option>
                <option>tools</option>
                <option>pictures</option>
                <option>others</option>
            </select>

            <label for="startPrice">Start price</label>
            <input id="startPrice" class="button" type="number" name="startPrice" required
                   min=".01" step=".01" max="10000"/>

            <label for="bidStep">Bid step</label>
            <input id="bidStep" class="button" type="number" name="bidStep" required
                   min=".01" step=".01" max="1000"/>

            <label for="description">Description</label>
            <textarea id="description" class="button" type="text" name="description"
                      rows="4" maxlength="200" placeholder="200 symbols"></textarea>

            <label for="duration">Duration - <span id="durationNumber">1 day</span></label>
            <input id="duration" type="range" name="duration" min="1" max="7" value="1"/>

            <div class="addLot-controls">
                <input class="button" type="submit" value="Add lot">
                <div>
                    <a class="abutton" href="#" onclick="window.history.back()">back</a>
                    <a class="abutton" href="${pageContext.request.contextPath}/main">main</a>
                </div>
            </div>
        </form>
    </div>
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
