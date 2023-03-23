package post.work.sesion4.sesion4.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.Objects;

@Entity
@Table(name = "PERSONAS")
public class Persona implements Comparable<Persona> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre de la persona es obligatorio.")
    @Column(nullable = false, length = 60)
    private String nombre;
    private int edad;
    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$", message = "El teléfono debe tener un formato de ##-####-####")
    @Column(nullable = false)
    private String numTelefono;

    public Persona() {
    }

    public Persona(Long id, String nombre, int edad, String numTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.numTelefono = numTelefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numTelefono = " + numTelefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }


    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}
