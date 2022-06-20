package ar.com.onwave.equipos.web;

import ar.com.onwave.equipos.domain.Equipos;
import ar.com.onwave.equipos.domain.Planes;
import ar.com.onwave.equipos.service.EquiposDaoJDBC;
import ar.com.onwave.equipos.service.PlanesDaoJDBC;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Equipos> equipos = new EquiposDaoJDBC().listar();
        request.setAttribute("equipos", equipos);
        request.getRequestDispatcher("equipos.jsp").forward(request, response);

/*        List<Planes> planes = new PlanesDaoJDBC().listar();
        request.setAttribute("planes", planes);
        request.getRequestDispatcher("planes.jsp").forward(request, response);*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
