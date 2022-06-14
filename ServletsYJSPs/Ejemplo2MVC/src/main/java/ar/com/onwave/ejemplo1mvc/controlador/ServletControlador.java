package ar.com.onwave.ejemplo1mvc.controlador;

import ar.com.onwave.ejemplo1mvc.modelo.Rectangulo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
        String accion = request.getParameter("accion");

        //2. Creo los JavaBeans
        Rectangulo recRequest = new Rectangulo(2,1);
        Rectangulo recSesion = new Rectangulo(4,3);
        Rectangulo recAplicacion = new Rectangulo(6,5);

        //3. Agrego el JavaBeans a algun alcance (scoope, app, session)

        //Reviso la accion
        if ("agregarVariables".equals(accion)){
            //Alcance request (se elimina al regresar al inicio)
            request.setAttribute("rectanguloRequest", recRequest);
            //Alcance sesion
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSesion", recSesion);
            //Alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);

            //Agrego un mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas");

            //4. Redirecciono al JSP de index
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else if ("listarVariables".equals(accion)) {
            //4. Redirecciono al JSP que despliega las Variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }
        else{
            //4. Redirecciono al JSP del inicio
            request.setAttribute("mensaje", "Accion no proporcionada/desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
