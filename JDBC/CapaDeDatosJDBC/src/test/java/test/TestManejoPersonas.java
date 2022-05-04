package test;

import datos.*;
import domain.PersonaDTO;
import domain.UsuarioDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            /*PersonaDao personaDao = new PersonaDaoJDBC(conexion);
            List<PersonaDTO> personas = personaDao.select();
            for (PersonaDTO persona : personas){
                System.out.println("persona: " + persona);
            }*/

            UsuarioDao usuarioDao = new UsuarioDaoJDBC(conexion);
            List<UsuarioDTO> usuarios = usuarioDao.select();
            for (UsuarioDTO usuario : usuarios){
                System.out.println("usuario: " + usuario);
            }

            conexion.commit();
            System.out.println("Se hizo commit de la transaccion");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
