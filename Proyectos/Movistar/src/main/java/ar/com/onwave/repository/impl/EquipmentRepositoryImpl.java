package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.EquipmentRepository;
import ar.com.onwave.repository.mapper.EquipmentRowMapper;
import ar.com.onwave.repository.model.EquipmentModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EquipmentRepositoryImpl implements EquipmentRepository {

    private final JdbcTemplate jdbcTemplate;
    private static final String SQL_SELECT = "SELECT id_equipo, registrado, imei_registrado, marca_trafica, modelo_trafica, imei_trafica, sim FROM equipo";
    private static final String SQL_SELECT_BY_ID = "SELECT id_equipo, registrado, imei_registrado, marca_trafica, modelo_trafica, imei_trafica, sim FROM equipo WHERE id_equipo = 1";

    public EquipmentRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EquipmentModel> findAllEquipments() {
        return jdbcTemplate.query(SQL_SELECT, new EquipmentRowMapper());
    }

    @Override
    public List<EquipmentModel> findEquipment(String idEquipo) {
        return jdbcTemplate.query(SQL_SELECT_BY_ID, new Object[]{idEquipo}, new EquipmentRowMapper());
    }
}
