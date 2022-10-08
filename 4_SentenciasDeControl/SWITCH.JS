/**
 * Por último, para el Switch, deberás crear la variable estacion, y distintos case 
 * para las cuatro estaciones del año. Dependiendo del valor de la variable estacion 
 * se deberá mandar un mensaje por consola informando de la estación en la que está. 
 * También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */

const ejercicioSwitch = (estacionSwitch) => {
    let estacion = estacionSwitch.toLowerCase()
    switch (estacion) {
        case 'primavera':
            console.log('Es Primavera');
            break;
        case 'verano':
            console.log('Es Verano');
            break;
        case 'otoño':
            console.log('Es Otoño');
            break;
        case 'invierno':
            console.log('Es Invierno');
            break;
        default:
            console.log('El dato ingresado no es una estación');
            break;
    }
}

ejercicioSwitch('VeRaNO')