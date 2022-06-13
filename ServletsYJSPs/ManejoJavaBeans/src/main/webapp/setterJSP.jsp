<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Que modifica un JavaBeans</title>
</head>
<body>
<h1>JSP Que modifica un JavaBeans</h1>
<jsp:useBean id="rectangulo" class="ar.com.onwave.manejojavabeans.beans.Rectangulo" scope="session"/>
Modificamos los atributos:
<br>
<br>
<%
    int baseValor = 5;
    int alturaValor = 10;
%>
<jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>"/>
<jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"/>

Nuevo valor de Base: <%=baseValor%>
<br>
Nuevo valor de Altura: <%=alturaValor%>
<br>
<br>
<a href="index.jsp">Volver al Inicio</a>
</body>
</html>
