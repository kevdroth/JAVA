package data;

import domain.*;
import java.sql.*;
import java.util.*;

import static data.Conexion.*;

public class UsuarioJDBC {

    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE (id_usuario = ?)";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE (id_usuario = ?)";

    public UsuarioJDBC(){

    }

    public UsuarioJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    public List<Usuario> seleccionar() throws SQLException {
         Connection conn = null;
         PreparedStatement stmt = null;
         ResultSet rs = null;
         Usuario usuario1 = null;
         List <Usuario> usuarios = new ArrayList<>();
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                usuario1 = new Usuario(idUsuario,usuario,password);
                usuarios.add(usuario1);
            }
        }finally {
            try {
                close(rs);
                close(stmt);
                if(this.conexionTransaccional == null){
                    close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,usuario.getUsuario());
            stmt.setString(2,usuario.getPassword());
            registros = stmt.executeUpdate();
        }finally {
            try {
                close(stmt);
                if(this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,usuario.getUsuario());
            stmt.setString(2,usuario.getPassword());
            stmt.setInt(3,usuario.getIdusuario());
            registros = stmt.executeUpdate();
        }finally {
            try {
                close(stmt);
                if(this.conexionTransaccional == null){
                    close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,usuario.getIdusuario());
            registros = stmt.executeUpdate();
        }finally {
            try {
                close(stmt);
                if(this.conexionTransaccional == null){
                    close(conn);
                }
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
