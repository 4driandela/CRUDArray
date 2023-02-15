import java.util.Arrays;

public class mensajes {

	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el menú de
	 * elección del programa.
	 * 
	 * @author Adriandela
	 */
	public static void menu() {
		System.out.println(
				"Qué accion queres realizar? \n1- Añadir mascota.\n2- Buscar mascota.\n3- Modificar mascota.\n4- Borrar mascota.\n5- Vista general de los datos guardados\n6- Exit.");
	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el menú de
	 * elección dentro de buscar "mascota".
	 * 
	 * @author Adriandela
	 */
	public static void MenFiltroBusqueda() {
		System.out.println(
				"Qué acción quieres realizar? \n 1- Filtrar con los tres valores. \n 2- Filtrar por especie. \n 3- Filtrar por raza. \n 4- Filtrar por dueño.");
	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el mensaje menú
	 * de busqueda de especie.
	 * 
	 * @author Adriandela
	 */
	public static void MenEspecie() {
		System.out.println("De que especie es tu mascota?");
	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el mensaje menú
	 * de busqueda de raza.
	 * 
	 * @author Adriandela
	 */
	public static void MenRaza() {
		System.out.println("De que raza es tu mascota?");
	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el mensaje menú
	 * de busqueda de dueño.
	 * 
	 * @author Adriandela
	 */
	public static void MenDueño() {
		System.out.println("Quién es el dueño?");
	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el mensaje de
	 * nuevo valor de especie.
	 * 
	 * @author Adriandela
	 */
	public static void MenNewEspecie() {
		System.out.println("Cuál es el nuevo valor para especie?");
	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el mensaje de
	 * nuevo valor de raza.
	 * 
	 * @author Adriandela
	 */
	public static void MenNewRaza() {
		System.out.println("Cual es el nuevo valor de raza para tu mascota?");
	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el mensaje de
	 * nuevo valor de dueño.
	 * 
	 * @author Adriandela
	 */
	public static void MenNewDueño() {
		System.out.println("Cuál es el nuevo para dueño?");
	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el contenido de
	 * los tres arrays en una posición determinada
	 * 
	 * @author Adriandela
	 * @param especies           String[] que guarda los valores registrados
	 *                           previamente de especie.
	 * @param razas              String[] que guarda los valores registrados
	 *                           previamente de raza.
	 * @param dueños             String[] que guarda los valores registrados
	 *                           previamente de dueño.
	 * @param posicionesBusqueda int que indica la posición del array.
	 * 
	 */
	public static void MenBusquedaRes(String[] especies, String[] razas, String[] dueños, int posicionesBusqueda) {

		System.out.println("Pos:" + posicionesBusqueda);
		System.out.println("Especie: " + especies[posicionesBusqueda]);
		System.out.println("Raza: " + razas[posicionesBusqueda]);
		System.out.println("Dueño: " + dueños[posicionesBusqueda]);
		System.out.println("");

	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el contenido
	 * del array Especies en una posición determinada
	 * 
	 * @author Adriandela
	 * @param razas              String[] que guarda los valores registrados
	 *                           previamente de especie.
	 * @param posicionesBusqueda int que indica la posición del array.
	 * 
	 */
	public static void MenBusquedaEspecie(String[] especies, int posicionesBusqueda) {

		System.out.println("Pos:" + posicionesBusqueda);
		System.out.println("Especie: " + especies[posicionesBusqueda]);
		System.out.println("");

	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el contenido
	 * del array Razas en una posición determinada
	 * 
	 * @author Adriandela
	 * @param razas              String[] que guarda los valores registrados
	 *                           previamente de raza.
	 * @param posicionesBusqueda int que indica la posición del array.
	 * 
	 */
	public static void MenBusquedaRaza(String[] razas, int posicionesBusqueda) {

		System.out.println("Pos:" + posicionesBusqueda);
		System.out.println("Raza: " + razas[posicionesBusqueda]);
		System.out.println("");

	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla el contenido
	 * del array Dueños en una posición determinada
	 * 
	 * @author Adriandela
	 * @param razas              String[] que guarda los valores registrados
	 *                           previamente de dueño.
	 * @param posicionesBusqueda int que indica la posición del array.
	 * 
	 */
	public static void MenBusquedaDueño(String[] dueños, int posicionesBusqueda) {

		System.out.println("Pos:" + posicionesBusqueda);
		System.out.println("Dueño: " + dueños[posicionesBusqueda]);
		System.out.println("");

	}
	/**
	 * Clase que recoge los metodos de mensaje. Muestra por pantalla todos los datos
	 * guardados.
	 * 
	 * @author Adriandela
	 * @param razas    String[] array que tiene almacenados los valores de raza.
	 * @param especies String[] array que tiene almacenados los valores de especie.
	 * @param dueños   String[] array que tiene almacenados los valores de dueño.
	 */
	public static void vistaArrays(String[] dueños, String[] especies, String[] razas) {
		System.out.println("Dueños: " + Arrays.toString(dueños));
		System.out.println("Especie " + Arrays.toString(especies));
		System.out.println("Raza " + Arrays.toString(razas));
	}

}
