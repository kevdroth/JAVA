package ar.com.onwave.manejocabeceros.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<br>");
        out.print("Metodo HTTP: " + metodoHttp);

        String uri = request.getRequestURI();
        out.print("<br>");
        out.print("URI solicitada: " + uri);

        //Todos los cabeceros
        out.print("<br>");
        out.print("<br>");
        Enumeration cabeceros = request.getHeaderNames();
        while (cabeceros.hasMoreElements()){
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + "</b>: ");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");
        }

        out.print("</body>");
        out.print("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
