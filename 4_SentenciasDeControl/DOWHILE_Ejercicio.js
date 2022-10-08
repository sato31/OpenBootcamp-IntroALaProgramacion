/**
 * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
 */

 const ejercicioDoWhile = (numeroDoWhile) => {
    do {
        console.log(numeroDoWhile)
        numeroDoWhile++
    } while (numeroDoWhile < 3);
}

ejercicioDoWhile(5)