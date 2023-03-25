package post.work.sesion4.sesion4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import post.work.sesion4.sesion4.model.Persona;
import post.work.sesion4.sesion4.service.AgendaService;

import javax.validation.Valid;

@Controller
public class PersonaController {

    private AgendaService agendaService;

    @Autowired
    public PersonaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping({"/","index"}) //Sesión7
    public String formularioRegistro(Model model){
        model.addAttribute("persona", new Persona());
        model.addAttribute("listaPersonas", agendaService.listarPersonasService());
        return "index";
    }

    @PostMapping("/registro") //Sesión7
    public ModelAndView registra(@Valid Persona persona){
        agendaService.guardarPersonaService(persona);

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listaPersonas", agendaService.listarPersonasService());
        return mav;
    }


}
