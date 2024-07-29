
package controller;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.modelo;

public class ControllerProyectos {
    modelo conexion = new modelo("jdbc:mysql://localhost:3306/","root","","softwaretareas");
    private int id_proyecto = -1;
    private String nombre;
    private String descripcion;
    private int cant_mienbros;
    public ControllerProyectos(){
    }
    public void MostratProyecto(String codigo){
        String consulta = "SELECT * FROM proyecto where codigoDelProyecto = '"+codigo+"'";
        List<String[]> datos = this.conexion.valores_array(consulta);
        System.out.println("DATOS");
        if(!datos.isEmpty()){
            String[] datos2 = datos.get(0);
            System.out.println("datos : "+Arrays.toString(datos2));
            this.nombre = datos2[1];
            this.descripcion = datos2[2];
            this.cant_mienbros = Integer.parseInt(datos2[3]);
            this.id_proyecto = Integer.parseInt(datos2[0]);
        }
    }
    public int Ingresar_proyecto(int id,int id_proyecto){
        String consulta = "select softwaretareas.ingresar_proyecto("+id+","+id_proyecto+");";
        String resultado = this.conexion.retornar_columna(consulta);
        int datos = Integer.parseInt(resultado);
        return datos;
    }
    public int CrearProyecto(int id_user,String nombre_p,String desc_p,int cantidad){
        String expresion_2 = "^[a-zA-Z0-9-@.]+$";
        Pattern expresion2_s = Pattern.compile(expresion_2);
        Matcher validando_nombre = expresion2_s.matcher(nombre_p);
        Matcher validando_descripcion = expresion2_s.matcher(nombre_p);
        if(!validando_nombre.matches() && !validando_descripcion.matches()){
            return -4;
        }
        if(nombre_p.length() < 5){
            return -5;
        }
        
        if(cantidad < 3){
            return -6;
        }
        int valor = 1;
        try {
            String consulta = "select softwaretareas.Crear_proyecto("+id_user+",'"+nombre_p+"','"+desc_p+"',"+cantidad+");";
            String resultado = this.conexion.retornar_columna(consulta);
            if(resultado.equals("-2")){
                valor = -2;
            }
        } catch (Exception e) {
            valor = -1;
        }
        
        return valor;
    }
    public int getId_proyecto() {
        return id_proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCant_mienbros() {
        return cant_mienbros;
    }

    public List<String[]> tareas_usuario(int id){
        String consulta = "SELECT id,nombre,descripcion,prioridad,fechaLimite FROM tareas_activas where id_usuario = "+id+";";
        List<String[]> datos = this.conexion.valores_array(consulta);
        return datos;
    }
    public List<String[]> prioridad(int id){
        String consulta = "SELECT id,nombre,descripcion,prioridad,fechaLimite FROM tareas_activas where id_usuario = "+id+" order by case WHEN prioridad = 'ALTA' THEN 1 WHEN prioridad = 'MEDIA' THEN 2 ELSE 3 end;";
        List<String[]> datos = this.conexion.valores_array(consulta);
        return datos;
    }
    public List<String[]> expiradas(int id){
        String consulta = "SELECT id,nombre,descripcion,prioridad,fechaLimite FROM tareasexpiradas where id_usuario = "+id+";";
        List<String[]> datos = this.conexion.valores_array(consulta);
        return datos;
    }
    public List<String[]> tareas_eliminadas(int id){
        String consulta = "SELECT id,nombre,descripcion,prioridad,fechaLimite FROM tareas_eliminadas where id_usuario = "+id+";";
        List<String[]> datos = this.conexion.valores_array(consulta);
        return datos;
    }
    public List<String[]> fecha_limite(int id){
        String consulta = "SELECT id,nombre,descripcion,prioridad,fechaLimite FROM tareas_activas where id_usuario = "+id+" order by fechaLimite asc ";
        List<String[]> datos = this.conexion.valores_array(consulta);
        return datos;
    }
    public String[] datos_unicos(int id,int id_user){
        String consulta = "SELECT * FROM tareaspersonales where id = "+id+" and id_usuario = "+id_user+";";
        String[] datos = this.conexion.valores_array(consulta).get(0);
        return datos;
    }
    public int actualizar_cambios(int id,String nombre,String descr,String fecha,String prioridad){
        int valor = 0;
        try {
//            UPDATE `softwaretareas`.`tareaspersonales` SET `nombre` = 'probando', `descripcion` = 'prueba', `prioridad` = 'MEDIA', `fechaLimite` = '2024-07-32' WHERE (`id` = '5');

            String consulta = "UPDATE `tareaspersonales` SET `nombre` = '"+nombre+"', `descripcion` = '"+descr+"', `prioridad` = '"+prioridad+"' WHERE (`id` = "+id+");";
            this.conexion.Ubdate_date(consulta);
            valor = 1;
        } catch (Exception e) {
            System.out.println("ocurrio un error al actualizar");
            valor = -1;
        }
        return valor;
    }
    public int crear_nueva_tarea(int id_user,String nombre,String descripcion,String prioridad, String FechaLimite){
        int valor = -1;
        try {
            String consulta = "INSERT INTO `tareaspersonales` (`id_usuario`, `nombre`, `descripcion`, `prioridad`, `fechaLimite`) VALUES ('"+id_user+"', '"+nombre+"', '"+descripcion+"', '"+prioridad+"','"+FechaLimite+"')";
            System.out.println(consulta);
            String resultado = this.conexion.insert_date(consulta);
            valor = Integer.parseInt(resultado);
            //valor = 1;
        } catch (Exception e) {
            valor = -1;
        }
        return valor;
    }
    public int elimar_tarea(int id_user,int id_delete){
        int valor = -1;
        try {
            String consulta = "UPDATE `tareaspersonales` SET `activo` = '0' WHERE (`id` = '"+id_delete+"')";
            valor = this.conexion.Ubdate_date(consulta);
        } catch (Exception ex) {
            valor = -1;
            System.out.println("r: "+ex);
            Logger.getLogger(modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }
}
