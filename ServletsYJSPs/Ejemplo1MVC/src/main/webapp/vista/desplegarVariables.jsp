<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Despliegue de Variables</title>
</head>
<body>
<h1>Despliegue de Variables</h1>
Variable en alcance de Request: ${mensaje}
<br>
<br>
Variable en alcance de Session:
<br>
<br>
Rectangulo:
<br>
Base: ${rectangulo.base}
<br>
Altura: ${rectangulo.altura}
<br>
Area: ${rectangulo.area}
<br>
<br>
<a href="${pageContext.request.contextPath}/index.jsp">Volver al Inicio</a>
</body>
</html>
