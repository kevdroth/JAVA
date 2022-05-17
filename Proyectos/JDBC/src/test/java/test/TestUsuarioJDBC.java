package test;

import data.Conexion;
import data.UsuarioJDBC;
import domain.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestUsuarioJDBC {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConection();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            UsuarioJDBC usuarioJDBC = new UsuarioJDBC(conexion);
            Usuario usuarioNuevo = new Usuario("Kevin","0987");
            usuarioJDBC.insertar(usuarioNuevo);

            Usuario usuarioModificado = new Usuario(2,"Juan","1234");
            usuarioJDBC.actualizar(usuarioModificado);

            /*Usuario usuarioEliminado = new Usuario(1);
            usuarioJDBC.eliminar(usuarioEliminado);

            List<Usuario> usuarios = null;
            try {
                usuarios = usuarioJDBC.seleccionar();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
                System.out.println("Rollback");
            }
            for (Usuario usuario : usuarios){
                System.out.println("usuario. " + usuario);
            }*/

            conexion.commit();
            System.out.println("Se hizo commit");

        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
