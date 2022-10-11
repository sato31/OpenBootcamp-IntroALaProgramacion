public class Main {
    public static void main(String[] args) {
//        Vehiculo coche = new Vehiculo();
//        coche.setTipo("Sedan");
//        coche.setVelocidadMaxima(120);
//        coche.setRapido(true);
//
//        Vehiculo moto = new Vehiculo();
//        moto.setTipo("Motoneta");
//        moto.setVelocidadMaxima(50);
//        moto.setRapido(false);
//
//        System.out.println(coche.getTipo());
//        System.out.println(coche.getVelocidadMaxima());
//        System.out.println(coche.isRapido());
//
//        System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima() + " " + moto.isRapido());
    }
}

abstract class Vehiculo{
//class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;
    private String sonido;

    abstract public void setSonido(String sonido);
    abstract public String getSonido();
//    public void setSonido(String sonido) {
//        this.sonido = sonido;
//    }
//    public String getSonido() {
//        return this.sonido;
//    }

    // Encapsulamiento (get y set)  Permite que se modifiquen propiedades privadas por medio de get y set
    public void setRapido(boolean rapido) {     //El set recibe una variable con el mismo tipo de dato
        this.rapido = rapido;
    }
    public boolean isRapido() {     // Cuando es tipo boolean, en lugar de get se usa is
        return this.rapido;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
}