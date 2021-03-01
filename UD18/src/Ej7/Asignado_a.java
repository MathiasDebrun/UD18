package Ej7;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Asignado_a extends BaseDatos.BD{
	public static void createTableAsignado_a(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE Asignado_a"
					+ "(CIENTIFICO VARCHAR(8), PROYECTO CHAR(4), PRIMARY KEY(CIENTIFICO, PROYECTO), "
					+ "foreign key(CIENTIFICO)references Cientificos(DNI), foreign key(PROYECTO)references Proyecto(ID))";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertAsignado_a(String db, String CIENTIFICO, String PROYECTO) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO Asignado_a (CIENTIFICO, PROYECTO) VALUE(" 
					+ "\"" + CIENTIFICO + "\" ,"
					+ "\"" + PROYECTO + "\""+
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
