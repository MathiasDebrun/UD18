

package Ej4;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Peliculas extends BaseDatos.BD{
	
	public static void createTablePeliculas(String db) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE PELICULAS"
					+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), CALIFICACIONEDAD INT)";
			Statement st= conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	public static void insertPeliculas(String db,  String NOMBRE, int CALEDAD) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO PELICULAS (NOMBRE, CALIFICACIONEDAD) VALUE(" 
					+ "\"" + NOMBRE + "\" ,"
							+CALEDAD+ 
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
