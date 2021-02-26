package Ejercicio5;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertarDatos extends Ejercicio5APP {
	// Insertar Departamento
	public static void insertDespacho(String db, String table_name,  String NOMBRE, int CAPACIDAD) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (NOMBRE, CAPACIDAD) VALUE(" 
					+ "\"" + NOMBRE + "\" ,"
							+ CAPACIDAD+");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	// Insertar Artículo
	public static void insertDirector(String db, String table_name, String DNI, String nombreAPELLIDO ,String DNIJEFE,  int DESPACHO) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (DNI, NOMBAPELLIDO, DNIJEFE, DESPACHO) VALUES(" 
					+ "\"" + DNI + "\" ,"
					+ "\""+nombreAPELLIDO +  "\","
					+ "\"" +DNIJEFE+ "\","
					+ DESPACHO + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	
}