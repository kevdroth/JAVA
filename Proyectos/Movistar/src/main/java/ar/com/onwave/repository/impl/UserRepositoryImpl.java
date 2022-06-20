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

    private JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserModel> findAllUsers() {
        return this.jdbcTemplate.query("SELECT id_usuario as idUsuario, nombre as nombre FROM usuario", new BeanPropertyRowMapper(UserModel.class));
    }
}
