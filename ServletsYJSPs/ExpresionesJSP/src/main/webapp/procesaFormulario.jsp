<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Procesa Formulario</title>
</head>
<body>
<h1>Resultado de Procesar el Formulario</h1>
Usuario: <%= request.getParameter("usuario") %>
<br>
Password: <%= request.getParameter("password") %>
<br>
<br>
<a href="index.html">Regresar al Inicio </a>
</body>
</html>
