<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="title" /></title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Nuevo Detalle</h2>
		<form:form action="save" method="post" modelAttribute="detalle">
			<table border="1">
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
					<td>ID Producto:</td>
					<td><form:input path="idProducto" /></td>
				</tr>
				<tr>
					<td>ID Factura:</td>
					<td><form:input path="idFactura" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
	<a href="<c:url value="formdetallefactura.htm"/>">Volver</a>
</body>
</html>