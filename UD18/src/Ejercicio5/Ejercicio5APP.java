package Ejercicio5;

import java.sql.Connection;

public class Ejercicio5APP {
	public static Connection conexion;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion.openConnection();
//		CrearBD.createDB("BDUD18EJ3");
//		CrearTablas.createTableDespacho("BDUD18EJ3","Despacho");
//		CrearTablas.createTableDirectores("BDUD18EJ3","Directores");
//		InsertarDatos.insertDespacho("BDUD18EJ3","Despacho", "Despacho1", 15);
//		InsertarDatos.insertDirector("BDUD18EJ3", "Directores", "12345678A", "Juan Pérez", "12345678A", 1 );
		InsertarDatos.insertDespacho("BDUD18EJ3","Despacho", "Despacho2", 15);
		InsertarDatos.insertDirector("BDUD18EJ3", "Directores", "22345678A", "Juan Pérez", "12345678A", 2 );
		InsertarDatos.insertDespacho("BDUD18EJ3","Despacho", "Despacho3", 15);
		InsertarDatos.insertDirector("BDUD18EJ3", "Directores", "32345678A", "Pedro Pérez", "12345678A", 3 );
		InsertarDatos.insertDespacho("BDUD18EJ3","Despacho", "Despacho4", 15);
		InsertarDatos.insertDirector("BDUD18EJ3", "Directores", "42345678A", "Pepe Pérez", "12345678A", 4 );
		InsertarDatos.insertDespacho("BDUD18EJ3","Despacho", "Despacho5", 15);
		InsertarDatos.insertDirector("BDUD18EJ3", "Directores", "52345678A", "Walter Pérez", "12345678A", 5 );
		
		//getValues("BD_prueba1","Tabla_1");
		//deleteRecord("BD_prueba1","Tabla_1", "1");
		Conexion.closeConnection();
	}

}
