package herencia_ejemplo;

public class Estudiante extends Persona {
    // 2 atributos propios de tipo string y protegidos
    protected String nivelAcademico;
    protected String direccionEscuela;

    public Estudiante(String nombre, String rut, int edad, String nivelAcademico, String direccionEscuela) {
        // Uso de super para invocar al constructor de la clase base
        super(nombre, rut, edad);
        this.nivelAcademico = nivelAcademico;
        this.direccionEscuela = direccionEscuela;
    }

    @Override
    public String toString() {
        // Aprovechar al máximo el concepto de super (super.toString())
        return super.toString() + "\n  -> Estudiante [Nivel Académico: " + nivelAcademico + ", Dirección Escuela: " + direccionEscuela + "]";
    }

    @Override
    protected String metodo() {
        // Permite saber a qué clase pertenece el objeto que lo invoca
        return "Soy de la clase: " + this.getClass().getSimpleName();
    }
}
