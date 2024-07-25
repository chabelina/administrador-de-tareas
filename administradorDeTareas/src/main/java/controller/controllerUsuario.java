
package controller;

import java.util.Arrays;
import java.util.List;
import model.modelo;


public class controllerUsuario {
    modelo conexion = new modelo("jdbc:mysql://localhost:3306/","root","","softwaretareas");
    private String nombre;
    private String email;
    private int id_usuario;
    public controllerUsuario(int id_usuario){
        this.id_usuario = id_usuario;
        List<String[]> datos = conexion.valores_array("SELECT * FROM usuario WHERE id = "+id_usuario+"");
        String[] datos2 = datos.get(0);
        //System.out.println("resutado 2 : "+ Arrays.toString(datos2));
        this.nombre = datos2[1];
        this.email = datos2[2];
    }
    
    public String crear_proyecto(String nombre_p,String desc_p,int cantidad,int id_usuario){
        String valor_res = "-1";
        try {
            String consulta = "select softwaretareas.Crear_proyecto("+id_usuario+", '"+nombre_p+"', '"+desc_p+"', "+cantidad+") as resultado;";
            valor_res = conexion.retornar_columna(consulta);
        } catch (Exception e) {
            valor_res = "-1";
            System.out.println("error : "+e);
        }
        return valor_res;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_usuario() {
        return id_usuario;
    }
}
