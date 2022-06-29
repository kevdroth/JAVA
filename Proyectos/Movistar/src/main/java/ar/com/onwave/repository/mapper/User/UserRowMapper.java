package ar.com.onwave.repository.mapper.User;

import ar.com.onwave.repository.mapper.Line.LineResultSetExtractor;
import ar.com.onwave.repository.model.UserModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        UserResultSetExtractor extractor = new UserResultSetExtractor();
        return extractor.extractData(resultSet);
    }
}
