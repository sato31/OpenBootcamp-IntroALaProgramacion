public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
//        coche.diHola();
//        coche.sumaNumeros(3, 5);
//        coche.sumaNumeros((float) 20, (float)5);
        coche.sumaNumeros(2.3, 3.5);
    }
}

class Vehiculo {
    public void diHola (){
        System.out.println("Hola!!");
    }
}

class Coche extends Vehiculo{
    public void diHola() {  //Polimorfismo funcion diHola()
        System.out.println(("Soy un coche"));
    }

    //Polimorfismo de funciones
    public int sumaNumeros(int a, int b){
        System.out.println("Soy el sumaNumeros de INT");
        return a + b;
    }

    public float sumaNumeros(float a, float b){
        System.out.println("Soy el sumaNumeros de FLOAT");
        return a + b * (float) 9.0;
    }

    public void sumaNumeros(double a, double b){
        System.out.println("Soy el sumaNumeros de DOUBLE");
        System.out.println("El resultado es: " + (a +b));
    }
}

//class Motor{
//    String tipoMotor;
//
//    public Motor(){
//        System.out.println("Estoy en el constructor de Motor");
//    }
//}

// Herencia Multiple
//class Coche extends Motor, Vehiculo {
//    public Coche(){
//
//    }
//}