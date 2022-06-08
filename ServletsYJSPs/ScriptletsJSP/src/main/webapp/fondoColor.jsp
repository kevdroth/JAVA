<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String fondo = request.getParameter("colorFondo");
    if (fondo == null || fondo.trim().equals("") ){
        fondo = "white";
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Cambio de Color</title>
</head>
<body bgcolor="<%=fondo%>">
<h1>JSP Cambio de Color</h1>
<br>
Color fondo aplicado: <%=fondo%>
<br>
<a href="index.html">Regresar al Inicio</a>
</body>
</html>