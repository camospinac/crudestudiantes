
package proyecto_mysql;
import java.sql.*;


public class Conexion {
    
    Connection conexionBD = null;
    private Controlador control;
    public static final String URL = "jdbc:mysql://localhost:3307/crudEstudiantes";   
    public static final String USUARIO = "root";
    public static final String PASSWORD = "1234";
    
    
    public Connection getConexion(){
        
        try {
            
            conexionBD = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            
        } catch (SQLException e) {
            control = new Controlador("ERROR EN LA CONEXION:\n"+"Ejecute USBSERVER para cargar la base de datos\n"+ e);
            control.generarMensajes();
        }
        
        return conexionBD;
    }
    
    
    
}
