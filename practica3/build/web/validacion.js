/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validar(){
    dni = document.formulario.dni.value; 
    exp = /^([0-9])*$/;
    
    if (!exp.test(dni)){
        alert("El valor " + dni + " no es un número");
        return false;
    }
    else if (dni < 0 | dni > 99999999) {
        alert("El valor " + dni + " no esta en el rango 0 - 99.999.999");
        return false;
    }
    else if (dni === null | dni.length === 0){
        alert("Hay que escribir un DNI");
        return false;
    }
    else{
        return true;
    }
    
}