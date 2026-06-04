package herencia_ejemplo;

// Aplico final ya que es un "caso muy particular" y se entiende que es el nivel más especializado
public final class EstudianteDeportista extends Estudiante {
    // 2 atributos propios (privados)
    private String deporteQuePractica;
    private int horasEntrenamiento;

    public EstudianteDeportista(String nombre, String rut, int edad, String nivelAcademico, String direccionEscuela, String deporteQuePractica, int horasEntrenamiento) {
        // Uso de super para inicializar atributos heredados
        super(nombre, rut, edad, nivelAcademico, direccionEscuela);
        this.deporteQuePractica = deporteQuePractica;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    @Override
    public String toString() {
        // Aprovechar el concepto de super (super.toString())
        return super.toString() + "\n    -> EstudianteDeportista [Deporte: " + deporteQuePractica + ", Horas Entrenamiento: " + horasEntrenamiento + " hrs]";
    }
}
