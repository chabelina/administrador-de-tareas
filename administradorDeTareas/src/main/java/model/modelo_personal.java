package model;
public class modelo_personal extends modelo{
    
    public modelo_personal(String host, String usuario, String contrasenia, String base_datos) {
        super(host, usuario, contrasenia, base_datos);
    }
    public modelo_personal(){
        super("jdbc:mysql://localhost:3306/","root","","softwaretareas");
    }

    public int validador_usuario(String user,String pass){
        String dato = this.retornar_columna("select softwaretareas.validacion_cuenta('"+user+"', '"+pass+"')");
        return Integer.parseInt(dato);
    }
}
