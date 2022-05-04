package datos;

import domain.UsuarioDTO;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDao {

    public List<UsuarioDTO> select() throws SQLException;

    public int insert (UsuarioDTO usuarioDTO) throws SQLException;

    public int update (UsuarioDTO usuarioDTO) throws SQLException;

    public int delete (UsuarioDTO usuarioDTO) throws SQLException;
}
