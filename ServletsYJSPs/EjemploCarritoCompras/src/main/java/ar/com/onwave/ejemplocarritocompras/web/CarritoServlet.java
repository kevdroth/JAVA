package ar.com.onwave.ejemplocarritocompras.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //recupero o creo el objeto Http Session
        HttpSession sesion = request.getSession();

        //recupero lista de articulos agregados anteriormente
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //verifico si la lista de articulos existe
        if (articulos == null) {
            //inicializo la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //proceso parametro articulo
        String articuloNuevo = request.getParameter("articulo");

        //reviso y agrego articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        //imprimo la lista de articulos
        try (
                PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("<br>");
            //itero todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }

            //agrego link para ir al inicio
            out.print("<br>");
            out.print("<a href='/EjemploCarritoCompras_war_exploded'>Regresar al inicio</a>");
        }
    }
}
