package post.work.sesion4.sesion4.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import post.work.sesion4.sesion4.model.Persona;
import post.work.sesion4.sesion4.repository.AgendaRepository;

import java.util.Set;

@Service
public class AgendaService {

    private ValidadorNumeroService validadorNumeroService;
//    private FormateadorNumeroService formateadorNumeroService;
    private AgendaRepository agendaRepository;
    @Autowired
    public AgendaService(ValidadorNumeroService validadorNumeroService, AgendaRepository agendaRepository){
        this.validadorNumeroService = validadorNumeroService;
        this.agendaRepository = agendaRepository;
    }

    public Persona guardarPersonaService(Persona persona){
//        persona.setNumTelefono(formateadorNumeroService.limpiaCaracteres(persona.getNumTelefono()));
//        persona.setNumTelefono(formateadorNumeroService.formateaNumero(persona.getNumTelefono()));

        String numTelefono = validadorNumeroService.limpiaNumero(persona.getNumTelefono());
        return agendaRepository.guardarPersona(persona);
    }

    public Set<Persona> listarPersonasService(){
        return agendaRepository.listarContactos();
    }
}
