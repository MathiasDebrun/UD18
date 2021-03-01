package Ej3;

import BaseDatos.BD;

public class UD18Ej3 {
	// LLAMADA A METODOS MYSQL
	public static void main(String[] args) {
		final String BD="Almacenes";
		BaseDatos.BD.openConnection();
		BaseDatos.BD.createDB(BD);

	Almacenes.createTableAlmacenes("Almacenes","Almacenes");
	Almacenes.insertAlmacenes("Almacenes","Almacenes", "Tarragona",10);
	Almacenes.insertAlmacenes("Almacenes","Almacenes","Barcelona", 100);
	Almacenes.insertAlmacenes("Almacenes","Almacenes","Girona", 80);
	Almacenes.insertAlmacenes("Almacenes","Almacenes","Lleida", 30);
	Almacenes.insertAlmacenes("Almacenes","Almacenes","Gandesa", 50);	
	
	Cajas.createTableCajas("Almacenes","Cajas");
	Cajas.insertCajas("Almacenes", "Cajas", "E10", "Armario", 10, 1);
	Cajas.insertCajas("Almacenes", "Cajas", "E20", "Silla", 10, 2);
	Cajas.insertCajas("Almacenes", "Cajas", "E30", "Lampara", 10, 3);
	Cajas.insertCajas("Almacenes", "Cajas", "E40", "Espejo", 10, 4);
	Cajas.insertCajas("Almacenes", "Cajas", "E50", "Sofa", 10, 5);		
	
	BaseDatos.BD.closeConnection();

}
}