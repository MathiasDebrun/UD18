package Ej4;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Salas extends BaseDatos.BD{

	public static void createTableSalas(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE SALAS"
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), PELICULA INT, FOREIGN KEY (PELICULA) REFERENCES PELICULAS(CODIGO) )";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertSalas(String db, String NOMBRE, int PELICULA) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO SALAS (NOMBRE, PELICULA) VALUE(" 
					+ "\"" + NOMBRE + "\" ,"
							+PELICULA+ 
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
