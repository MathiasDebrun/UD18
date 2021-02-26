package Ejercicio9;

import java.sql.Connection;

import Ejercicio9.Conexion;

public class Ejercicio9APP {
	public static Connection conexion;
	public static void main(String[] args) {
		Conexion.openConnection();
//	  CrearBD.createDB("BDUD18Ej9");
//			CrearTablas.createTableFacultad("BDUD18Ej9","Facultad");
//			CrearTablas.createTableInvestigadores("BDUD18Ej9","Investigadores");
//			CrearTablas.createTableEquipos("BDUD18Ej9","Equipos");
//			CrearTablas.createTableReserva("BDUD18Ej9","Reserva");
//			InsertarDatos.insertFacultad("BDUD18Ej9","Facultad", "Ciencias");
//			InsertarDatos.insertInvestigador("BDUD18Ej9", "Investigadores", "1234567A", "Juan Pérez", 1);
//			InsertarDatos.insertEquipo("BDUD18Ej9","Equipos", "1234","Equipo1",1 );
	//		InsertarDatos.insertReserva("BDUD18Ej9","Reserva", "1234567A", "1234", "2021-02-12", "2021-02-12");
		Conexion.closeConnection();
	}

}
