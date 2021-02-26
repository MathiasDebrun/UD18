package Ejercicio9;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import javax.swing.JOptionPane;

public class CrearBD extends Ejercicio9APP{

	public static void createDB(String name) {
		try {
			String Query="CREATE DATABASE "+ name;
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("DB creada con exito!");
			
		JOptionPane.showMessageDialog(null, "Se ha creado la DB " +name+ "de forma exitosa.");
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando la DB.");
		}	
	}
	
}
