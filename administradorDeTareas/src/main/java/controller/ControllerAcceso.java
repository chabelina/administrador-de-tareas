
package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.modelo_personal;

public class ControllerAcceso {
    modelo_personal conexion = new modelo_personal();
    public int acceso(String usuario,String password){
       int id_return = -1;
       String expresion_validador = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
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
}
