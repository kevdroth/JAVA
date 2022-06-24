package ar.com.onwave.repository;

import ar.com.onwave.repository.model.EquipmentModel;

import javax.sql.DataSource;
import java.util.List;

public interface EquipmentRepository {
    List<EquipmentModel> findAllEquipments();
    List<EquipmentModel> findEquipment(String idEquipo);
    void createEquipment(EquipmentModel equipmentModel);
    void deleteEquipment(String idEquipo);
    void updateEquipment(EquipmentModel equipmentModel, String idEquipo);
}
