<%-- Agrego una declaracion JSP --%>
<%!
    //Declaro variable con su metodo GET
    private String usuario = "Alberto";

    public String getUsuario(){
        return this.usuario;
    }

    //Declaro contador visitas
    private int contadorVisitas = 1;

%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Uso de Declaraciones con JSPs</title>
</head>
<body>
<h1>Uso de Declaraciones con JSPs</h1>
Valor de usuario por medio del atributo: <%=this.usuario%>
<br>
Valor de usuario por medio del metodo: <%=getUsuario()%>
<br>
Contador visitas: <%=contadorVisitas++%>
</body>
</html>