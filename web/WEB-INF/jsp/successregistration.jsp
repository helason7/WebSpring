<%-- 
    Document   : successregistration
    Created on : Dec 13, 2017, 10:17:31 AM
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrasi berhasil</h1>
        <h3>${data.namaLengkap} </h3> 
        <p>
            <a href="${pageContext.request.contextPath}/login">Please Login</a>
        </p>
    </body>
</html>
