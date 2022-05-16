package ar.com.onwave.holamundospringdata.web;

import ar.com.onwave.holamundospringdata.dao.PersonaDao;
import ar.com.onwave.holamundospringdata.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Slf4j
@Controller
public class ControladorInicio {

    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaDao.findAll();

        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("personas",personas);
        return "index";
    }

}

