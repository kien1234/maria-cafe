<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find Maria's Cafe</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="site-wrapper">
            <jsp:include page="Header.jsp"/>
            <div class="content-wrapper">
                <div class="container">
                    <div class="content-left">
                        <div class="section">
                            <p class="product-name">Find Maria's Cafe</p>
                            <div class="content">
                                <ul>
                                    <li class="item">
                                        <div class="product-tittle">Address and contact:</div>
                                        ${infor.address}
                                        <p><div class="span">Tel:</div><a>${infor.tel}</a></p>
                                        <p><div class="span">Email:</div><a>${infor.email}</a></p>
                                    </li>
                                    <li class="item">
                                        <div class="product-tittle">Opening hours:</div>
                                        ${infor.openingHours}
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="map">
                            <iframe src="${infor.map}" width="700" height="700" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                        </div>
                    </div>
                    <jsp:include page="Right.jsp"/>
                </div>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>