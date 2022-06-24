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
    public List<EquipmentModel> getEquipment(Long idEquipo) {
        return this.equipmentRepository.findEquipment(idEquipo);
    }

    @Override
    public void addEquipment(EquipmentModel equipmentModel) {
        this.equipmentRepository.createEquipment(equipmentModel);
    }

    @Override
    public void removeEquipment(Long idEquipo) {
        this.equipmentRepository.deleteEquipment(idEquipo);
    }

    @Override
    public void modifyEquipment(EquipmentModel equipmentModel, Long idEquipo) {
        this.equipmentRepository.updateEquipment(equipmentModel, idEquipo);
    }

}
