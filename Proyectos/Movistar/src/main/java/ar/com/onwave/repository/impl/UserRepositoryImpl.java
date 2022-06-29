package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.UserRepository;
import ar.com.onwave.repository.mapper.User.UserRowMapper;
import ar.com.onwave.repository.model.UserModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private JdbcTemplate jdbcTemplate;
    private final static String SQL_SELECT = "SELECT id_usuario, nombre FROM usuario";
    private final static String SQL_SELECT_BY_ID = "SELECT nombre FROM usuario WHERE id_usuario = ?";
    private final static String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";
    private final static String SQL_UPDATE = "UPDATE usuario SET nombre = ? WHERE id_usuario = ?";
    private final static String SQL_INSERT = "INSERT INTO usuario (nombre) VALUES (?)";

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserModel> findAllUsers() {
        return jdbcTemplate.query(SQL_SELECT, new UserRowMapper());
    }

    @Override
    public List<UserModel> findUser(Long idUsuario) {
        return jdbcTemplate.query(SQL_SELECT_BY_ID, new UserRowMapper());
    }

    @Override
    public void createUser(UserModel userModel) {
        jdbcTemplate.update(SQL_INSERT, new Object[]{userModel.getNombre()});
    }

    @Override
    public void deleteUser(Long idUsuario) {
        jdbcTemplate.update(SQL_DELETE, new UserRowMapper());
    }

    @Override
    public void updateUser(UserModel userModel, Long idUsuario) {
        jdbcTemplate.update(SQL_UPDATE, new Object[]{userModel.getNombre(), idUsuario});
    }
}
