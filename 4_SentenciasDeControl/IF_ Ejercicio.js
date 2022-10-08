/**
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */


const ejercicioIf = (numeroIf) => {
    if (numeroIf < 0) console.log('El numero ingresado es negativo');
    else if (numeroIf > 0) console.log('El número ingresado es positivo');
    else if (numeroIf === 0) console.log('El número ingresado es 0');
    else console.log('El valor ingresado no es un número');
}

ejercicioIf(0)

// const validacion = (numeroIf) => {
//     if (typeof(numeroIf) === 'number' ){
//         ejercicioIf(numeroIf)
//     }  
//     else{
//         console.log('Ingresa un numero valido');
//     }
// }

// validacion(0)
