<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ejemplo Inclusion Dinamica</title>
</head>
<body>
<h1>Ejemplo Inclusion Dinamica</h1>
<br>
<jsp:include page="paginas/recursoPublico.jsp"/>
<br>
<jsp:include page="WEB-INF/recursoPrivado.jsp">
    <jsp:param name="colorFondo" value="yellow"/>
</jsp:include>
</body>
</html>