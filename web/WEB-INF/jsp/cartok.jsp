<%-- 
    Document   : cartok
    Created on : Dec 15, 2017, 2:02:59 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='https://v40.pingendo.com/assets/bootstrap/bootstrap-4.0.0-beta.1.css'/>" type="text/css">

        <title>JSP Page</title>
    </head>
    <body>
          <jsp:include page="header.jsp"/>  
        <div class="py-5">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <a class="navbar-brand" ><i class="fa d-inline text-muted fa-cart-arrow-down fa-2x"></i><b class="text-muted">  Isi Keranjang Anda: ${cart.carts.size()}</b></a>
                        <table class="table table-responsive table-hover">
                            <thead>
                                <tr>
                                    <th class="table-primary">Kode Produk</th>
                                    <th class="table-secondary">Nama Produk</th>
                                    <th class="table-danger text-center">Harga</th>
                                    <th class="table-warning text-center">Qty</th>
                                    <th class="table-success text-center">Action</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="c" items="${cart.carts.values()}">
                                <tr>
                                    <td class="px-5">${c.id}</td>
                                    <td class="px-5">${c.productNama}</td>
                                    <td class="text-right px-5">${c.harga}</td>
                                    <td>
                                            <input class="col-sm form-control form-control-sm text-right" placeholder="0" min="0" type="number">
                                    </td>
                                    <td class="text-muted px-5">
                                        <button class="btn btn-primary btn-sm"> <i class="fa d-inline fa-2x fa-level-up"></i><b class="">  Ubah Pesanan</b> </button>
                                        <button class="btn btn-danger btn-sm"> <i class="fa d-inline fa-2x fa-frown-o"></i><b class="">  Hapus Pesanan</b> </button>
                                    </td>
                                </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <h1 class="text-muted">Total Pembayaran : </h1>
            </div>
        </div>
        <div class="py-5">
            <div class="container">
                <div class="row">
                    <div class="align-self-center col-md-6 text-dark">
                        <img scr="" src="<c:url value='/resources/362-adorable-coffee-cup-.gif'/>" class="w-25 float-left">
                        <h1 class="text-center text-md-left display-3">Pesan Tempat</h1>
                        <p class="lead text-nowrap">Sekarang kalao mau pesen tampat bisa Online lho!</p>
                    </div>
                    <div class="col-md-6" id="book">
                        <div class="card">
                            <div class="card-body p-5">
                                <h3 class="pb-3">Reservasi</h3>
                                <form action="https://formspree.io/YOUREMAILHERE">
                                    <div class="form-group"> <label>Nama</label>
                                        <input class="form-control" placeholder="Untuk reservasi tempat"> </div>
                                    <div class="form-group"> <label>Jam</label>
                                        <input type="time" class="form-control"> </div>
                                    <div class="form-group"> <label>Jumlah Orang</label>
                                        <input type="number" class="form-control" placeholder="0" min="0"> </div>
                                    <button type="submit" class="btn mt-2 btn-outline-dark">Selesai</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <!--
            <h1>Hello World!</h1>
                    <h3><a href="#">Cart: ${cart.carts.size()}</a></h3>
    <c:forEach var="c" items="${cart.carts.values()}">
        <label>Product Name: ${c.productNama}</label></br>
        <label>Harga: ${c.harga}</label></br>
        <label>Stok: ${c.stok}</label></br>
    </c:forEach>
</body>
    -->
</html>
