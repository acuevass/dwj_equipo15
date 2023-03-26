package post.work.sesion4.sesion4.service;

import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import post.work.sesion4.sesion4.model.Persona;
import post.work.sesion4.sesion4.repository.AgendaRepository;
import post.work.sesion4.sesion4.repository.PersonaRepository;

import java.util.List;
import java.util.Set;

@Service
public class AgendaService {

    private ValidadorNumeroService validadorNumeroService;
    private FormateadorNumeroService formateadorNumeroService;

    //private AgendaRepository agendaRepository;
    private PersonaRepository personaRepository;
    @Autowired
    public AgendaService(ValidadorNumeroService validadorNumeroService, FormateadorNumeroService formateadorNumeroService, PersonaRepository personaRepository)
        {
        this.validadorNumeroService = validadorNumeroService;
        this.formateadorNumeroService = formateadorNumeroService;
        this.personaRepository = personaRepository;

    }

    public Persona guardarPersonaService(Persona persona) {

        if (!validadorNumeroService.contieneCaracteresValidos(persona.getNumTelefono())) {
            return null;
        }

        persona.setNumTelefono(formateadorNumeroService.limpiaCaracteres(persona.getNumTelefono()));
        return personaRepository.save(persona);
    }

    public List<Persona> listarPersonasService() {
        return personaRepository.findAll(Sort.by("nombre"));
    }

}