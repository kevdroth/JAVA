package ar.com.onwave.cookiescontador.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //variable contador
        int contador = 0;

        //reviso si existe la cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie c : cookies){
                if (c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }

        //incremento el contador
        contador++;

        //agrego la respuesta al navegador
        Cookie c = new Cookie("contadorVisitas",Integer.toString(contador));

        //duracion de 1hs (3600seg)
        c.setMaxAge(3600);
        response.addCookie(c);

        //respondemos al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
    }
}
