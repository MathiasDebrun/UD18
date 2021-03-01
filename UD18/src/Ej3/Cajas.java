package Ej3;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import BaseDatos.BD;

public class Cajas extends BD{

	public static void createTableCajas(String db,String name ) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= BD.conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(NumReferencia varchar(5), Contenido varchar(100), Valor int, Almacen int, "
					+ "foreign key (Almacen) references Almacenes(Codigo));";
			
			Statement st= BD.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error crando tabla.");
			
		}
		
	}
	
	
	public static void insertCajas(String db, String table_name,  String NumReferencia, String Contenido, int Valor, int Almacen) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= BD.conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (NumReferencia,Contenido,Valor,Almacen) VALUE(" 
					+ "\"" + NumReferencia + "\","
					+ "\"" + Contenido + "\","
					+ + Valor + ","
					+ + Almacen + ");";
			Statement st = BD.conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	
}