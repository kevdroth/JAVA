package test;

import data.UsuarioDAO;
import domain.Usuario;

public class TestUsuarioJDBC {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuarioNuevo = new Usuario("Juan","Perez");
        usuarioDAO.insertar(usuarioNuevo);

        /*Usuario usuarioModificado = new Usuario(1,"Juan Carlos","Perez");
        usuarioDAO.actualizar(usuarioModificado);

        Usuario usuarioEliminado = new Usuario(1);
        usuarioDAO.eliminar(usuarioEliminado);
         */
    }
}
