package ar.com.onwave.repository.mapper.Plan;

import ar.com.onwave.repository.mapper.Line.LineResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlanRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        PlanResultSetExtractor extractor = new PlanResultSetExtractor();
        return extractor.extractData(resultSet);
    }
}
