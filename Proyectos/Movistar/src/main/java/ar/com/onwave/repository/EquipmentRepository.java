package ar.com.onwave.repository;

import ar.com.onwave.repository.model.EquipmentModel;

import javax.sql.DataSource;
import java.util.List;

public interface EquipmentRepository {
    List<EquipmentModel> findAllEquipments();
    List<EquipmentModel> findEquipment(Long idEquipo);
    void createEquipment(EquipmentModel equipmentModel);
    void deleteEquipment(Long idEquipo);
    void updateEquipment(EquipmentModel equipmentModel, Long idEquipo);
}
