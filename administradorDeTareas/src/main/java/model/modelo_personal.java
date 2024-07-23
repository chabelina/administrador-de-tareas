package model;
public class modelo_personal extends modelo{
    
    public modelo_personal(String host, String usuario, String contrasenia, String base_datos) {
        super(host, usuario, contrasenia, base_datos);
    }
    public modelo_personal(){
        super("jdbc:mysql://localhost:3306/","root","","softwaretareas");
    }

    public int validador_usuario(String user,String pass){
        String dato = this.retornar_columna("select validacion_cuenta('"+user+"', '"+pass+"')");
        return Integer.parseInt(dato);
    }
    public int InsertarUsuario(String nombre,String email,String contra){
        String dato = this.retornar_columna("select registrar_usuario('"+nombre+"','"+email+"','"+contra+"')");
        return Integer.parseInt(dato);
    }
}
