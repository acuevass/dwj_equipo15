package post.work.sesion4.sesion4.repository;

import org.springframework.stereotype.Repository;
import post.work.sesion4.sesion4.model.Persona;
import post.work.sesion4.sesion4.service.FormateadorNumeroService;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@Repository
public class AgendaRepository {

    //Sesión6
    //private Set<Persona> personas = new TreeSet<>();

    //Sesión7
    private static final SortedSet<Persona> personas = new TreeSet<>();
    private final FormateadorNumeroService formateadorNumeroService;
    public AgendaRepository (FormateadorNumeroService formateadorNumeroService){
        this.formateadorNumeroService = formateadorNumeroService;
    }
    public Persona guardarPersona(Persona persona) {
        if (persona == null) {
//            return "Error al guardar contacto";
            System.out.println("Error al guardar contacto");
        }
        personas.add(persona);
        System.out.println("Persona guardada con exito!");
//        return (Persona) persona;
        return persona;
    }

    public Set<Persona> listarContactos() {
        return personas;
    }
}
