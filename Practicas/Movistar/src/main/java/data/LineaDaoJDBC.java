package data;

import domain.LineaDTO;

import javax.sound.sampled.Line;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static data.Conexion.close;

public class LineaDaoJDBC implements LineaDao {

    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT id_linea_x_usuario, id_usuario, id_linea, id_equipo, id_plan FROM movistar.linea_x_usuario";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    public LineaDaoJDBC() {

    }

    public LineaDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<LineaDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        LineaDTO lineaDTO = null;
        List<LineaDTO> lineas = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idLineaUsuario = rs.getInt("id_linea_x_usuario");
                String linea = rs.getString("id_linea");
                String usuario = rs.getString("id_usuario");
                String equipo = rs.getString("id_equipo");
                String plan = rs.getString("id_plan");
                lineaDTO = new LineaDTO(idLineaUsuario, linea, usuario, equipo, plan);
                lineas.add(lineaDTO);
            }
        } finally {
            try {
                close(rs);
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return lineas;
    }

    public int insert(LineaDTO linea) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, linea.getUsuario());
            stmt.setString(2, linea.getLinea());
            stmt.setString(3, linea.getEquipo());
            stmt.setString(4, linea.getPlan());
            registros = stmt.executeUpdate();
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return registros;
    }

    public int update(LineaDTO linea) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, linea.getUsuario());
            stmt.setString(2, linea.getLinea());
            stmt.setString(3, linea.getEquipo());
            stmt.setString(4, linea.getPlan());
            registros = stmt.executeUpdate();
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return registros;
    }

    public int delete(LineaDTO linea) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, linea.getIdLineaUsuario());
            registros = stmt.executeUpdate();
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
