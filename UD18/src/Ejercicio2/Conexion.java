package Ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion extends Ejercicio2APP {
	
	//Abrir Conexión 
	
	public static void openConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion=DriverManager.getConnection("jdbc:mysql://192.168.1.140:3306?useTimezone=true&serverTimezone=UTC","remoto","73Fedora-");//credenciales temporales
			System.out.println("Server Connected ");
			
			
		}catch(SQLException | ClassNotFoundException ex  ){
			System.out.print("No se ha podido conectar con mi base de datos");
			
			System.out.println(ex.getMessage());
			
		}
		
	}
	public static void closeConnection() {
		try {
			
			conexion.close();
			System.out.print("Server Disconnected");
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.print("Error cerrando conexion");
			
		}
	}
	
	
	
}
