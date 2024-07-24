
package controller;

import java.util.Arrays;
import java.util.List;
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
    
}
