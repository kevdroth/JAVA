package ar.com.onwave.service;

import ar.com.onwave.repository.model.EquipmentModel;

import java.util.List;

public interface EquipmentService {
    List<EquipmentModel> getEquipments();
    List<EquipmentModel> getEquipment(Long idEquipo);
    void addEquipment(EquipmentModel equipmentModel);
    void removeEquipment(Long idEquipo);
    void modifyEquipment(EquipmentModel equipmentModel, Long idEquipo);
}
