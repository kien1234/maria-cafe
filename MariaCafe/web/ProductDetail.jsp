<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cake detail</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="site-wrapper">
            <jsp:include page="Header.jsp"/>
            <div class="content-wrapper">
                <div class="container">
                    <div class="content-left">
                        <div class="section cake">
                            <p class="product-name">${product.name}</p>
                            <div class="content">
                                <div class="cake-img">
                                    <img src="images/${product.picture}">
                                </div>
                                ${product.detailDescription}
                                <p><div class="span">Price: <span class="color">${product.price}$</span></div></p>
                            </div>
                        </div>
                    </div>
                    <jsp:include page="Right.jsp"/>
                </div>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>