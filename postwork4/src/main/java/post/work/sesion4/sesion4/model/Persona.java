package post.work.sesion4.sesion4.model;

public class Persona {
    private String nombre;
    private int edad;
    private String numTelefono;

    public Persona(String nombre, int edad, String numTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.numTelefono = numTelefono;
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
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numTelefono='" + numTelefono + '\'' +
                '}';
    }
}
