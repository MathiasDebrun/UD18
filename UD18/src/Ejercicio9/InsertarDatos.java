package Ejercicio9;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertarDatos extends Ejercicio9APP {
	// Insertar Departamento
	public static void insertFacultad(String db, String table_name,  String NOMBRE) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (NOMBRE) VALUE(" 
					+ "\"" + NOMBRE + "\" "
							+");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	// Insertar Artículo
	public static void insertInvestigador(String db, String table_name, String DNI, String NOMBRE, int FACULTAD ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (DNI, NOMBRE, FACULTAD) VALUES(" 
					+ "\"" + DNI + "\" ,"
					+ "\"" + NOMBRE + "\" ,"
					+ FACULTAD + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	public static void insertEquipo(String db, String table_name, String NUMSERIE, String NOMBRE, int FACULTAD ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (NUMSERIE, NOMBRE, FACULTAD) VALUES(" 
					+ "\"" + NUMSERIE + "\" ,"
					+ "\"" + NOMBRE + "\" ,"
					+ FACULTAD + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	public static void insertReserva(String db, String table_name, String DNI, String NUMSERIE, String COMIENZO, String FINAL ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (DNI, NUMSERIE, COMIENZO, FIN) VALUES(" 
					+ "\"" + DNI + "\" ,"
					+ "\"" + NUMSERIE + "\" ,"
					+ "\"" + COMIENZO + "\" ,"
					+ "\"" + FINAL + "\" "
					+" );";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	
}