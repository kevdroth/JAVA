package test;

import java.sql.*;
import java.sql.DriverManager;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");  Solo en algunos casos
            Connection conexion = DriverManager.getConnection(url,"root","admin");
            Statement instruccion = conexion.createStatement(); //definicion sentencia
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona"; //sentencia a ejecutar
            ResultSet resultado = instruccion.executeQuery(sql); //ejecucion de sentencia
            while (resultado.next()){ //iteracion con cada dato, si es que hay
                System.out.print("ID Persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
