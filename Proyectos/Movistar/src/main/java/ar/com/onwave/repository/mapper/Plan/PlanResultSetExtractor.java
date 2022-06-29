package ar.com.onwave.repository.mapper.Plan;

import ar.com.onwave.repository.model.PlanModel;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlanResultSetExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        PlanModel planModel = new PlanModel();
        planModel.setIdPlan(resultSet.getLong(1));
        planModel.setNombre(resultSet.getString(2));
        planModel.setPrecio(resultSet.getDouble(3));
        planModel.setInternet(resultSet.getString(4));
        planModel.setMinutos(resultSet.getString(5));
        planModel.setSms(resultSet.getString(6));
        return planModel;
    }
}
