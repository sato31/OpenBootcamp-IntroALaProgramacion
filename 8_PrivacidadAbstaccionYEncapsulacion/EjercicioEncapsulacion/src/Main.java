// Para practicar la encapsulación:
// - Crear clase Persona.
// - Crear variables las privadas edad, nombre y telefono de la clase Persona.
// - Crear gets y sets de cada propiedad.
// - Crear un objeto persona en el main.
// - Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
//   por último muéstralas por consola.

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(28);
        persona1.setNombre("Oscar Sánchez");
        persona1.setTelefono("5552555255");

        System.out.println("Persona:\n" + " - Nombre: " + persona1.getNombre());
        System.out.println(" - Edad: " + persona1.getEdad() + "\n - Teléfono: " + persona1.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;


    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}