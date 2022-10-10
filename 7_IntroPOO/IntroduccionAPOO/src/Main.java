public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);
//        coche.acelerar();
//        System.out.println(coche.velocidadActual);
//
        Coche coche2 = new Coche(2, 90);
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);
    }
}

class Coche {
    int numeroDePuertas;    // Propiedades de la clase
    int velocidadMaxima;
    float velocidadActual;

    public Coche(){         // Constructor
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor sin nada");
    }
    public Coche(int numeroDePuertas, int velocidadMaxima){         // Constructor
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor con parámetros");
    }

//    public void acelerar(){     // Métodos de la clase
//        velocidadActual += 15;
//    }
//    public void decelerar(){}
}