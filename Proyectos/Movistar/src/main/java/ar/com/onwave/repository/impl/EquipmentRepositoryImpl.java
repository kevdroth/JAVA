package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.EquipmentRepository;
import ar.com.onwave.repository.model.EquipmentModel;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EquipmentRepositoryImpl implements EquipmentRepository {

    private final JdbcTemplate jdbcTemplate;

    public EquipmentRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EquipmentModel> findAllEquipments() {
        return this.jdbcTemplate.query("select id_equipos as idEquipo, registrado, imei_registrado as imeiRegistrado, marca_trafica as marcaTrafica, modelo_trafica as modeloTrafica, imei_trafica as imeiTrafica, sim from equipos", new BeanPropertyRowMapper(EquipmentModel.class));
    }

}
