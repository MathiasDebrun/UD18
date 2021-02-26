package Ejercicio8;

import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas extends Ejercicio8APP {
	// Crear Tabla Departamento
	public static void createTableCajeros(String db,String name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMAPELS VARCHAR(100));";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	// Crear Tabla Empleado
	public static void createTableProductos(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(255), PRECIO INT);";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	public static void createTableMaquinasRegistradoras(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, PRECIO INT);";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	public static void createTableVenta(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE " +name+ " " 
					+ "(CAJERO INT, MAQUINA INT, PRODUCTO INT, PRIMARY KEY (CAJERO, MAQUINA,PRODUCTO), foreign key (CAJERO) references Cajeros(CODIGO), foreign key (MAQUINA) references Maquinas_Registradoras(CODIGO), foreign key (PRODUCTO) references Productos(CODIGO));";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
}