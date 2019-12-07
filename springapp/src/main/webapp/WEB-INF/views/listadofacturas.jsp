<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title><fmt:message key="title" /></title>
<style>
.error {
	color: red;
}
</style>
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="background-color: teal;">
        <a class="navbar-brand" href="<c:url value="formdetallefactura.htm"/>">Ferreteria21</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Ventas </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Listado de Facturas<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Articulos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Clientes</a>
                </li>
            </ul>
        </div>
    </nav>
</head>
<body>
	<div align="center">
		<h2>Listado de Facturas</h2>
		
	</div>
	<table class="table table-striped" style="background-position: center;">
        <thead>
            <tr>
                
                <th scope="col">Codigo</th>
                <th scope="col">Fecha Emision</th>
                <th scope="col">Subtotal</th>
                <th scope="col">Estado</th>
                <th scope="col">aca va el budget</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                 <c:forEach items="${factura}" var="fac">
                <td> <c:out value="${fac.factura_id}"/> </td>
                <td> <c:out value="${fac.fechaEmision}"/> </td>
                <td> <c:out value="${fac.factSubTotal}"/> </td>
                <td> <c:out value="${fac.estado}"/> </td>
                
                <td><span class="badge badge-pill badge-success">OK</span></td>
                 </c:forEach>
            </tr>

        </tbody>
    </table>
	<br>
	<br>
	<div class="container">
  <div class="row">
    <div class="col text-center">
      <a class="btn btn-primary" class="row justify-content-center" href="<c:url value="formdetallefactura.htm"/>" role="button">Volver</a>
      <br>
      
    </div>
  </div>
</div>
</body>
</html>