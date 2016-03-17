/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validar(){
    numero = document.formulario.num.value; 
    exp = /^([0-9])*$/;
    
    if (numero < 0 ) {
        alert("El valor " + numero + " no es positivo");
        return false;
    }
    else if (!exp.test(numero)){
        alert("El valor " + numero + " no es un entero");
        return false;
    }
    else if (numero === null | numero.length === 0){
        alert("Hay que escribir un número");
        return false;
    }
    else{
        return true;
    }
    
}
