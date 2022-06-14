<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Ejemplo MVC 2</title>
</head>
<body>
<h1>Ejemplo MVC 2</h1>
<br>
<div style="color: red">
  ${mensaje}
</div>
<br>
<a href="${pageContext.request.contextPath}/ServletControlador">Link al Servlet Controlador SIN parametros</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/ServletControlador?accion=agregarVariables">Link al Servlet Controlador para agregar las variables</a>
<br>
<br>
<a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">Link al Servlet Controlador para listar variables</a>
</body>
</html>
