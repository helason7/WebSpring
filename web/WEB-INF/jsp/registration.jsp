<%-- 
    Document   : registration
    Created on : Dec 13, 2017, 10:16:10 AM
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet">
        <script src="<c:url value='/resources/js/bootstraps.js'/>"  ></script>
        <title>Form Registration </title>
    </head>
    <body>

        <div align="center">  
            <legend>
                <h1>Form Registration</h1>
            </legend>    
        </div>
        <div class="container col-sm-4" style="padding: 40px;">
            <form:form action="register/save" modelAttribute="registerBean" method="POST" >
                <div class="form-group">
                    <form:label path="namaLengkap">Nama Lengkap</form:label>
                    <form:input path="namaLengkap" cssClass="form-control"/>
                </div>
                <!--div class="form-group"-->
                <form:label path="username">Username</form:label>
                <form:input path="username" cssClass="form-control"/> <br/>
                <form:label path="password">Password</form:label>
                <form:password path="password" cssClass="form-control"/><br/>
                <form:label path="phone">Phone</form:label>
                <form:input path="phone" cssClass="form-control"/> <br/>
                <form:label path="email">Email</form:label>
                <form:input path="email" cssClass="form-control"/> <br/>
                <form:label path="address">Alamat</form:label>
                <form:textarea path="address" cssClass="form-control"/><br/>
                <form:button name="submitButton" value="Submit" class="btn btn-primary" cssClass="form-control">Submit</form:button>
            </form:form>
            </div>
        </div> 
        </div>  
    </body>
</html>
