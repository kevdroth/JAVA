<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL y Variables Implicitas</title>
</head>
<body>
<h1>EL y Variables Implicitas</h1>
<ul>
    <li>Nombre de la Aplicacion: ${pageContext.request.contextPath}</li>
    <li>Navegador del Cliente: ${header["User-Agent"]}</li>
    <li>ID Session: ${cookie.JSESSIONID.value}</li>
    <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
    <li>Valor Parametro: ${param.usuario}</li>
</ul>
<br>
<br>
<a href="index.jsp">Volver al Inicio</a>
</body>
</html>
