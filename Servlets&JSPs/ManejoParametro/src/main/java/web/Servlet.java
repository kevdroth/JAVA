package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro de usuario es: " + usuario);
        out.print("<br/>");
        out.print("El parametro de contraseña es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
