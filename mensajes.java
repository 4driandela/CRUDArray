
public class mensajes {
	
	public static void menu() {
		System.out.println("Qué accion queres realizar? \n1- Añadir mascota.\n2- Buscar mascota.\n3- Modificar mascota.\n4- Buscar mascota.\n5- Exit");
	}
	
	public static void MenFiltroBusqueda(){
		System.out.println("Qué acción quieres realizar? \n 1- Filtrar con los tres valores. \n 2- Filtrar por especie. \n 3- Filtrar por raza. \n 4- Filtrar por dueño.");
	}
	public static void MenEspecie() {
		System.out.println("De que especie es tu mascota?");
	}public static void MenRaza() {
		System.out.println("De que raza es tu mascota?");
	}public static void MenDueño() {
		System.out.println("Quién es el dueño?");
	}
	
	public static void MenNewEspecie() {
		System.out.println("Cuál es el nuevo valor para especie?");
	}public static void MenNewRaza() {
		System.out.println("Cual es el nuevo valor de raza para tu mascota?");
	}public static void MenNewDueño() {
		System.out.println("Cuál es el nuevo para dueño?");
	}
	
	public static void MenBusquedaRes(String[] especies,String[]razas,String[]dueños,int[]posicionesBusqueda, int j, int i){
		System.out.println(i + 1);
		System.out.println("	- Especie: " + especies[posicionesBusqueda[j]]);
		System.out.println("	- Raza: " + razas[posicionesBusqueda[j]]);
		System.out.println("	- Dueño: " + dueños[posicionesBusqueda[j]]);
		System.out.println("");
		
	}
}
