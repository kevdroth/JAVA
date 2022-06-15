<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Equipos</title>
</head>
<body>
<h1>Equipos: </h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>REGISTRADO</th>
        <th>IMEI REGISTRADO</th>
        <th>MARCA TRAFICA</th>
        <th>MODELO TRAFICA</th>
        <th>IMEI TRAFICA</th>
        <th>SIM</th>
    </tr>
    <c:forEach var="equipos" items="${equipos}">
    <tr>
        <td>${equipos.idEquipos}</td>
        <td>${equipos.registrado}</td>
        <td>${equipos.imeiRegistrado}</td>
        <td>${equipos.marcaTrafica}</td>
        <td>${equipos.modeloTrafica}</td>
        <td>${equipos.imeiTrafica}</td>
        <td>${equipos.sim}</td>
        <br>
    </tr>
    </c:forEach>
</table>
</body>
</html>
