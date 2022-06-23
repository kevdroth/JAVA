package ar.com.onwave.repository;

import ar.com.onwave.repository.model.EquipmentModel;

import javax.sql.DataSource;
import java.util.List;

public interface EquipmentRepository {
    List<EquipmentModel> findAllEquipments();
    List<EquipmentModel> findEquipment(String idEquipo);

}
