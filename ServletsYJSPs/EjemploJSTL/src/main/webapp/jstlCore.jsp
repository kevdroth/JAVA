<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL Core</title>
</head>
<body>
<h1>JSTL Core</h1>
<!-- Defino variables -->
<c:set var="nombre" value="Ernesto"/>
<!-- Despliego valor variables -->
Variable Nombre: <c:out value="${nombre}"/>
<br>
<br>
Variable con Codigo HTML:
<c:out value="<h4>Hola</h4>" escapeXml="false"/>
<br>
<br>
<!-- Codigo condicionado (if) -->
<c:set var="bandera" value="true"/>
<c:if test="${bandera}">
    La bandera es verdadera
</c:if>
<br>
<!-- Codigo condicionado (switch) -->
<c:if test="${param.opcion != null}">
    <c:choose>
        <c:when test="${param.opcion} == 1">
            <br>
            Opcion 1 seleccionada
        </c:when>
        <c:when test="${param.opcion} == 2">
            <br>
            Opcion 2 seleccionada
        </c:when>
        <c:otherwise>
            <br>
            Opcion proporcionada desconocida: ${param.opcion}
        </c:otherwise>
    </c:choose>
</c:if>
<br>
<br>
<!-- Itero un arreglo -->
<%
    String nombres[] = {"Claudia", "Pedro", "Juan"};
    request.setAttribute("nombres", nombres);
%>
Lista de Nombres:
<br>
<ul>
    <c:forEach var="persona" items="${nombres}">
        <li>${persona}</li>
    </c:forEach>
</ul>
<a href="index.jsp">Volver al Inicio</a>
</body>
</html>
