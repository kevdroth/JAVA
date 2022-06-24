package ar.com.onwave.repository.mapper.Equipment;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipmentRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int line) throws SQLException {
        EquipmentResultSetExtractor extractor = new EquipmentResultSetExtractor();
        return extractor.extractData(resultSet);
    }
}
