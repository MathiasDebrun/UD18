package Ej4;

public class UD18Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String BD="BDUD18EJ4";
		BaseDatos.BD.openConnection();
//		BaseDatos.BD.createDB(BD);
//		Peliculas.createTablePeliculas(BD);
//		Salas.createTableSalas(BD);
		Peliculas.insertPeliculas(BD, "La tumba de las luciérnagas", 4);
		Peliculas.insertPeliculas(BD, "Marvel Avengers", 8);
		Peliculas.insertPeliculas(BD, "Intelestelar", 12);
		Peliculas.insertPeliculas(BD, "Inside out", 18);
		Peliculas.insertPeliculas(BD, "Peppa pig the movie", 0);
		Salas.insertSalas(BD, "Studio Ghibli", 1);
		Salas.insertSalas(BD, "Disney", 2);
		Salas.insertSalas(BD, "Dolby Atmos", 3);
		Salas.insertSalas(BD, "Pixar", 4);
		Salas.insertSalas(BD, "Infantil", 5);
		BaseDatos.BD.closeConnection();
	}

}
