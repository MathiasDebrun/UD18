package Ej7;

import Ej4.Peliculas;
import Ej4.Salas;

public class UD18Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String BD="BDUD18EJ7";
		BaseDatos.BD.openConnection();
//		BaseDatos.BD.createDB(BD);
//		Cientificos.createTableCientificos(BD);
//		Proyecto.createTableProyecto(BD);
//		Asignado_a.createTableAsignado_a(BD);
		Proyecto.insertProyecto(BD, "A1", "Albañiles", 3);
		Proyecto.insertProyecto(BD, "A2", "Labrador", 7);
		Proyecto.insertProyecto(BD, "A3", "Mesa", 2);
		Proyecto.insertProyecto(BD, "A4", "Mantel", 8);
		Proyecto.insertProyecto(BD, "A5", "Patata", 3);
		
		Cientificos.insertCientificos(BD, "48003322", "Manolo");
		Cientificos.insertCientificos(BD, "48003323", "Juan");
		Cientificos.insertCientificos(BD, "48003324", "Marc");
		Cientificos.insertCientificos(BD, "48003325", "Estefania");
		Cientificos.insertCientificos(BD, "48003326", "Matias");
		
		Asignado_a.insertAsignado_a(BD, "48003322", "A1");
		Asignado_a.insertAsignado_a(BD, "48003323", "A2");
		Asignado_a.insertAsignado_a(BD, "48003324", "A3");
		Asignado_a.insertAsignado_a(BD, "48003325", "A4");
		Asignado_a.insertAsignado_a(BD, "48003326", "A5");
		BaseDatos.BD.closeConnection();

	}

}
