package Ej7;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Proyecto extends BaseDatos.BD{
	public static void createTableProyecto(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE Proyecto"
					+ "(ID CHAR(4) PRIMARY KEY, NOMBRE VARCHAR(255), HORAS INT)";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertProyecto(String db, String ID, String NOMBRE, int HORAS) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO Proyecto (ID, NOMBRE, HORAS) VALUE(" 
					+ "\"" + ID + "\" ,"
					+ "\"" + NOMBRE + "\" ,"
							+HORAS+
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
