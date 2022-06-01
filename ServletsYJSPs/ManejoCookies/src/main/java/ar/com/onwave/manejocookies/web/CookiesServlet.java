package ar.com.onwave.manejocookies.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //visita por primera vez
        boolean nuevoUsuario = true;

        //Arreglo de cookies
        Cookie[] cookies = request.getCookies();

        //Busco si existe cookie que se haya creado antes
        if (cookies != null){
            for (Cookie c: cookies){
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    nuevoUsuario = false;
                    break;
                }
            }
        }

        String mensaje = null;
        if (nuevoUsuario == true){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        }
        else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: " + mensaje);
        out.close();
    }
}
