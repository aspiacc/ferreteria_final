<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
<%--     <p><fmt:message key="greeting"/> --%>
    <h3>Lista de Detalles</h3>
    <c:forEach items="${model.detalles}" var="det">
      <c:out value="${det.detalle_factura_id}"/> 
      	<i>$<c:out value="${det.importe}"/></i><br><br>
    </c:forEach>
    <br>
    <a href="<c:url value="insertardetallefactura.htm"/>">Insertar Nuevo Detalle</a>
    <br>
  </body>
</html>