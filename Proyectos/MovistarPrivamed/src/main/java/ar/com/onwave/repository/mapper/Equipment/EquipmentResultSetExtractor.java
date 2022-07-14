package ar.com.onwave.repository.mapper.Equipment;

import ar.com.onwave.repository.model.EquipmentModel;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipmentResultSetExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        EquipmentModel equipmentModel = new EquipmentModel();
        equipmentModel.setIdEquipo(resultSet.getLong(1));
        equipmentModel.setRegistrado(resultSet.getString(2));
        equipmentModel.setImeiRegistrado(resultSet.getString(3));
        equipmentModel.setMarcaTrafica(resultSet.getString(4));
        equipmentModel.setModeloTrafica(resultSet.getString(5));
        equipmentModel.setImeiTrafica(resultSet.getString(6));
        equipmentModel.setSim(resultSet.getString(7));
        return equipmentModel;
    }
}
