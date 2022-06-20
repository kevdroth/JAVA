package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.PlanRepository;
import ar.com.onwave.repository.model.PlanModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PlanRepositoryImpl implements PlanRepository {

    final String SQL_SELECT = "SELECT id_plan, nombre, precio, internet, minutos, sms FROM plan";
    final String SQL_INSERT = "INSERT INTO plan (nombre, precio, internet, minutos, sms) VALUES (?, ?, ?, ?, ?)";

    private JdbcTemplate jdbcTemplate;

    public PlanRepositoryImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<PlanModel> findAllPlans() {
        return jdbcTemplate.query(SQL_SELECT, new BeanPropertyRowMapper(PlanModel.class));
    }

    @Override
    public int addPlan(PlanModel planModel) {
        return jdbcTemplate.update(SQL_INSERT, "nombre","precio","internet","minutos","sms");
    }

}
