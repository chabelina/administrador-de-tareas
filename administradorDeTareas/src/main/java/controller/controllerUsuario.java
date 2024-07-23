
package controller;

import model.modelo;


public class controllerUsuario {
    modelo conexion = new modelo("jdbc:mysql://localhost:3306/","root","","softwaretareas");
    private String nombre;
    private String email;
    private int id_usuario;
    public controllerUsuario(int id_usuario){
        this.id_usuario = id_usuario;
    }
    public controllerUsuario(){
        
    }
    
    public void crear_proyecto(String nombre_p,String desc_p,int cantidad,int id_usuario){
        String consulta = "select softwaretareas.Crear_proyecto("+id_usuario+", '"+nombre_p+"', '"+desc_p+"', "+cantidad+") as resultado;";
        conexion.retornar_columna(consulta);
    }
}
