package Ejercicio8;

import java.sql.Connection;

import Ejercicio5.Conexion;

public class Ejercicio8APP {
	public static Connection conexion;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion.openConnection();
		CrearBD.createDB("BDUD18EJ8");
//		CrearTablas.createTableDespacho("BDUD18EJ3","Despacho");
//		CrearTablas.createTableDirectores("BDUD18EJ3","Directores");
//		InsertarDatos.insertDespacho("BDUD18EJ3","Despacho", "Despacho1", 15);
//		InsertarDatos.insertDirector("BDUD18EJ3", "Directores", "12345678A", "Juan Pérez", "12345678A", 1 );
		Conexion.closeConnection();
		
	}

}
