<%@ include file="/WEB-INF/views/include.jsp" %>
<!DOCTYPE html>
<html lang="en">


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
  
  
  <title><fmt:message key="title"/></title>
  
<style>
body {
	font-family: "Lato", sans-serif;
     }
#main {
	transition: margin-left .5s;
	padding: 16px;
}

@media screen and (max-height: 450px) {
	.sidenav {
		padding-top: 15px;
	}
	.sidenav a {
		font-size: 18px;
	}
}
</style>
<nav class="navbar navbar-expand-lg navbar-light bg-light" style="background-color: teal;">
        <a class="navbar-brand" href="#">Ferreteria21</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Ventas <span class="sr-only">(current)</span></a>
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
  <div class="container-fluid">
        <h1>Facturación Ferretería Siglo 21 <small>
                <h6>Factura de compra</h6>
            </small></h1>
    </div>
    <div style="width:900px; padding:3px;">
        <div class="container-fluid" style="width:245px; background:rgb(250, 250, 250); float:left;">
            <div class="align-items-md-center">
                De Los Latinos 8555 <br>
                X5008 <br>
                Cordoba <br>
                Tel: 0810-555-0202 <br>
            </div>
        </div>
        <div class="container-fluid" style="width:500px; background:rgb(252, 250, 250); float:right;"
            class="align-items-md-center">
            <div>
                N° Factura: 0000-00001 <br>
                Fecha de Emision: 20/11/2019 <br>
                Responsable Inscripto: CUIL 20-175446321-1 <br>

            </div>
        </div>
    </div>
    <br>
    <br>
    <br>
    <br>
    <br>
 <%--    <h1><fmt:message key="heading"/></h1> --%>
<%--     <p><fmt:message key="greeting"/> --%>
<table class="table table-striped" style="background-position: center;">
        <thead>
            <tr>
                <th scope="col">Codigo</th>
<!--                 <th scope="col">Descripción</th> -->
                <th scope="col">Cantidad</th>
                <th scope="col">Precio Unitario</th>
                <th scope="col">IVA</th>
                <th scope="col">Subtotal</th>
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach items="${model.detalles}" var="det">
            <tr> 
                <td> <c:out value="${det.detalle_factura_id}"/> </td>
<%--                 <td> <c:out value="${det.descripcion}"/> </td> --%>
                <td> <c:out value="${det.cantidad}"/> </td>
                <td>$ <c:out value="${det.precioUnitario}"/> </td>
                <td>% <c:out value="${det.montoIva}"/> </td>
                <td>$ <c:out value="${det.precioFinal}"/> </td>
                <td><span class="badge badge-pill badge-success">OK</span></td>
            </tr>
			</c:forEach>
        </tbody>
    </table>
    <br>
    <a class="btn btn-success" href="<c:url value="insertardetallefactura.htm"/>" role="button">Insertar Nuevo Detalle</a>
    <br>
    <br>
    <div>
    Fecha de Vencimiento: 
    <script>
var f = new Date();
document.write(f.getDate() + "/" + (f.getMonth() +1) + "/" + f.getFullYear());
</script>
    </div>
    
<%--      <a href="<c:url value="insertardetallefactura.htm"/>">Insertar Nuevo Detalle</a> --%>
    
    <br>
<%--     <a href="<c:url value="insertarnuevodetalle.htm"/>">Insertar NUEVO</a> --%>
     
    
<!--    <h3>Lista de Detalles</h3>
    <c:forEach items="${model.detalles}" var="det">
      <c:out value="${det.detalle_factura_id}"/> 
      	<i>$<c:out value="${det.importe}"/></i><br><br>
    </c:forEach>
    <br>
    <a href="<c:url value="insertardetallefactura.htm"/>">Insertar Nuevo Detalle</a>
    <br>-->
  </body>
</html>