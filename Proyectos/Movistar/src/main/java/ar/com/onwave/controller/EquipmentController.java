package ar.com.onwave.controller;

import ar.com.onwave.repository.model.EquipmentModel;
import ar.com.onwave.service.EquipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/equipment")
public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/getAll")
    public List<EquipmentModel> getEquipments() {
        return this.equipmentService.getEquipments();
    }

    @GetMapping("/get/{id_equipo}")
    public List<EquipmentModel> getEquipment(@PathVariable(name = "id_equipo") String idEquipo) {
        return equipmentService.getEquipment(idEquipo);
    }

    @PostMapping("/add")
    public void addEquipment(@RequestBody EquipmentModel equipmentModel) {
        equipmentService.addEquipment(equipmentModel);
    }

    @GetMapping("remove/{id_equipo}")
    public void removeEquipment(@PathVariable(name = "id_equipo") String idEquipo) {
        equipmentService.removeEquipment(idEquipo);
    }

    @PostMapping("/update/{id_equipo}")
    public void modifyEquipment(@RequestBody EquipmentModel equipmentModel, @PathVariable(name = "id_equipo") String idEquipo) {
        equipmentService.modifyEquipment(equipmentModel, idEquipo);
    }
}