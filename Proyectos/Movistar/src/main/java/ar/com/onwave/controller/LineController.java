package ar.com.onwave.controller;

import ar.com.onwave.repository.model.LineModel;
import ar.com.onwave.service.LineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/line")
public class LineController {

    private final LineService lineService;

    public LineController(LineService lineService) {
        this.lineService = lineService;
    }

    @GetMapping("/getAll")
    public List<LineModel> getLines() {
        return lineService.getLines();
    }

    @GetMapping("/get/{id_linea}")
    public List<LineModel> getLine(Long idLinea) {
        return lineService.getLine(idLinea);
    }

    @PostMapping("/add")
    public void addLine(LineModel lineModel) {
        lineService.addLine(lineModel);
    }

    @GetMapping("remove/{id_linea}")
    public void removeLine(Long idLinea) {
        lineService.removeLine(idLinea);
    }

    @PostMapping("/update/{id_linea}")
    public void modifyLine(LineModel lineModel, Long idLinea) {
        lineService.modifyLine(lineModel, idLinea);
    }
}
