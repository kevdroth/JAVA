<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Alcance de Variables</title>
</head>
<body>
<h1>Alcance de Variables</h1>
<br>
Variable de alcance Request:
<br>
Base: ${rectanguloRequest.base}
<br>
Altura: ${rectanguloRequest.altura}
<br>
Area: ${rectanguloRequest.area}
<br>
<br>
Variable de alcance Session:
<br>
Base: ${rectanguloSesion.base}
<br>
Altura: ${rectanguloSesion.altura}
<br>
Area: ${rectanguloSesion.area}
<br>
<br>
Variable de alcance Application:
<br>
Base: ${rectanguloAplicacion.base}
<br>
Altura: ${rectanguloAplicacion.altura}
<br>
Area: ${rectanguloAplicacion.area}
<br>
<br>
<a href="${pageContext.request.contextPath}/index.jsp">Volver al Inicio</a>
</body>
</html>
