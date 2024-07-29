
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
}
