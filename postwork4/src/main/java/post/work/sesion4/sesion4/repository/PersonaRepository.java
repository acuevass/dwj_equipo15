package post.work.sesion4.sesion4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import post.work.sesion4.sesion4.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}