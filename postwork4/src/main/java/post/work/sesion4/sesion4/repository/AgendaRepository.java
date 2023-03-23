package post.work.sesion4.sesion4.repository;

import org.springframework.stereotype.Repository;
import post.work.sesion4.sesion4.model.Persona;

import java.util.Set;
import java.util.TreeSet;

@Repository
public class AgendaRepository {

    private Set<Persona> personas = new TreeSet<>();

    public Persona  guardarPersona(Persona persona) {
        if (persona == null) {
        	System.out.println("Error al guardar contacto");
        }
      personas.add(persona);
      System.out.println("Persona guardada con exito!");
      return persona;
    }

    public Set<Persona> listarContactos() {
        return personas;
    }

}