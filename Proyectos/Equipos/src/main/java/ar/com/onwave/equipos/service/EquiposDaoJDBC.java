package ar.com.onwave.equipos.service;

import ar.com.onwave.equipos.datos.Conexion;
import ar.com.onwave.equipos.domain.Equipos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquiposDaoJDBC {

    public static final String SQL_SELECT = "SELECT * FROM equipos";
    public static final String SQL_SELECT_BY_ID = "SELECT registrado, imei_registrado, marca_trafica, modelo_trafica, imei_trafica, sim FROM equipos WHERE id_equipos=?";
    public static final String SQL_UPDATE = "UPDATE equipos SET registrado=?, imei_registrado=?, marca_trafica=?, modelo_trafica=?, imei_trafica=?, sim=? WHERE id_equipos=?";
    public static final String SQL_DELETE = "DELETE FROM equipos WHERE id_equipos=?";
    public static final String SQL_INSERT = "INSERT INTO equipos (registrado, imei_registrado, marca_trafica, modelo_trafica, imei_trafica, sim) VALUES (?,?,?,?,?,?)";

    public List<Equipos> listar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipos equipo;
        List<Equipos> equipos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idEquipos = rs.getInt("id_equipos");
                String registrado = rs.getString("registrado");
                String imeiRegistrado = rs.getString("imei_registrado");
                String marcaTrafica = rs.getString("marca_trafica");
                String modeloTrafica = rs.getString("modelo_trafica");
                String imeiTrafica = rs.getString("imei_trafica");
                String sim = rs.getString("sim");

                equipo = new Equipos(idEquipos, registrado, imeiRegistrado, marcaTrafica, modeloTrafica, imeiTrafica, sim);
                equipos.add(equipo);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return equipos;
    }

    public Equipos encontrar(Equipos equipos){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1,equipos.getIdEquipos());
            rs = stmt.executeQuery();
            rs.absolute(1);

            String registrado = rs.getString("registrado");
            String imeiRegistrado = rs.getString("imei_registrado");
            String marcaTrafica = rs.getString("marca_trafica");
            String modeloTrafica = rs.getString("modelo_trafica");
            String imeiTrafica = rs.getString("imei_trafica");
            String sim = rs.getString("sim");

            equipos.setRegistrado(registrado);
            equipos.setImeiRegistrado(imeiRegistrado);
            equipos.setMarcaTrafica(marcaTrafica);
            equipos.setModeloTrafica(modeloTrafica);
            equipos.setImeiTrafica(imeiTrafica);
            equipos.setSim(sim);

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return equipos;
    }

    public int insertar(Equipos equipos){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,equipos.getRegistrado());
            stmt.setString(2,equipos.getImeiRegistrado());
            stmt.setString(3,equipos.getMarcaTrafica());
            stmt.setString(4,equipos.getModeloTrafica());
            stmt.setString(5,equipos.getImeiTrafica());
            stmt.setString(6,equipos.getSim());
            rows = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int actualizar(Equipos equipos){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,equipos.getRegistrado());
            stmt.setString(2,equipos.getImeiRegistrado());
            stmt.setString(3,equipos.getMarcaTrafica());
            stmt.setString(4,equipos.getModeloTrafica());
            stmt.setString(5,equipos.getImeiTrafica());
            stmt.setString(6,equipos.getSim());
            stmt.setInt(7,equipos.getIdEquipos());
            rows = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int eliminar(Equipos equipos){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,equipos.getIdEquipos());
            rows = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
