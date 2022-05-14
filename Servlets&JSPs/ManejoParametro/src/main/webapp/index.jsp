<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario Servlet</title>
</head>
<body>
    <h1>Formulario Servlet</h1>
    <form name="form1" action="/ManejoParametro/Servlet" method="post">
        Usuario: <input type="text" name="usuario" />
        <br/>
        Passowrd: <input type="password" name="password" />
        <br/>
        <input type="submit" value="Enviar" />
    </form>
</body>
</html>