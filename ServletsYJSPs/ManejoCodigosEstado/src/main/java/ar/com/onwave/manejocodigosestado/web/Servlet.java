package ar.com.onwave.manejocodigosestado.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuarioOk = "Juan";
        String passwordOk = "123";

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        if (usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Password: " + password);
            out.print("<h1>");
        }
        else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
}
