package data;

import domain.*;

import java.sql.*;
import java.util.List;

public interface LineaDao {
    public List<LineaDTO> select() throws SQLException;

    public int insert(LineaDTO persona) throws SQLException;

    public int update(LineaDTO persona) throws SQLException;

    public int delete(LineaDTO persona) throws SQLException;
}
