package ar.com.onwave.ejemplo1mvc.controlador;

import ar.com.onwave.ejemplo1mvc.modelo.Rectangulo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. Proceso parametros

        //2. Creo los JavaBeans
        Rectangulo rec = new Rectangulo(6,3);

        //3. Agrego el JavaBeans a algun alcance (scoope, app, session)
        request.setAttribute("mensaje","Saludos desde el Servlet");

        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rec);

        //4. Redirecciono a la vista seleccionada
        RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);
    }
}
