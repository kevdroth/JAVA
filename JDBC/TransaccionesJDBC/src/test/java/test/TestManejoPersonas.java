package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;

import java.sql.*;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Mauro");
            cambioPersona.setApellido("Nuñe");
            cambioPersona.setEmail("mnuñe@gmail.com");
            cambioPersona.setTelefono("1175846314");
            personaJdbc.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Barro");
            nuevaPersona.setEmail("cbarro@gmail.com");
            nuevaPersona.setTelefono("1152463514");
            personaJdbc.insertar(nuevaPersona);

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
