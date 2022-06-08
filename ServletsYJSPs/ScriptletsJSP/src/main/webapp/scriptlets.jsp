<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP con Scriptlets</title>
</head>
<body>
<h1>JSP con Scriptlets</h1>
<br>
<%-- Scriptlet para enviar info al navegador --%>
<%
    out.print("Saludos desde un Scriptlet");
%>
<%-- Scriptlet para manipular objetos implicitos --%>
<%
    String nombreAplicacion = request.getContextPath();
    out.print("Nombre de la aplicacion: " + nombreAplicacion);
%>
<br>
<%-- Scriptlet con codigo condicionado (Mala practica) --%>
<%
    if (session != null && session.isNew()){
%>
La sesion es nueva
<%
}else if(session != null){
%>
La sesion NO es nueva
<%
    }
%>
<a href="index.html">Volver al Inicio</a>
</body>
</html>
