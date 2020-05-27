<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Share Page</title>
        <link href="css/share.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="content-right">
            <div class="share-box">
                <div class="share-header">Share this page</div>
                <div class="share-content">
                    <c:forEach var="share" items="${share}">
                        <div>
                            <a href="${share.url}">
                                <img src="images/${share.icon}"> 
                                Share on ${share.socialNetwork}
                            </a>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>