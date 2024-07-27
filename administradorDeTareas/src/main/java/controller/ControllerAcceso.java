
package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.modelo_personal;

public class ControllerAcceso {
    modelo_personal conexion = new modelo_personal();
    
    // ESTE METODO VERIFICA SI EL EMAIL(USUARIO) Y EL PASSWORD CORRESPONDAN 
    // A LA EXPRESIÓN IRREGULAR QUE SE DEFINE EN ELLA
    public int acceso(String usuario,String password){
       int id_return = -1;
       // EXPRESIÓN IRREGULAR PARA EL EMAIL
       String expresion_validador = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
       // EXPRESIÓN IRREGULAR PARA EL PASSWORD
       String expresion_2 = "^[a-zA-Z0-9-@.]+$";
       Pattern expresion = Pattern.compile(expresion_validador);
       Pattern expresion2_s = Pattern.compile(expresion_2);
       Matcher validando_user = expresion.matcher(usuario);
       Matcher validando_pass = expresion2_s.matcher(password);
       if(validando_user.matches()  && validando_pass.matches()){
            id_return = conexion.validador_usuario(usuario, password); 
       }else{
            id_return = -1;
       }
       return id_return;
    }
    
    // REGISTRA AL USUARIO (NOMBRE, EMAIL, CONTRASEÑA), SI LA CONTRA ES MENOR A 
    // 8 DIGITOS RETORNA -3, Y SI EL EMAIL Y LA CONTRASEÑA NO SON CORRECTAS RETORNA
    // UN -2.
    
    // SI LOS DATOS SON CORRECTOS RETORNA EL ID DEL USUARIO QUE ACABAS DE REGISTRAR
    public int registrarse(String nombre,String email,String contra){
        int id_return;
        String expresion_validador = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String expresion_2 = "^[a-zA-Z0-9-@.]+$";
        Pattern expresion = Pattern.compile(expresion_validador);
        Pattern expresion2_s = Pattern.compile(expresion_2);
        Matcher validando_user = expresion.matcher(email);
        Matcher validando_pass = expresion2_s.matcher(contra);
        int cantidad = contra.length();
        if(cantidad < 8){
            id_return = -3;
        }else if(validando_user.matches()  && validando_pass.matches()){
            id_return = conexion.InsertarUsuario(nombre, email, contra); 
       }else{
          id_return = -2; // CONTRASEÑA NO ES MAYOR A 8 CARACTERES
                          // Y EL CORREO Y LA CONTRASEÑA NO CUMPLEN 
                          // CON LA EXPRESIÓN IRREGULAR.
       }
        return id_return;
    }
}
