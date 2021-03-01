package Ej6;

public class UD18Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseDatos.BD.openConnection();
		BaseDatos.BD.createDB("PiezasProveedores");
		
		Piezas.createTablePiezas("PiezasProveedores","Piezas");
		Piezas.insertPiezas("PiezasProveedores","Piezas", "Tornillo");
		Piezas.insertPiezas("PiezasProveedores","Piezas", "Clavo");
		Piezas.insertPiezas("PiezasProveedores","Piezas", "Plano");
		Piezas.insertPiezas("PiezasProveedores","Piezas", "Estrella");
		Piezas.insertPiezas("PiezasProveedores","Piezas", "Bisagra");


		Proveedores.createTableProveedores("PiezasProveedores","Proveedores");
		Proveedores.insertProveedores("PiezasProveedores","Proveedores","6D","Juan");
		Proveedores.insertProveedores("PiezasProveedores","Proveedores","7E","Marc");
		Proveedores.insertProveedores("PiezasProveedores","Proveedores","8F","David");
		Proveedores.insertProveedores("PiezasProveedores","Proveedores","9G","Mathias");
		Proveedores.insertProveedores("PiezasProveedores","Proveedores","10H","Victor");
		
		
		Suministra.createTableSuministra("PiezasProveedores","Suministra");
		Suministra.insertSuministra("PiezasProveedores","Suministra",1,"6D",12);
		Suministra.insertSuministra("PiezasProveedores","Suministra",2,"7E",13);
		Suministra.insertSuministra("PiezasProveedores","Suministra",3,"8F",14);
		Suministra.insertSuministra("PiezasProveedores","Suministra",4,"9G",15);
		Suministra.insertSuministra("PiezasProveedores","Suministra",5,"10H",16);

		BaseDatos.BD.closeConnection();
}

}
