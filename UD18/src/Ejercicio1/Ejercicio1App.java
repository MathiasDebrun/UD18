package Ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
public class Ejercicio1App {
	public static Connection conexion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LLAMADA A METODOS MYSQL
				openConnection();
				//createDB("BDUD18EJ1");
				//createTableFabricantes("BDUD18EJ1","Fabricantes");
				//createTableArticulos("BDUD18EJ1","Articulos");
				insertFabricante("BDUD18EJ1","Fabricantes", "Asus");
				insertArticulos("BDUD18EJ1", "Articulos", "Perno", 10, 1 );
				
				//getValues("BD_prueba1","Tabla_1");
				//deleteRecord("BD_prueba1","Tabla_1", "1");
				closeConnection();
	}
	//METODO QUE ABRE LA CONEXION CON SERVER MYSQL
		public static void openConnection() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexion=DriverManager.getConnection("jdbc:mysql://192.168.1.140:3306?useTimezone=true&serverTimezone=UTC","remoto","73Fedora-");//credenciales temporales
				System.out.print("Server Connected");
				
				
			}catch(SQLException | ClassNotFoundException ex  ){
				System.out.print("No se ha podido conectar con mi base de datos");
				
				System.out.println(ex.getMessage());
				
			}
			
		}
			
		//METODO QUE CIERRA LA CONEXION CON SERVER MYSQL
		public static void closeConnection() {
			try {
		
				conexion.close();
				System.out.print("Server Disconnected");
				
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.print("Error cerrando conexion");
				
			}
		}
		
		//METODO QUE CREA LA BASE DE DATOS
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
		//METODO QUE CREA TABLAS MYSQL
		public static void createTableFabricantes(String db,String name) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
				
				String Query = "CREATE TABLE "+name+""
						+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100))";
				Statement st= conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Tabla creada con exito!");
				
			}catch (SQLException ex){
				System.out.println(ex.getMessage());
				System.out.println("Error crando tabla.");
				
			}
			
		}
		public static void createTableArticulos(String db,String name ) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
				
				String Query = "CREATE TABLE "+name+""
						+ "(CODIGO INT PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(100), PRECIO INT, FABRICANTE INT, FOREIGN KEY (FABRICANTE) references Fabricantes(CODIGO) )";
				Statement st= conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Tabla creada con exito!");
				
			}catch (SQLException ex){
				System.out.println(ex.getMessage());
				System.out.println("Error crando tabla.");
				
			}
			
		}
		
		
		//METODO QUE INSERTA DATOS EN TABLAS MYSQL
		public static void insertFabricante(String db, String table_name,  String NOMBRE) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "INSERT INTO " + table_name + " (NOMBRE) VALUE(" 
						+ "\"" + NOMBRE + "\" );";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");;
				
			} catch (SQLException ex ) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
			}
						
		}
		public static void insertArticulos(String db, String table_name,  String nombre, int precio, int fabricante) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "INSERT INTO " + table_name + " (NOMBRE, PRECIO, FABRICANTE) VALUES(" 
						+ "\"" + nombre + "\","
						+ precio + ","
						+ fabricante + ") ";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");;
				
			} catch (SQLException ex ) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
			}
						
		}
		
		//METODO QUE OBTIENE VALORES MYSQL
		public static void getValues(String db, String table_name) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "SELECT * FROM " + table_name;
				Statement st = conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);
				
				while (resultSet.next()) {
					System.out.println("ID: " +  resultSet.getString("ID") + " "
							+ "Nombre: " +  resultSet.getString("Nombre") + " "
							+ "Apellido:" + resultSet.getString("Apellido") +  " "
							+ "Edad: " +  resultSet.getString("Edad") + " "
							+ "Sexo: " +  resultSet.getString("Sexo") + " "
							);
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error en la adquisicion de datos");
			}
		
		}
		 
		//METODO QUE LIMPIA TABLAS MYSQL
		public static void deleteRecord(String db, String table_name, String ID) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "DELETE FROM " + table_name + " WHERE ID = \"" + ID + "\"";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Registros de tabla ELIMINADOS con exito!");
							
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
			}
		}	

		
		//METODO QUE ELIMINA TABLAS MYSQL
		public static void deleteTAbla(String db, String table_name) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "DROP TABLE " + table_name + ";";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("TABLA ELIMINADA con exito!");
							
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error borrando la tabla");
			}
		}	
}
