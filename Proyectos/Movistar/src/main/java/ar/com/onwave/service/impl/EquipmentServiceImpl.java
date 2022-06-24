package ar.com.onwave.service.impl;

import ar.com.onwave.repository.EquipmentRepository;
import ar.com.onwave.repository.model.EquipmentModel;
import ar.com.onwave.service.EquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentServiceImpl(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public List<EquipmentModel> getEquipments() {
        return this.equipmentRepository.findAllEquipments();
    }

    @Override
    public List<EquipmentModel> getEquipment(String idEquipo) {
        return this.equipmentRepository.findEquipment(idEquipo);
    }

    @Override
    public void addEquipment(EquipmentModel equipmentModel) {
        this.equipmentRepository.createEquipment(equipmentModel);
    }

}
