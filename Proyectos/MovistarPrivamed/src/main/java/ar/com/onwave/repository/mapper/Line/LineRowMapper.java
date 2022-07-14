package ar.com.onwave.repository.mapper.Line;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LineRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        LineResultSetExtractor extractor = new LineResultSetExtractor();
        return extractor.extractData(resultSet);
    }
}
