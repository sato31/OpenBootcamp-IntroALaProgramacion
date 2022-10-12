public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        cocheChanger(coche);
//        coche.Acelerar(50);
//
//        var resultado = suma(2,5);
//        System.out.println(resultado);

//        Coche coche = new Coche();
//        Moto moto = new Moto();
//
//        EjecutaAcelerar(coche);
//        EjecutaAcelerar(moto);
        factorial(8);
    }

//    public static int suma(int operandoA, int operandoB){
//        return operandoA + operandoB;
//    }

//    public static void (Vehiculo vehiculo){
//        vehiculo.Acelerar(15);
//    }
    public static int cocheChanger(Coche coche){
        return coche.velocidad = coche.velocidad + 50;
    }

    // Recursividad
    public static int factorial(int numero){
        int resultado;
        if (numero == 1){
            return 1;
        }

        resultado = factorial(numero -1 ) * numero;
        return resultado;
    }

    // Función no recursiva
    public static int factorialNR(int numero){
        int temp;
        int resultado = 1;

        for (temp =1; temp <= numero; temp++){
            resultado = resultado * temp;
        }
        return resultado;
    }

    // Ejemplo de función recursiva con sentencia de control
    public static void suma(int a, int b){
        var temp = a + b;
        System.out.println("A vale" + a + "b vale" + b + "temp vale" + temp);
        if (b >= 90){
            return;
        }
        suma(a, temp);
    }
}

interface Vehiculo{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {
    int velocidad = 0;
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Coche() => Acelerar()");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Coche() => Frenar()");
    }
}

class Moto implements Vehiculo {
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Moto() => Acelerar()");
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Moto() => Frenar()");
    }
}
