package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.EquipmentRepository;
import ar.com.onwave.repository.model.EquipmentModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EquipmentRepositoryImpl implements EquipmentRepository {

    private final static String SQL_SELECT = "SELECT id_equipo, registrado, imei_registrado, marca_trafica, modelo_trafica, imei_trafica, sim FROM equipo";
    private final JdbcTemplate jdbcTemplate;

    public EquipmentRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EquipmentModel> findAllEquipments() {
        return this.jdbcTemplate.query(SQL_SELECT, new BeanPropertyRowMapper(EquipmentModel.class));
    }

}
