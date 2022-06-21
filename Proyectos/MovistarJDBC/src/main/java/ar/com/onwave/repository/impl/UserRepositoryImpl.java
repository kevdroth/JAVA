package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.UserRepository;
import ar.com.onwave.repository.model.UserModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final static String SQL_SELECT = "SELECT id_usuario, nombre FROM usuario";
    private JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserModel> findAllUsers() {
        return this.jdbcTemplate.query(SQL_SELECT, new BeanPropertyRowMapper(UserModel.class));
    }
}
