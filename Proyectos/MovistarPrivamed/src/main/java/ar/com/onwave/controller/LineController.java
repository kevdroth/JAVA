package ar.com.onwave.controller;

import ar.com.onwave.repository.model.LineModel;
import ar.com.onwave.service.LineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Slf4j
public class LineController {

    @Autowired
    private LineService lineService;

    @GetMapping("/listarLineas")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        var lines = lineService.getLines();
        log.info("usuario que hizo login:" + user);
        model.addAttribute("lines", lines);
        return "lineas";
    }

    @GetMapping("/agregarLineas")
    public String agregar(LineModel lineModel){
        return "modificarLineas";
    }

    @PostMapping("/guardarLineas")
    public String guardar(@Valid LineModel lineModel, Errors errores){
        if(errores.hasErrors()){
            return "modificarLineas";
        }
        lineService.addLine(lineModel);
        return "redirect:/";
    }

    @GetMapping("/editarLineas/{idLinea}")
    public String editar(LineModel lineModel, Model model){
        lineModel = lineService.getLine(lineModel);
        model.addAttribute("lineModel", lineModel);
        return "modificarLineas";
    }

    @GetMapping("/eliminarLineas")
    public String eliminar(LineModel lineModel){
        lineService.removeLine(lineModel);
        return "lineas";
    }

}
