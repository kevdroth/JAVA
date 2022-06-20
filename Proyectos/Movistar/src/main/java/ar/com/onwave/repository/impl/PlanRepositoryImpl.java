package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.PlanRepository;
import ar.com.onwave.repository.model.PlanModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanRepositoryImpl implements PlanRepository {

    private JdbcTemplate jdbcTemplate;

    public PlanRepositoryImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<PlanModel> findAllPlans() {
        return jdbcTemplate.query("SELECT id_plan, nombre, precio, internet, minutos, sms FROM plan", new BeanPropertyRowMapper(PlanModel.class));
    }
}
