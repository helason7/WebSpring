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
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='https://v40.pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css'/>" type="text/css">

        <style>  
            .background {
                background-image: url("<c:url value='/resources/capucino.jpg'/>");
            }
        </style>
        <title>Form Registration </title>
    </head>
    <body>
        <div class="background">
            <div class="py-5 text-center opaque-overlay">
                <div class="container py-5">
                    <div class="row">
                        <div class="col-md-12 text-white">
                            <h1 class="display-3 mb-4">Hello, Coffee Lover!</h1>
                            <p class="lead mb-5">Selamat datang di WarCops, tempat ngopi paling mantap di seluruh dunia. Karna kami hanya menyediakan kopi-kopi terbaik disini. Nikmati kopi yang cocok dengan selera Anda, karna kepuasan Anda adalah tanggung jawab kami. Awali hari dengan secangkir
                                kopi, biar ga salah paham! </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="py-5">
            <div class="container">
                <div class="row">
                    <div class="align-self-center col-md-6 text-dark">
                        <img src="<c:url value='/resources/362-adorable-coffee-cup-.gif'/>" class="w-75 float-center">
                    </div>
                    <div class="col-md-6" id="book">
                        <div class="card">
                            <div class="card-body p-5">
                                <h3 class="pb-3">Registrasi</h3>
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
                </div>
            </div>
        </div>
</body>
</html>
