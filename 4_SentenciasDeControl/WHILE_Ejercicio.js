/**
 * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, 
 * el bloque de código que tendrá el bucle deberá:
 * Incrementar el valor de la variable en uno cada vez que se ejecute.
 * Mostrarlo por pantalla cada vez que se ejecute.
 */

const ejercicioWhile = (numeroWhile) => {
    while (numeroWhile < 3) {
        console.log(numeroWhile)
        numeroWhile++
    }
}

ejercicioWhile(-5)