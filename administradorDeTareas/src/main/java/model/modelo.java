package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class modelo {
    private String host = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String pass = "";
    private String bd = "ficheros";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection conexion;

    public modelo(String host,String usuario,String contrasenia,String base_datos) {
        this.host = host;
        this.user = usuario;
        this.pass = contrasenia;
        this.bd = base_datos;
        // Constructor vacío
    }
    
    public Connection conectar() {
        try {
            Class.forName(this.driver);
            this.conexion = DriverManager.getConnection(host + bd, user, pass);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo hacer la conexión");
        }
        return conexion;
    }

    public void validador(){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        try {
            con = this.conectar();
            ps = con.prepareStatement("select validador_cuenta('75276127', 'master123') as datos");
            res = ps.executeQuery();
            if(res.next()){
                System.out.println(res.getString("datos"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String retornar_columna(String consulta){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        String respuesta = "";
        try {
            con = this.conectar();
            ps = con.prepareStatement(consulta);
            res = ps.executeQuery();
            if(res.next()){
                respuesta =  res.getString(1);
            }
        } catch (SQLException ex) {
            respuesta = "-1";
            Logger.getLogger(modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    public int Ubdate_date(String consulta){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        int respuesta;
        int idGenerado = 0;
        try {
            con = this.conectar();
            ps = con.prepareStatement(consulta,Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            System.out.println("Valor agregado correctamenre");
            respuesta = 1;
        } catch (SQLException ex) {
            System.out.println("r: "+ex);
            Logger.getLogger(modelo.class.getName()).log(Level.SEVERE, null, ex);
            respuesta = -1;
        }
        return respuesta;
    }
    public String insert_date(String consulta){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        String respuesta = "";
        int idGenerado = 0;
        try {
            con = this.conectar();
            ps = con.prepareStatement(consulta,Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            System.out.println("Valor agregado correctamenre");
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                idGenerado = generatedKeys.getInt(1);
            }
            respuesta = ""+idGenerado+"";
        } catch (SQLException ex) {
            System.out.println("r: "+ex);
            Logger.getLogger(modelo.class.getName()).log(Level.SEVERE, null, ex);
            respuesta = "-1";
        }
        return respuesta;
    }
    public List<String[]> valores_array(String consulta){
        List<String[]> array_datos = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        int cantidad = 0;
        conn = this.conectar();
        try {
            //"SELECT * FROM mensajes_totales_publicos_001_z"
            ps = conn.prepareStatement(consulta);
            res = ps.executeQuery();
            ResultSetMetaData meta_data = (ResultSetMetaData) res.getMetaData();
            //System.out.println(meta_data);
            int cantidad_datos = meta_data.getColumnCount();
            //System.out.println("cantidad columnas : "+cantidad_datos);
            while(res.next()){
                String[] datos_colum = new String[cantidad_datos];
                for(int i = 0;i < cantidad_datos;i++){
                    datos_colum[i] = res.getString(i + 1);
                }
                array_datos.add(datos_colum);
                //array_datos.addAll(Arrays.asList(datos_colum)) ;
            }
            res.close() ;
            ps.close();
            conn.close();
        } catch (SQLException ex){
            System.out.println("error");
            //Logger.getLogger(modelo.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return array_datos;
    }
    
    //public static void main(String[] args){
      //  modelo conexion = new modelo("jdbc:mysql://localhost:3306/","root","","ficheros");
       // List<String[]> datos = conexion.valores_array("SELECT * FROM ficheros.usuarios_ficher_0001_z");
       // for(String[] dato : datos){
        //    System.out.println("Dato : "+ Arrays.toString(dato));
        //}
        //System.out.println("prueb1 : " + datos.get(0)[1] );
        //conexion.extraerDatos();
        //conexion.validador();
        //String[] datos = conexion.valores_array();
    //}
    
}
