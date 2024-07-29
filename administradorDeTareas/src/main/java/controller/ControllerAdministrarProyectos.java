
package controller;

import java.util.List;
import model.modelo;

public class ControllerAdministrarProyectos {
  private modelo conexion = new modelo("jdbc:mysql://localhost:3306/", "root", "", "softwaretareas");
  private int id_user;
  
  public ControllerAdministrarProyectos(int id_user){
    this.id_user = id_user;
  }
  
  public List<String[]> getProyectos_userAdmin(){
    List<String[]> datos = this.conexion.valores_array("SELECT p.id,p.nombre  FROM usuario_proyecto up join proyecto p on (p.id = up.id_proyecto) where up.id_usuario = '"+this.id_user+"' and rol = 'administrador';");
    return datos;
  }
  public List<String[]> getProyecto_userParticipante(){
    List<String[]> datos = this.conexion.valores_array("SELECT p.id,p.nombre  FROM usuario_proyecto up join proyecto p on (p.id = up.id_proyecto) where up.id_usuario = '"+this.id_user+"' and rol = 'participante';");
    return datos;
  }
  
  public List<String[]> obtenerDatosProyecto(int id_user, int id_proyecto){
    List<String[]> datos = this.conexion.valores_array("call obtenerDatosProyecto("+id_user+","+id_proyecto+");");
    return datos;
  }
  
  public boolean existeProyecto(int id_user, int id_proyecto){
    String dato = this.conexion.retornar_columna("select existeProyecto ("+id_user+", "+id_proyecto+");");
    if ("1".equals(dato)){
      return true;
    }else{
      return false;
    }
  }
  
  public void guardarCambios (int id_user, int id_proyecto, String nombre, String description, int cantPer){
    this.conexion.Ubdate_date("UPDATE proyecto SET `nombre` = '"+nombre+"' ,`descripcion` = '"+description+"' ,`cantidadIntegrante` = "+cantPer+" WHERE `id` = "+id_proyecto+" and id_usuario = "+id_user+" ;");
  } 
  
  public void eliminarProyecto (int id_user, int id_proyecto){
    this.conexion.retornar_columna("Call eliminarProyecto("+id_user+","+id_proyecto+")");
  }
}
