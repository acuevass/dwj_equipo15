package post.work.sesion4.sesion4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import post.work.sesion4.sesion4.model.Persona;
import post.work.sesion4.sesion4.service.AgendaService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/contactos")
public class PersonaController {

    private AgendaService agendaService;

    @Autowired
    public PersonaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping
    public ResponseEntity<List<Persona>> listarContactos(){
        return ResponseEntity.ok(agendaService.listarPersonasService());
    }

    @PostMapping
    public ResponseEntity<Persona> guardaPersona(@RequestBody Persona persona) {
        Persona resultado = agendaService.guardarPersonaService(persona);

        if (resultado == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(persona);
    }

}