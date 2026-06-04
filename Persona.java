package herencia_ejemplo;

public abstract class Persona {
    private String nombre;
    private String rut;
    // Atributo de tipo entero (sólo para ser usado por elementos de tipo Persona -> private)
    private int edad;

    public Persona(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [Nombre: " + nombre + ", RUT: " + rut + ", Edad: " + edad + "]";
    }

    protected abstract String metodo();
}
