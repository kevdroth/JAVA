<%@page errorPage="WEB-INF/manejoErrores.jsp" %>
<%@page import="ar.com.onwave.ejemploexceljsp.util.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition","inline;filename=" + nombreArchivo);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Reporte de Excel</title>
</head>
<body>
<h1>Reporte de Excel</h1>
    <br/>
    <table>
        <tr>
            <th>Curso</th>
            <th>Descripcion</th>
            <th>Fecha</th>
        </tr>
        <tr>
            <td>1. Fundamentos de Java</td>
            <td>Aprender la sintaxis basica de Java</td>
            <td><%=Conversiones.format(new Date())%></td>
        </tr>
        <tr>
            <td>2. Programacion con Java</td>
            <td>Poner en practica conceptos de la programacion orientada a objetos</td>
            <td><%=Conversiones.format(new Date())%></td>
        </tr>
    </table>
</body>
</html>