package ar.com.onwave.repository.mapper;

import ar.com.onwave.repository.model.EquipmentModel;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipmentResultSetExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
        EquipmentModel equipmentModel = new EquipmentModel();
        equipmentModel.setIdEquipo(rs.getString(1));
        equipmentModel.setRegistrado(rs.getString(2));
        equipmentModel.setImeiRegistrado(rs.getString(3));
        equipmentModel.setMarcaTrafica(rs.getString(4));
        equipmentModel.setModeloTrafica(rs.getString(5));
        equipmentModel.setImeiTrafica(rs.getString(6));
        equipmentModel.setSim(rs.getString(7));
        return equipmentModel;
    }
}
