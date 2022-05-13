import data.Conexion;
import data.LineaDao;
import data.LineaDaoJDBC;
import domain.LineaDTO;

import java.sql.*;
import java.util.List;

public class TestMovistar {
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }

            LineaDao lineaDao = new LineaDaoJDBC(conexion);
            List<LineaDTO> lineas = lineaDao.select();
            for (LineaDTO linea : lineas){
                System.out.println("linea: " + linea);
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