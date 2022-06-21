package ar.com.onwave.repository;

import ar.com.onwave.repository.model.EquipmentModel;

import java.util.List;

public interface EquipmentRepository {
    List<EquipmentModel> findAllEquipments();
}
