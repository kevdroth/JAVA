<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>NOMBRE</th>
        <th>PRECIO</th>
        <th>INTERNET</th>
        <th>MINUTOS</th>
        <th>SMS</th>
    </tr>
    <c:forEach var="planes" items="${planes}">
        <tr>
            <td>${planes.idPlanes}</td>
            <td>${planes.nombre}</td>
            <td>${planes.precio}</td>
            <td>${planes.internet}</td>
            <td>${planes.minutos}</td>
            <td>${planes.sms}</td>
            <br>
        </tr>
    </c:forEach>
</table>
</body>
</html>
