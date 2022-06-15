package ar.com.onwave.equipos.service;

import ar.com.onwave.equipos.datos.Conexion;
import ar.com.onwave.equipos.domain.Planes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlanesDaoJDBC {
    private static final String SQL_SELECT = "SELECT * FROM planes";
    private static final String SQL_SELECT_BY_ID = "SELECT nombre, precio, internet, minutos, sms WHERE id_planes = ?";
    private static final String SQL_UPDATE = "UPDATE planes SET nombre=?, precio=?, internet=?, minutos=?, sms=? WHERE id_planes = ?";
    private static final String SQL_DELETE = "DELETE FROM planes WHERE id_planes=?";
    private static final String SQL_INSERT = "INSERT INTO planes (nombre, precio, internet, minutos, sms) VALUES (?,?,?,?,?)";

    public List<Planes> listar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Planes plan = null;
        List<Planes> planes = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idPlanes = rs.getInt("id_planes");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                String internet = rs.getString("internet");
                String minutos = rs.getString("minutos");
                String sms = rs.getString("sms");

                plan = new Planes (idPlanes, nombre, precio, internet, minutos, sms);
                planes.add(plan);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return planes;
    }
}
