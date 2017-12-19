<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--
<div class="container">
    <div class="jumbotron">
        <h1>Spring Online Shop</h1> 
        <p>Super Shop You Cannot Deny</p> 
        <h3><a href="${pageContext.request.contextPath}/order/show">Cart: ${cart.carts.size()}</a></h3>
        <div><a href="${pageContext.request.contextPath}">Home</a></div>
        <c:if test="${not empty sessionScope.user}">
            <div><a href="${pageContext.request.contextPath}/logout">Logout</a></div>
        </c:if>
    </div>
</div>
--> <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <div class="container">
      <div class="navbar-brand" ><i class="fa d-inline fa-lg fa-coffee"></i><b>  WarCops</b></div>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent" aria-controls="navbar2SupportedContent" aria-expanded="false"
        aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
      <div class="collapse navbar-collapse text-center justify-content-end" id="navbar2SupportedContent">
        <ul class="navbar-nav">
          <li class="nav-item">
            <div class="nav-link"><i class="fa d-inline fa-lg fa-user-circle-o"></i>
              
                hello,  <c:if test="${not empty sessionScope.user}"> ${user.username}
                </c:if>
                </div>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/logout"><i class="fa d-inline fa-lg fa-sign-out"></i> Keluar</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/order/show"> <i class="fa d-inline fa-lg fa-shopping-cart"></i> Keranjang:     ${carts}</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>