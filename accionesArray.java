
public class accionesArray {
	/**
	 * AccionesArray contiene los métodos empleados para añadir o buscar. Añade los
	 * tres nuevos strings a la posición correspondiente con cada uno de los arrays.
	 * 
	 * @author Adriandela
	 *
	 * @param especies Array que guarda las especies que se registran.
	 * @param razas    Array que guarda las razas que se registran.
	 * @param dueños   Array que guarda los dueños que se registran.
	 * @param especie  String que recoge la especie a añadir al array.
	 * @param raza     String que recoge la raza a añadir al array.
	 * @param dueño    String que recoge el dueño a añadir al array.
	 * @param i        Int que hace alusión a la posicion del array.
	 *
	 */
	public static void añadirMascota(String[] especies, String[] razas, String[] dueños, String especie, String raza,
			String dueño, int i) {

		especies[i] = especie;

		razas[i] = raza;

		dueños[i] = dueño;
	}

	/**
	 * AccionesArray contiene los métodos empleados para añadir o buscar. Busca
	 * filtrando por los tres valores que introduce el usuario por consola (String
	 * dueño, String especie y String raza).
	 * 
	 * @author Adriandela
	 *
	 * @param especies           String[] que tiene guardados los string registrados
	 *                           previamente especie.
	 * @param razas              String[] que tiene guardados los string registrados
	 *                           previamente de raza.
	 * @param dueños             String[] que tiene guardados los string registrados
	 *                           previamente de dueño.
	 * @param especie            String que recoge la especie a buscar en el array.
	 * @param raza               String que recoge la raza a buscar en el array.
	 * @param dueño              String que recoge el dueño a buscar en el array.
	 * @param posicionesBusqueda Int[] que guarda las posiciones que coinciden con
	 *                           los tres valores del filtro.
	 *
	 */
	public static void buscarMascota(String especie, String raza, String dueño, String[] especies, String[] razas,
			String[] dueños, int[] posicionesBusqueda) {
		int j = 0;

		int longitudFiltro;
		int longitudDueños;

		longitudDueños = dueños.length;
		// Utilizo bucles for para que guarde varias posiciones si se da el caso de que
		// se hayan guardado diferentes entrada con datos idénticos.
		for (int i = 0; i < longitudDueños; i++, j++) {// Guarda las posiciones que coinciden con el valor de dueño del
														// array dueños en int[]posicionesBusqueda.
			if (dueño.equals(dueños[i])) {
				posicionesBusqueda[j] = i;

			} else {
				posicionesBusqueda[j] = 99;
			}
		}
		longitudFiltro = posicionesBusqueda.length;
		j = 0;

		for (int i = 0; i < longitudFiltro; i++, j++) {// De las posiciones previamente guardadas vuelve a filtrar las
														// que coinciden con el valor de especie.
			if (posicionesBusqueda[i] != 99) {
				if (especie.equals(especies[posicionesBusqueda[i]])) {
					posicionesBusqueda[j] = posicionesBusqueda[i];
				} else {
					posicionesBusqueda[j] = 99;
				}
			}
		}
		j = 0;

		for (int i = 0; i < longitudFiltro; i++, j++) {// Termina con un último filtrado similar a los anteriores con el
														// valor de raza.
			if (posicionesBusqueda[i] != 99) {
				if (raza.equals(razas[posicionesBusqueda[i]])) {
					posicionesBusqueda[j] = posicionesBusqueda[i];
				} else {
					posicionesBusqueda[j] = 99;
				}
			}
		}
	}

	/**
	 * AccionesArray contiene los métodos empleados para añadir o buscar. Busca
	 * filtrando por el valor raza.
	 * 
	 * @author Adriandela
	 *
	 * @param razas              String[] que tiene guardados los string registrados
	 *                           previamente de raza.
	 * @param raza               String que recoge la raza a buscar en el array.
	 * @param posicionesBusqueda Int[] que guarda las posiciones que coinciden con
	 *                           el valor de raza.
	 */

	public static void buscarMascotaRaza(String raza, String[] razas, int[] posicionesBusqueda) {
		// Guarda las posiciones de coincidencia en el array posicionesBusqueda.
		int j = 0;
		int longitudRazas;

		longitudRazas = razas.length;

		for (int i = 0; i < longitudRazas; i++, j++) {
			if (raza.equals(razas[i])) {
				posicionesBusqueda[j] = i;

			} else {
				posicionesBusqueda[j] = 99;
			}
		}
	}

	/**
	 * AccionesArray contiene los métodos empleados para añadir o buscar. Busca
	 * filtrando por el valor dueño.
	 * 
	 * @author Adriandela
	 *
	 * @param dueños             String[] que tiene guardados los string registrados
	 *                           previamente de dueño.
	 * @param dueño              String que recoge la dueño a buscar en el array.
	 * @param posicionesBusqueda Int[] que guarda las posiciones que coinciden con
	 *                           el valor de dueño.
	 */
	public static void buscarMascotaDueño(String dueño, String[] dueños, int[] posicionesBusqueda) {
		// Guarda las posiciones de coincidencia en el array posicionesBusqueda.
		int j = 0;
		int longitudDueños;

		longitudDueños = dueños.length;

		for (int i = 0; i < longitudDueños; i++, j++) {
			if (dueño.equals(dueños[i])) {
				posicionesBusqueda[j] = i;

			} else {
				posicionesBusqueda[j] = 99;
			}
		}
	}

	/**
	 * AccionesArray contiene los métodos empleados para añadir o buscar. Busca
	 * filtrando por el valor especie.
	 * 
	 * @author Adriandela
	 *
	 * @param especies           String[] que tiene guardados los string registrados
	 *                           previamente de especie.
	 * @param especie            String que recoge la especie a buscar en el array.
	 * @param posicionesBusqueda Int[] que guarda las posiciones que coinciden con
	 *                           el valor de especie.
	 */
	public static void buscarMascotaEspecie(String especie, String[] especies, int[] posicionesBusqueda) {
		// Guarda las posiciones de coincidencia en el array posicionesBusqueda.
		int j = 0;
		int longitudEspecies;

		longitudEspecies = especies.length;

		for (int i = 0; i < longitudEspecies; i++, j++) {
			if (especie.equals(especies[i])) {
				posicionesBusqueda[j] = i;

			} else {
				posicionesBusqueda[j] = 99;
			}
		}
	}

	/**
	 * AccionesArray contiene los métodos empleados para añadir, buscar y modificar.
	 * Método que "borra" la posición seleccionada.
	 * 
	 * @author Adriandela
	 *
	 * @param especies String[] Array que tiene guardados los string registrados
	 *                 previamente de especie.
	 * @param dueños   String[] Array que tiene guardados los string registrados
	 *                 previamente de especie.
	 * @param razas    String[] Array que tiene guardados los string registrados
	 *                 previamente de especie.
	 * @param posicion int que tiene guardado la posición a borrar.
	 */
	public static void borrarArray(String[] dueños, String[] especies, String[] razas, int posicion) {
		especies[posicion] = "";

		razas[posicion] = "";

		dueños[posicion] = "";

		mensajes.vistaArrays(dueños, especies, razas);
	}

}
