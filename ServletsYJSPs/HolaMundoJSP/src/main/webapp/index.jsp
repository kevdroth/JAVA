<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>HolaMundo JSPs</title>
</head>
<body>
<h1>HolaMundo JSPs</h1>
<ul>
    <li> <% out.print("Hola mundo con Scriplets"); %> </li>
    <li> ${"Hola mundo con Expression Languaje (EL)"} </li>
    <li> <%= "Hola mundo con Expresiones" %> </li>
    <li> <c:out value="Hola mundo con JSTL" /> </li>
</ul>
<br/>
<h1></h1>
</body>
</html>