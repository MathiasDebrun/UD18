package Ejercicio8;

import java.sql.Connection;

import Ejercicio8.Conexion;

public class Ejercicio8APP {
	public static Connection conexion;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion.openConnection();
//  CrearBD.createDB("BDUD18Ej8");
//		CrearTablas.createTableProductos("BDUD18Ej8","Productos");
//		CrearTablas.createTableCajeros("BDUD18Ej8","Cajeros");
//		CrearTablas.createTableMaquinasRegistradoras("BDUD18Ej8","Maquinas_Registradoras");
//		CrearTablas.createTableVenta("BDUD18Ej8","Ventas");
//		InsertarDatos.insertProducto("BDUD18Ej8","Productos", "Patata", 15);
		//InsertarDatos.insertCajero("BDUD18Ej8", "Cajeros", "Juan Pérez");
//		InsertarDatos.insertMaquinaRegistradora("BDUD18Ej8","Maquinas_Registradoras", 15);
	//	InsertarDatos.insertVenta("BDUD18Ej8","Ventas", 1, 1, 1);
		InsertarDatos.insertProducto("BDUD18Ej8","Productos", "Agua", 10);
		InsertarDatos.insertCajero("BDUD18Ej8", "Cajeros", "Pepe Pérez");
		InsertarDatos.insertMaquinaRegistradora("BDUD18Ej8","Maquinas_Registradoras", 12);
		InsertarDatos.insertVenta("BDUD18Ej8","Ventas", 2, 2, 2);
		InsertarDatos.insertProducto("BDUD18Ej8","Productos", "Monster", 15);
		InsertarDatos.insertCajero("BDUD18Ej8", "Cajeros", "Pedro Pérez");
		InsertarDatos.insertMaquinaRegistradora("BDUD18Ej8","Maquinas_Registradoras", 25);
		InsertarDatos.insertVenta("BDUD18Ej8","Ventas", 3, 3, 3);
		InsertarDatos.insertProducto("BDUD18Ej8","Productos", "Tijera", 11);
		InsertarDatos.insertCajero("BDUD18Ej8", "Cajeros", "Juco Pérez");
		InsertarDatos.insertMaquinaRegistradora("BDUD18Ej8","Maquinas_Registradoras", 18);
		InsertarDatos.insertVenta("BDUD18Ej8","Ventas", 4, 4, 4);
		InsertarDatos.insertProducto("BDUD18Ej8","Productos", "Pop", 2);
		InsertarDatos.insertCajero("BDUD18Ej8", "Cajeros", "Walter Pérez");
		InsertarDatos.insertMaquinaRegistradora("BDUD18Ej8","Maquinas_Registradoras", 13);
		InsertarDatos.insertVenta("BDUD18Ej8","Ventas", 5, 5, 5);
		
		Conexion.closeConnection();
		
	}

}
