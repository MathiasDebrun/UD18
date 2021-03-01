package Ej7;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Cientificos extends BaseDatos.BD{
	public static void createTableCientificos(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE Cientificos"
					+ "(DNI VARCHAR(8) PRIMARY KEY, NOMAPELS VARCHAR(255))";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertCientificos(String db,  String DNI, String NOMAPELS) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO Cientificos (DNI, NOMAPELS) VALUE(" 
					+ "\"" + DNI + "\" ,"
					+ "\"" + NOMAPELS + "\""+
							");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}

}
