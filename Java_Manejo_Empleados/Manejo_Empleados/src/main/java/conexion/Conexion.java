package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	//Atributos para establecer la conexion
    private Connection conex= null;
    private string db="empleados";
    private String usuario="root";
    private String password="5464";
    private String url="jdbc:mysql://localhost:3306/?user=root"+db;
    
    public Conexion(){
	}

	public Connection getConnection() throws SQLExeption, ClassNotFoundExeption{
			class.forName("com.mysql.cj.jdbc.Driver");
			conex=DriveManager,getConnection(url, usuario, password);
			return conex;
	}
}