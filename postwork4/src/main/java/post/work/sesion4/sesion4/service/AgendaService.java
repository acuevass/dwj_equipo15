package post.work.sesion4.sesion4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import post.work.sesion4.sesion4.model.Persona;
import post.work.sesion4.sesion4.repository.AgendaRepository;

import java.util.Set;

@Service
public class AgendaService {

    private ValidadorNumeroService validadorNumeroService;
    private FormateadorNumeroService formateadorNumeroService;
    private AgendaRepository agendaRepository;

    @Autowired
    public AgendaService(ValidadorNumeroService validadorNumeroService, FormateadorNumeroService formateadorNumeroService, AgendaRepository agendaRepository) {
        this.validadorNumeroService = validadorNumeroService;
        this.formateadorNumeroService = formateadorNumeroService;
        this.agendaRepository = agendaRepository;
    }

    public String guardarPersonaService(Persona persona) {
        if (!validadorNumeroService.contieneCaracteresValidos(persona.getNumTelefono())) {
            return null;
        }
        persona.setNumTelefono(formateadorNumeroService.limpiaCaracteres(persona.getNumTelefono()));
        persona.setNumTelefono(formateadorNumeroService.formateaNumero(persona.getNumTelefono()));

        persona = new Persona(persona.getNombre(), persona.getEdad(), persona.getNumTelefono());
        return agendaRepository.guardarPersona(persona);
    }

    public Set<Persona> listarPersonasService() {
        return agendaRepository.listarContactos();
    }

}