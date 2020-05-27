<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About my cakes</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="site-wrapper">
            <jsp:include page="Header.jsp"/>
            <div class="content-wrapper">
                <div class="container">
                    <div class="content-left">
                        <ul class="container-list">
                            <c:forEach var="i" items="${products}">
                                <li class="each-product">
                                    <div class="content">
                                        <div class="image">
                                            <a href="ProductDetailControl?productId=${i.id}"><img src="images/${i.picture}"></a>
                                        </div>
                                        <p class="product-tittle"><a href="ProductDetailControl?productId=${i.id}">${i.name}</a></p>
                                            ${i.shortDescription}
                                    </div>
                                </li>
                            </c:forEach>
                        </ul>
                        <form action="AboutControl" method="post">
                            <div class="paging">
                                <c:forEach begin="1" end="${maxPage}" var="i">
                                    <input type="submit" class="${i==pageIndex?"active":""}" name="pageIndex" value="${i}">
                                </c:forEach>
                            </div>
                        </form>
                    </div>
                    <jsp:include page="Right.jsp"/>
                </div>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
