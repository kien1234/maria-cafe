<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="header-wrapper">
            <div class="container">
                <div class="title-wrapper">
                    <div class="title">Maria Bagnarelli's Cafe</div>
                    <div class="subtitle">Welcome to my website</div>
                </div>
                <div class="navbar">
                    <div class="container">
                        <ul class="nav" id="menuBar">
                            <li><a class="${status==1?"text":""}" ${status==1?"":"href=\"HomeControl\""}>Home</a></li>
                            <li><a class="${status==2?"text":""}" ${status==2?"":"href=\"AboutControl\""}>About my cakes</a></li>
                            <li><a class="${status==3?"text":""}" ${status==3?"":"href=\"InformationControl\""}>Find Maria's Cafe</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
