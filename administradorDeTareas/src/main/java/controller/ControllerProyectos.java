
package controller;

import java.util.Arrays;
import java.util.List;
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
    public int Ingresar_proyecto(int id,String rol){
        String consulta = "INSERT INTO usuario_proyecto(`id_usuario`,`id_proyecto`,`rol`)VALUES ("+id+","+this.id_proyecto+","+rol+")";
        String resultado = this.conexion.insert_date(consulta);
        int datos = Integer.parseInt(resultado);
        return datos;
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
