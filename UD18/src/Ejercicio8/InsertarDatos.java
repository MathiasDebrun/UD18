package Ejercicio8;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertarDatos extends Ejercicio8APP {
	// Insertar Departamento
	public static void insertCajero(String db, String table_name,  String NOMBRE) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (NOMAPELS) VALUE(" 
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
	public static void insertProducto(String db, String table_name, String NOMBRE, int PRECIO ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (NOMBRE, PRECIO) VALUES(" 
					+ "\"" + NOMBRE + "\" ,"
					+ PRECIO + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	public static void insertMaquinaRegistradora(String db, String table_name, int PRECIO ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (PRECIO) VALUES(" 
					
					+ PRECIO + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	public static void insertVenta(String db, String table_name, int CAJERO, int MAQUINA, int PRODUCTO ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (CAJERO, MAQUINA, PRODUCTO) VALUES(" 
					+ CAJERO + ","
					+ MAQUINA + ","
					+ PRODUCTO + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	
}
