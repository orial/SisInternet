/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validar(){
    nombre = document.formulario.nombre.value;
    apellidos = document.formulario.apellidos.value;
    mail = document.formulario.email.value;
    password = document.formulario.pass.value;
    rpassword = document.formulario.rpass.value;
    
    exp = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    
    if (nombre === null | nombre.length === 0){
        alert("Hay que escribir un nombre");
        return false;
    }
    else if (apellidos === null | apellidos.length === 0 ){
        alert("Hay que escribir un apellido");
        return false;
    }
    else if (!exp.test(mail)){
        alert("Correo electronico no valido");
        return false;
    }
    else if (password.length <8){
        alert("El password debe tener al menos 8 caracteres");
        document.formulario.pass.value="";
        document.formulario.rpass.value="";
        return false;
    }
    else if (!(password === rpassword)){
        alert("Los password son diferentes");
        document.formulario.pass.value="";
        document.formulario.rpass.value="";
        return false;
    }
    else{
        alert("registro correcto");
        return true;
    }
    
}