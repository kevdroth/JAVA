package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.PlanRepository;
import ar.com.onwave.repository.mapper.Plan.PlanRowMapper;
import ar.com.onwave.repository.model.PlanModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanRepositoryImpl implements PlanRepository {
    private JdbcTemplate jdbcTemplate;
    private final static String SQL_SELECT = "SELECT id_plan, nombre, precio, internet, minutos, sms FROM plan";
    private final static String SQL_SELECT_BY_ID = "SELECT nombre, precio, internet, minutos, sms FROM plan WHERE id_plan = ?";
    private final static String SQL_DELETE = "DELETE FROM plan WHERE id_plan = ?";
    private final static String SQL_UPDATE = "UPDATE plan SET nombre = ?, precio = ?, internet = ?, minutos = ?, sms = ? WHERE id_plan = ?";
    private final static String SQL_INSERT = "INSERT INTO plan (id_plan, nombre, precio, internet, minutos, sms) VALUES (?,?,?,?,?,?)";

    public PlanRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<PlanModel> findAllPlans() {
        return jdbcTemplate.query(SQL_SELECT, new PlanRowMapper());
    }

    @Override
    public List<PlanModel> findPlan(Long idPlan) {
        return jdbcTemplate.query(SQL_SELECT_BY_ID, new PlanRowMapper());
    }

    @Override
    public void createPlan(PlanModel planModel) {
        jdbcTemplate.update(SQL_INSERT, new Object[]{planModel.getNombre(), planModel.getPrecio(), planModel.getInternet(),
        planModel.getMinutos(), planModel.getSms()});
    }

    @Override
    public void updatePlan(PlanModel planModel, Long idPlan) {
        jdbcTemplate.update(SQL_UPDATE, new Object[]{planModel.getNombre(), planModel.getPrecio(), planModel.getInternet(),
                planModel.getMinutos(), planModel.getSms(), idPlan});
    }

    @Override
    public void deletePlan(Long idPlan) {
        jdbcTemplate.update(SQL_DELETE, new PlanRowMapper());
    }
}
