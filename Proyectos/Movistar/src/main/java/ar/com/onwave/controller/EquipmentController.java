package ar.com.onwave.controller;

import ar.com.onwave.repository.model.EquipmentModel;
import ar.com.onwave.service.EquipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/equipments")
    public List<EquipmentModel> getEquipments() {
        return this.equipmentService.getEquipments();
    }

    @GetMapping("/equipment/{id_equipo}")
    public List<EquipmentModel> getEquipment(@PathVariable(name = "id_equipo") String idEquipo) {
        return equipmentService.getEquipment(idEquipo);
    }

    @PostMapping("/add")
    public void addEquipment(@RequestBody EquipmentModel equipmentModel) {
        equipmentService.addEquipment(equipmentModel);
    }
}