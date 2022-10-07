/**
 * Primera parte:
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * Llamar a la función en el main y darle valores.
 */
const suma = (num1, num2, num3) => {
    let resultado = num1 + num2 + num3
    console.log(resultado)
}

suma(9, 18, 27)

/**
 * Segunda parte:
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 */

class Coche {
    constructor(puertas){
        this.puertas = puertas;
    }
    agregarpuertas(){
        console.log('Agregando puertas...');
        this.puertas = this.puertas + 1
        console.log(`Ahora el coche tiene ${this.puertas} puertas`);
    }
}

let miCoche = new Coche(4);
miCoche.agregarpuertas()
