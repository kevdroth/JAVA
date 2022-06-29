package ar.com.onwave.repository.mapper.User;

import ar.com.onwave.repository.model.UserModel;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserResultSetExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        UserModel userModel = new UserModel();
        userModel.setIdUsuario(resultSet.getLong(1));
        userModel.setNombre(resultSet.getString(2));
        return userModel;
    }
}
