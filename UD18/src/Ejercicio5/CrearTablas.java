package Ejercicio5;

import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas extends Ejercicio5APP {
	// Crear Tabla Departamento
	public static void createTableDespacho(String db,String name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(NUMERO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), CAPACIDAD INT);";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	// Crear Tabla Empleado
	public static void createTableDirectores(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(DNI VARCHAR(9) PRIMARY KEY, NOMBAPELLIDO VARCHAR(255), DNIJEFE VARCHAR(9), DESPACHO INT,FOREIGN KEY (DNIJEFE) references Directores(DNI), FOREIGN KEY (DESPACHO) references Despacho(NUMERO));";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
}