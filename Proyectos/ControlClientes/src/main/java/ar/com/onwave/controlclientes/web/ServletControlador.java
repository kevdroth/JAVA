package ar.com.onwave.controlclientes.web;

import ar.com.onwave.controlclientes.datos.ClienteDaoJDBC;
import ar.com.onwave.controlclientes.dominio.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//llamada de index
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //recupero la info y la mando a otra JSP
        List<Cliente> clientes = new ClienteDaoJDBC().listar(); //regreso todos los clientes de la lista
        System.out.println("Clientes: " + clientes);
        request.setAttribute("cliente",clientes);

        //mando los objetos response y request al jsp
        request.getRequestDispatcher("clientes.jsp").forward(request, response);


    }

}
