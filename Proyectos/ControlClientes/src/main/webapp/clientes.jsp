<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Control de Clientes</title>
</head>
<body>
<h1>Control de Clientes</h1>
<ul>
    <!-- recorro la lista de clientes, las guardo en la variable cliente -->
    <c:forEach var="cliente" items="${clientes}">
        <li>${cliente.idCliente} ${cliente.nombre} ${apellido} ${cliente.saldo}</li>
    </c:forEach>
</ul>
</body>
</html>
