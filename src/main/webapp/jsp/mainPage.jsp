<%--
  Created by IntelliJ IDEA.
  User: vynchuk
  Date: 2/6/21
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="description" content="Ubay">
    <meta name="keywords" content="ubay, ucode, unit factory">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Ubay</title>
    <link rel="stylesheet" href="CSS/global.css">
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
                    <li><a style="color: #ffffff" href="#">About Us</a></li>
                    <li><a style="color: #ffffff" href="#">FAQ</a></li>
                    <li><a style="color: #ffffff" href="#">Contacts Us</a></li>
                    <li><a style="color: #ffffff" href="/ubay/createLot">Add New Lot</a></li>
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
            <li><a href="/ubay/">Home</a></li>
        </ul>
    </nav>

    <%-- Filters --%>
    <main class="page">
        <aside class="filters">
            <div class="sort">
                <p>Sort:</p>
                <select class="sort-select">
                    <option value="1">none</option>
                    <option value="2">cheap first</option>
                    <option value="3">expensive first</option>
                </select>
            </div>

            <form  method="POST" action="/ubay/filter" enctype="multipart/form-data" name="form">
                <p>Category:</p>
                <select class="sort-select" name="category">
                    <option value="flowers">flowers</option>
                    <option value="tools">tools</option>
                    <option value="pictures">pictures</option>
                    <option value="others">others</option>
                </select>
                <input class="button button_search" type="submit" value="Filter" >
            </form>

            <div class="search">
            <p>Search:</p>
            <form  method="POST" action="/ubay/search" enctype="multipart/form-data" name="form">
                <label for="searchByTitle">Title</label>
                <input id="searchByTitle" class="form-styling" type="text"
                       name="title"/>
                <input class="button button_search" type="submit" value="Search" >
            </form>
        </div>
        </aside>
        <%-- End Filters --%>

        <%-- Conteiner For Lots --%>
        <div class="container">
            <c:forEach items="${empList}" var="lots">
                <!-- <c:choose>
                    <c:when test="${lots.active=='1'}"> -->
                    <div class="wrapper">
                            <a class="auction-card" href="${lots.lotId}">
                                <div><img style="width: 100%;" class="auction_image_index" src="${lots.image}"></div>
                                <div class="auction-card-title">${lots.title}</div>
                                <div class="auction-card-inactive">Expired</div>
                                <div class="auction-card-value">${lots.startPrice}</div>
                                <!-- </c:when>

                     </c:choose> -->
                            </a>
                    </div>
            </c:forEach>

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
