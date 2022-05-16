package ar.com.onwave.holamundothymeleaf;

import ar.com.onwave.holamundothymeleaf.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "HolaMundo con Thymeleaf";

        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("1175862534");

        var persona2 = new Persona();
        persona2.setNombre("Camila");
        persona2.setApellido("Picazo");
        persona2.setEmail("cpizaco@mail.com");
        persona2.setTelefono("1158416329");

        /*var personas = new ArrayList();
        personas.add(persona);
        personas.add(persona2);*/

        var personas = Arrays.asList(persona,persona2);

        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo",saludo);
        /*model.addAttribute("persona",persona);*/
        model.addAttribute("personas", personas);
        return "index";
    }

}

