package post.work.sesion4.sesion4.repository;

import org.springframework.stereotype.Repository;
import post.work.sesion4.sesion4.model.Persona;

import java.util.Set;
import java.util.TreeSet;

@Repository
public class AgendaRepository {

    private Set<Persona> personas = new TreeSet<>();

    public String  guardarPersona(Persona persona) {
        if (persona == null) {
            return "Error al guardar contacto";
        }
        personas.add(persona);
        return "Persona guardada con exito!";
    }

    public Set<Persona> listarContactos() {
        return personas;
    }

}