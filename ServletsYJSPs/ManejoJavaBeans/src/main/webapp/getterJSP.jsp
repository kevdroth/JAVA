<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Que lee los valores de JavaBeans</title>
</head>
<body>
<h1>JSP Que lee los valores de JavaBeans</h1>
<jsp:useBean id="rectangulo" class="ar.com.onwave.manejojavabeans.beans.Rectangulo" scope="session" />
<br>
Valor Base: <jsp:getProperty name="rectangulo" property="base"/>
<br>
Valor Altura: <jsp:getProperty name="rectangulo" property="altura"/>
<br>
Valor del Area: <jsp:getProperty name="rectangulo" property="area"/>
<br>
<br>
<a href="index.jsp">Regresar al Inicio</a>
</body>
</html>
