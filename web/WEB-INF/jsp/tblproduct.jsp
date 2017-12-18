<%-- 
    Document   : customer
    Created on : Dec 13, 2017, 2:50:05 PM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://v40.pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>  
        <!--
        <c:forEach var="c" items="${tblproduct}">
            <p>
                <a href="${c.id}"> ${c.productNama}</a> 
                <a href="${pageContext.request.contextPath}/order/add/${c.id}">Add to cart</a>
            </p>
        </c:forEach>
        -->
  <div class="py-5 bg-dark gradient-overlay"></div>
  <div class="">
    <div class="container-fluid">
      <div class="row bg-dark">
        <div class="p-0 col-md-4 col-6">
            <img src="<c:url value='/resources/capucino.jpg'/>" class="img-fluid"> </div>
        <div class="col-md-4 col-6 p-0">
            <img src="<c:url value='/resources/donat.jpg'/>" class="img-fluid"> </div>
        <div class="col-md-4 col-6 p-0">
            <img src="<c:url value='/resources/cucur.jpg'/>" class="img-fluid"> </div>
        <div class="col-md-4 col-6 p-0">
            <img src="<c:url value='/resources/pancake.jpg'/>" class="img-fluid"> </div>
        <div class="col-md-4 col-6 p-0">
            <img src="<c:url value='/resources/icecream.jpg'/>" class="img-fluid"> </div>
        <div class="col-md-4 col-6 p-0">
            <img src="<c:url value='/resources/pizza.jpg'/>" class="img-fluid"> </div>
      </div>
    </div>
  </div>
  <div class="p-5 gradient-overlay">
    <div class="container">
      <div class="row">
        <c:forEach var="c" items="${tblproduct}">
        <div class="p-3 align-self-center col-md-4">
          <div class="card">
            <div class="card-block p-5">
              <h1><sup>Rp</sup> ${c.harga} </h1>
              <h3>${c.productNama}</h3>
              <hr>
              <p>Perfect for small business and growing teams.&nbsp;</p>
              <a href="${pageContext.request.contextPath}/order/add/${c.id}" class="btn btn-dark">Saya Mau Ini</a>
            </div>
          </div>
        </div>
        </c:forEach>
      </div>
    </div>
  </div>
    </body>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</html>
