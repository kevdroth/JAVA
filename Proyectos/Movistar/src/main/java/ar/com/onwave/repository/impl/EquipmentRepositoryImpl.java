package ar.com.onwave.repository.impl;

import ar.com.onwave.repository.EquipmentRepository;
import ar.com.onwave.repository.mapper.EquipmentRowMapper;
import ar.com.onwave.repository.model.EquipmentModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class EquipmentRepositoryImpl implements EquipmentRepository {

    private JdbcTemplate jdbcTemplate;
    private static final String SQL_SELECT = "SELECT id_equipo, registrado, imei_registrado, marca_trafica, " +
            "modelo_trafica, imei_trafica, sim FROM equipo";
    private static final String SQL_SELECT_BY_ID = "SELECT id_equipo, registrado, imei_registrado, marca_trafica, " +
            "modelo_trafica, imei_trafica, sim FROM equipo WHERE id_equipo = ?";
    private static final String SQL_INSERT = "INSERT INTO equipo (registrado, imei_registrado, marca_trafica, modelo_trafica, " +
            "imei_trafica, sim) VALUES (?,?,?,?,?,?)";
    private static final String SQL_DELETE = "DELETE FROM equipo WHERE id_equipo = ?";
    private static final String SQL_UPDATE = "UPDATE equipo SET registrado = ?, imei_registrado = ?, marca_trafica = ?" +
            ", modelo_trafica = ?, imei_trafica = ?, sim = ? WHERE id_equipo = ?";

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

    @Override
    public void createEquipment(EquipmentModel equipmentModel) {
        jdbcTemplate.update(SQL_INSERT, new Object[]{equipmentModel.getRegistrado(), equipmentModel.getImeiRegistrado(),
                equipmentModel.getMarcaTrafica(), equipmentModel.getModeloTrafica(), equipmentModel.getImeiTrafica(),
                equipmentModel.getSim()});
    }

    @Override
    public void deleteEquipment(String idEquipo) {
        jdbcTemplate.update(SQL_DELETE, new Object[]{idEquipo});
    }

    @Override
    public void updateEquipment(EquipmentModel equipmentModel, String idEquipo) {
        jdbcTemplate.update(SQL_UPDATE, new Object[]{equipmentModel.getRegistrado(),
                equipmentModel.getImeiRegistrado(), equipmentModel.getMarcaTrafica(), equipmentModel.getModeloTrafica(),
                equipmentModel.getImeiTrafica(), equipmentModel.getSim(), idEquipo});
    }
}
