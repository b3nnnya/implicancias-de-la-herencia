package herencia_ejemplo;

public class EjemploDeHerencia {
    public static void main(String[] args) {
        System.out.println("--- Instanciación de Objetos ---");
        
        // Instancia de Estudiante
        Estudiante estudiante = new Estudiante(
            "Carlos Martinez", 
            "19283746-5", 
            21, 
            "Pregrado", 
            "Av. Universidad 123"
        );
        
        // Instancia de EstudianteDeportista
        EstudianteDeportista deportista = new EstudianteDeportista(
            "Ana Silva", 
            "20192837-K", 
            19, 
            "Pregrado", 
            "Av. Universidad 123", 
            "Natación", 
            4
        );
        
        // Como Persona es abstracta, no se puede instanciar directamente, 
        // pero podemos crear una clase anónima para cumplir estrictamente
        // con "instancia al menos 1 objeto de c/clase anterior"
        Persona personaAnonima = new Persona("Juan Perez", "12345678-9", 40) {
            @Override
            protected String metodo() {
                return "Soy de la clase: " + this.getClass().getSuperclass().getSimpleName() + " (Instancia Anónima)";
            }
        };

        System.out.println("\n--- Pruebas de toString() ---");
        System.out.println(personaAnonima.toString());
        System.out.println(estudiante.toString());
        System.out.println(deportista.toString());

        System.out.println("\n--- Pruebas de metodo() ---");
        System.out.println(personaAnonima.metodo());
        System.out.println(estudiante.metodo());
        System.out.println(deportista.metodo());
    }
}
