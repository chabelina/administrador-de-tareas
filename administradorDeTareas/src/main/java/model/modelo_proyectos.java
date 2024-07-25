
package model;

public class modelo_proyectos extends modelo{
    
    public modelo_proyectos(String host, String usuario, String contrasenia, String base_datos) {
        super(host, usuario, contrasenia, base_datos);
    }
    public modelo_proyectos(){
        super("jdbc:mysql://localhost:3306/","root","","softwaretareas");
    }
    
}
