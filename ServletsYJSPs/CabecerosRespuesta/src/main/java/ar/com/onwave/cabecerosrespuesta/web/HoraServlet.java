package ar.com.onwave.cabecerosrespuesta.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh","1");
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora Actualizada' HH:mm:ss");
        String horaConFormato = formateador.format(fecha);
        PrintWriter out = response.getWriter();
        out.print(horaConFormato);
        out.close();
    }
}
