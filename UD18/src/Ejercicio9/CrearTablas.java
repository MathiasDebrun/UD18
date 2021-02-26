package Ejercicio9;

import java.sql.SQLException;
import java.sql.Statement;

public class CrearTablas extends Ejercicio9APP {
	// Crear Tabla Departamento
	public static void createTableFacultad(String db,String name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100));";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	// Crear Tabla Empleado
	public static void createTableInvestigadores(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(DNI VARCHAR(8) PRIMARY KEY, NOMBRE VARCHAR(255), FACULTAD INT, FOREIGN KEY (FACULTAD) references Facultad(CODIGO));";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	public static void createTableEquipos(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(NUMSERIE CHAR(4) PRIMARY KEY, NOMBRE VARCHAR(100), FACULTAD INT);";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	public static void createTableReserva(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE " +name+ " " 
					+ "(DNI VARCHAR(8), NUMSERIE CHAR(4), COMIENZO DATETIME, FIN DATETIME, PRIMARY KEY (DNI, NUMSERIE), foreign key (DNI) references Investigadores(DNI), foreign key (NUMSERIE) references Equipos(NUMSERIE));";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
}