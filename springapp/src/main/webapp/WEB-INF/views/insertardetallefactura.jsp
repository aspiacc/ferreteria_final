<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
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
                    <a class="nav-link" href="<c:url value="listadofacturas.htm"/>">Listado de Facturas</a>
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
	<div align="center" style="width:50%; margin:auto" class="col text-center" class="bg-info text-white" >
		<h2>Nuevo Detalle</h2>
		<br>
		<form:form action="save" method="post" modelAttribute="detalle">
			<table border="2" class="table table-striped">
				<tr>
					<td>Importe:</td>
					<td><form:input path="importe" /></td>
				</tr>
				<tr>
					<td>Cantidad:</td>
					<td><form:input path="cantidad" /></td>
				</tr>
				<tr>
					<td>Precio Unitario:</td>
					<td><form:input path="precioUnitario" /></td>
				</tr>
				<tr>
					<td>IVA:</td>
					<td><form:input path="montoIva" /></td>
				</tr>
				<tr>
					<td>Precio Final:</td>
					<td><form:input path="precioFinal" /></td>
				</tr>				
				<tr>
					<td>Producto:</td>
					<td><form:input path="idProducto" /></td>
				</tr>
				<tr>
					<td>Factura:</td>
					<td><form:input path="idFactura" /></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center"><input class="btn btn-primary" type="submit" value="Guardar" ></td>
					
				</tr>
			</table>
		</form:form>
	</div>
	<div class="container">
  <div class="row">
    <div class="col text-center">
      <a class="btn btn-primary" class="row justify-content-center" href="<c:url value="formdetallefactura.htm"/>" role="button">Volver</a>
      <br>
      
    </div>
  </div>
</div>
	
<%-- 	<a href="<c:url value="formdetallefactura.htm"/>">Volver</a> --%>
</body>
</html>