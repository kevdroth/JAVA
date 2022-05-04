package test;

import data.UsuarioDAO;
import domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class TestUsuarioJDBC {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        List<Usuario> usuarios = usuarioDAO.seleccionar();
        for (Usuario usuario : usuarios){
            System.out.println("usuario. " + usuario);
        }

        /*Usuario usuarioNuevo = new Usuario("Juan","Perez");
        usuarioDAO.insertar(usuarioNuevo);*/

        /*Usuario usuarioModificado = new Usuario(1,"Juan Carlos","Perez");
        usuarioDAO.actualizar(usuarioModificado);*/

        /*Usuario usuarioEliminado = new Usuario(1);
        usuarioDAO.eliminar(usuarioEliminado);*/
    }
}
