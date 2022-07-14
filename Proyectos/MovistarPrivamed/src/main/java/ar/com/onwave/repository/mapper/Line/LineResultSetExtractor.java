package ar.com.onwave.repository.mapper.Line;

import ar.com.onwave.repository.model.LineModel;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LineResultSetExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        LineModel lineModel = new LineModel();
        lineModel.setIdLinea(resultSet.getLong(1));
        lineModel.setIdPlan(resultSet.getLong(2));
        lineModel.setNumero(resultSet.getString(3));
        return lineModel;
    }
}
