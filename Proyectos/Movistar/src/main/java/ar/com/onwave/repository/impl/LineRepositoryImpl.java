package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.LineRepository;
import ar.com.onwave.repository.mapper.Line.LineRowMapper;
import ar.com.onwave.repository.model.LineModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LineRepositoryImpl implements LineRepository {
    private JdbcTemplate jdbcTemplate;
    private static final String SQL_SELECT = "SELECT linea.id_linea, linea.numero, plan.nombre" +
            "FROM linea INNER JOIN plan ON linea.id_plan=plan.id_plan;";
    private static final String SQL_SELECT_BY_ID = "SELECT numero FROM linea WHERE id_linea = ?";
    private static final String SQL_INSERT = "INSERT INTO linea (id_plan, numero) VALUES (?,?)";
    private static final String SQL_DELETE = "DELETE FROM linea WHERE id_linea = ?";
    private static final String SQL_UPDATE = "UPDATE linea SET id_plan = ?, numero = ? WHERE id_equipo = ?";

    public LineRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<LineModel> findAllLines() {
        return jdbcTemplate.query(SQL_SELECT, new LineRowMapper());
    }

    @Override
    public List<LineModel> findLine(Long idLinea) {
        return jdbcTemplate.query(SQL_SELECT_BY_ID, new Object[]{idLinea}, new LineRowMapper());
    }

    @Override
    public void createLine(LineModel lineModel) {
        jdbcTemplate.update(SQL_INSERT, new Object[]{lineModel.getIdPlan(), lineModel.getNumero()});
    }

    @Override
    public void deleteLine(Long idLinea) {
        jdbcTemplate.update(SQL_DELETE, new Object[]{idLinea});
    }

    @Override
    public void updateLine(LineModel lineModel, Long idLinea) {
        jdbcTemplate.update(SQL_UPDATE, new Object[]{lineModel.getIdPlan(), lineModel.getNumero(), idLinea});
    }
}
