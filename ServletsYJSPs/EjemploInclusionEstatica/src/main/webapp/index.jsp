<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ejemplo Inclusion Estatica</title>
</head>
<body>
<h1>Ejemplo Inclusion Estatica</h1>
<br>
<ul>
    <li> <%@include file="paginas/noticias1.html" %> </li>
    <li> <%@include file="paginas/noticias2.jsp" %> </li>
</ul>
</body>
</html>