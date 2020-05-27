<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="site-wrapper">
            <jsp:include page="Header.jsp"/>
            <div class="content-wrapper">
                <div class="container">
                    <div class="content-left">
                        <div class="section intro">
                            <div class="content">
                                <div class="img">
                                    <a href="IntroductionControl"><img src="images/${information.picture}"/></a>
                                </div>
                                    <p class="content-title"><a href="IntroductionControl">${information.title}</a></p>
                                ${information.shortDescription}
                            </div>
                        </div>
                        <div class="section">
                            <div class="content">
                                <ul>
                                    <c:forEach items="${twoProductNew}" var="i" varStatus="status">
                                        <li class="product">
                                            <div class="img"><a href="ProductDetailControl?productId=${i.id}"><img src="images/${i.picture}"></a></div>
                                            <div class="product-tittle"><a href="ProductDetailControl?productId=${i.id}">${i.name}</a></div>
                                            <p>${i.shortDescription}</p>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>
                        <div class="section intro">
                            <div class="content">
                                <div class="content-title">Visit my cafe</div>
                                <br/>
                                <p>${information.shortDescription}</p>
                                <p>${information.address}</p>
                                <p>Phone: ${information.tel}</p>
                            </div>
                        </div>
                        <div class="section intro">
                            <div class="content">
                                Kind regards<br/>
                                <div class="signature">Maria Bagnarelli</div>
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
