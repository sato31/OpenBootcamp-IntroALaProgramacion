// Crea una clase Persona con las siguientes variables:
// - La edad
// - El nombre
// - El teléfono
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
// esta nueva clase tendrá la variable crédito solo para esa clase.
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
// el teléfono, el nombre y el crédito, tienes que darles valor y mostrarlas por pantalla.
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
// y con una variable salario que solo tenga la clase Trabajador.
public class Main {
    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente();
        Trabajador nuevoTrabajador = new Trabajador();

        nuevoCliente.edad = 28;
        nuevoCliente.nombre = "Oscar Sanchez";
        nuevoCliente.telefono = "5552555255";
        nuevoCliente.credito = 1000000.00;
        System.out.println("Datos del cliente: \n - Nombre: " + nuevoCliente.nombre +
                "\n - Edad: " + nuevoCliente.edad + "\n - Teléfono: " + nuevoCliente.telefono +
                "\n - Crédito: " + nuevoCliente.credito);

        nuevoTrabajador.edad = 50;
        nuevoTrabajador.nombre = "Juan Perez";
        nuevoTrabajador.telefono = "5525352535";
        nuevoTrabajador.salario = 15000.00;
        System.out.println("\nDatos del trabajador: \n - Nombre: " + nuevoTrabajador.nombre +
                "\n - Edad: " + nuevoTrabajador.edad + "\n - Teléfono: " + nuevoTrabajador.telefono +
                "\n - Salario: " + nuevoTrabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}