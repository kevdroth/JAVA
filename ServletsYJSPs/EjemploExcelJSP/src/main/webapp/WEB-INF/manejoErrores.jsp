<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manejo Errores</title>
</head>
<body>
<h1>Manejo Errores</h1>
<br>
Ocurrio una excepcion: <%=exception.getMessage()%>
<br>
<textarea name="ta1" id="ta1" cols="30" rows="5">
    <% exception.printStackTrace(new PrintWriter(out));%>
</textarea>
</body>
</html>
