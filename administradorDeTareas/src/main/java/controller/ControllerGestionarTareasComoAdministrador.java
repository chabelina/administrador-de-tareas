
package controller;
import java.util.List;
import model.modelo;
import model.ModelGestionarProyectoAdministrador;

public class ControllerGestionarTareasComoAdministrador {
  private ModelGestionarProyectoAdministrador modelGestionarProyectAdmin = new ModelGestionarProyectoAdministrador();
  private modelo conexion = new modelo("jdbc:mysql://localhost:3306/","root","","softwareTareas");
  
  public void obtenerDatosProyecto(int id_user, int id_proyecto){
    List<String[]> datos = this.conexion.valores_array("select nombre, descripcion, codigoDelProyecto from proyecto where id_usuario = "+id_user+" and id = "+id_proyecto+";");
    this.modelGestionarProyectAdmin.setNombreProyecto(datos.get(0)[0]);
    this.modelGestionarProyectAdmin.setDescProyecto(datos.get(0)[1]);
    this.modelGestionarProyectAdmin.setCodProyecto(datos.get(0)[2]);
  }
  
  public String getNombreProyecto(){
    return modelGestionarProyectAdmin.getNombreProyecto();
  }
  public String getDescProyecto(){
    return modelGestionarProyectAdmin.getDescProyecto();
  }
  public String getCodProyecto(){
    return modelGestionarProyectAdmin.getCodProyecto();
  }
  
  public List<String[]> obtenerTareasAsignadas(int id_proyecto){
    List<String[]> datos = this.conexion.valores_array("select tareasdelproyectoasignadas.id, tareasdelproyectoasignadas.nombre,descripcion,estado,prioridad,fecha_asignacion,fechaLimite,usuario.email from tareasdelproyectoasignadas join usuario on (usuario.id = tareasdelproyectoasignadas.id_usuario) where id_proyecto = '"+id_proyecto+"' ;");
    return datos;
  }
  
  public List<String[]> obtenerTodosLosIntegrantes(int id_proyecto){
    List<String[]> datos = this.conexion.valores_array("select u.id ,u.nombre ,u.email from usuario_proyecto up join usuario u on (up.id_usuario = u.id) where up.id_proyecto = "+id_proyecto+" and up.rol = 'participante';");
    return datos;
  }
  
  public void eliminarIntegrante(int id_user, int id_proyecto){
    String datos = this.conexion.retornar_columna("call eliminarParticipanteDeProyecto("+id_user+", "+id_proyecto+");");
  }
  
  public List<String[]> obtenerDatosDeUnaTareaAsignada(int id_tarea,int id_proyecto){
    List<String[]> datos = this.conexion.valores_array("select nombre, descripcion, prioridad, fechaLimite, id_usuario from tareasdelproyectoasignadas where id = "+id_tarea+" and id_proyecto = "+id_proyecto+";");
    return datos;
  }
  
  public void guardarCambiosDeTareaAsignada(int id_proyecto ,String nombre, String des, String prio, String fechaLimite, int id_user){
    int resultado = this.conexion.Ubdate_date("update tareasdelproyectoasignadas set nombre = '"+nombre+"', descripcion = '"+des+"', prioridad = '"+prio+"' , fechaLimite = '"+fechaLimite+"', id_usuario = "+id_user+" where id = "+id_proyecto+";");
  }
  
  
  public void guardarTarea(int id_proyecto ,String nombre, String des, String prio, String fechaLimite, int id_Participante, int id_Admin){
    String resultado = this.conexion.insert_date("INSERT INTO tareasdelproyectoasignadas (nombre,descripcion,prioridad,fechaLimite,creadorDeLaTarea,id_usuario,id_proyecto)VALUES('"+nombre+"','"+des+"','"+prio+"','"+fechaLimite+"',"+id_Admin+","+id_Participante+","+id_proyecto+");");    
  }
}
