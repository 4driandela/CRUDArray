
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMenu;

		String[] especies = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
		String[] razas = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
		String[] dueños = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

		int[] posicionesBusqueda = new int[20];
		int posicion;

		String especie;
		String raza;
		String dueño;

		int espacioLibre;
		do {
			mensajes.menu();

			numMenu = herramientas.buclemenu();

			switch (numMenu) {
			case 1:// Añade datos a los arrays.
				espacioLibre = herramientas.verificarEspacioLibre(dueños);
				System.out.println(espacioLibre);
				if (espacioLibre < 20) {

					mensajes.MenEspecie();
					especie = herramientas.pedirString();

					mensajes.MenRaza();
					raza = herramientas.pedirString();

					mensajes.MenDueño();
					dueño = herramientas.pedirString();

					accionesArray.añadirMascota(especies, razas, dueños, especie, raza, dueño, espacioLibre);
				} else {
					System.out.println("Lo sentimos, el espacio en memoria está completo");
				}
				break;

			case 2:
				if (!herramientas.verificarArrayVacio(dueños)) {
					mensajes.MenFiltroBusqueda();
					numMenu = herramientas.pedirInt();

					switch (numMenu) {
					case 1:// Busqueda de valores filtrando por los tres valores.
						mensajes.MenEspecie();
						especie = herramientas.pedirString();

						mensajes.MenRaza();
						raza = herramientas.pedirString();

						mensajes.MenDueño();
						dueño = herramientas.pedirString();

						accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños, posicionesBusqueda);
						
						posicion = -1;
						for (int m = 0; m < posicionesBusqueda.length; m++) {//
							if (posicionesBusqueda[m] != 99) {// En el método de busqueda, guarda un 99 en todas las
																// posiciones del array que no coinciden. Se aplica
																// también a los otros métodos de búsqueda.
								mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
								posicion = m;
							}
						}if(posicion == -1) {
							System.out.println("Lo sentimos, no encontramos los datos");
						}
						break;
					case 2:// Busqueda de valores filtrando por especie
						mensajes.MenEspecie();
						especie = herramientas.pedirString();
						
						accionesArray.buscarMascotaEspecie(especie, especies, posicionesBusqueda);
						
						posicion = -1;
						for (int m = 0; m < posicionesBusqueda.length; m++) {
							if (posicionesBusqueda[m] != 99) {
								mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
								posicion = m;
							}
						}
						if(posicion == -1) {
							System.out.println("Lo sentimos, no encontramos los datos");
						}
						break;

					case 3:// Busqueda de valores filtrando por raza.
						mensajes.MenRaza();
						raza = herramientas.pedirString();
						
						accionesArray.buscarMascotaRaza(raza, razas, posicionesBusqueda);
						
						posicion = -1;
						for (int m = 0; m < posicionesBusqueda.length; m++) {
							if (posicionesBusqueda[m] != 99) {
								mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
								posicion = m;
							}
						}
						if(posicion == -1) {
							System.out.println("Lo sentimos, no encontramos los datos");
						}
						break;

					case 4:// Busqueda de valores filtrando por dueño.
						mensajes.MenDueño();
						dueño = herramientas.pedirString();
						
						accionesArray.buscarMascotaDueño(dueño, dueños, posicionesBusqueda);
						
						posicion = -1;
						for (int m = 0; m < posicionesBusqueda.length; m++) {
							if (posicionesBusqueda[m] != 99) {
								mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
								posicion = m;
							}
						}
						if(posicion == -1) {
							System.out.println("Lo sentimos, no encontramos los datos");
						}
						break;
					}
				} else {
					System.out.println("Lo sentimos, el array actualmente está vacío");
				}
				break;

			case 3:// Modifica los datos en una posición del array.
				if (!herramientas.verificarArrayVacio(dueños)) {
					posicion = -1;// Se mantiene el valor de -1 para posición si no hay ninguna coincidencia. Se
									// emplea en modificar y borrar para que no imprima la primera posición de los
									// arrays.
					mensajes.MenEspecie();
					especie = herramientas.pedirString();

					mensajes.MenRaza();
					raza = herramientas.pedirString();

					mensajes.MenDueño();
					dueño = herramientas.pedirString();

					accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños, posicionesBusqueda);

					for (int m = 0; m < posicionesBusqueda.length; m++) {
						if (posicionesBusqueda[m] != 99) {
							mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
							posicion = m;
						}
					}
					if (posicion != -1) {
						mensajes.MenNewEspecie();
						especies[posicion] = herramientas.pedirString();

						mensajes.MenNewRaza();
						razas[posicion] = herramientas.pedirString();

						mensajes.MenNewDueño();
						dueños[posicion] = herramientas.pedirString();

						mensajes.MenBusquedaRes(especies, razas, dueños, posicion);

						mensajes.vistaArrays(dueños, especies, razas);
					} else {
						System.out.println("Lo sentimos, no encontramos los datos a modificar");
					}
				} else {
					System.out.println("Lo sentimos, el array actualmente está vacío");
				}

				break;
			case 4:// Borra los valores en una posición del array.
				if (!herramientas.verificarArrayVacio(dueños)) {
					posicion = -1;
					mensajes.MenEspecie();
					especie = herramientas.pedirString();

					mensajes.MenRaza();
					raza = herramientas.pedirString();

					mensajes.MenDueño();
					dueño = herramientas.pedirString();

					accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños, posicionesBusqueda);

					for (int m = 0; m < posicionesBusqueda.length; m++) {
						if (posicionesBusqueda[m] != 99) {
							mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
							posicion = m;
						}
					}
					if (posicion != -1) {
						accionesArray.borrarArray(dueños, especies, razas, posicion);
					} else {
						System.out.println("Lo sentimos, no encontramos los datos a borrar");
					}
				} else {
					System.out.println("Lo sentimos, el array actualmente está vacío");
				}
				break;
			case 5:// Muestra los valores que contienen los arrays.
				mensajes.vistaArrays(dueños, especies, razas);

				break;
			case 6:// Finaliza con el programa.
				System.out.println("Terminamos con el programa");
				break;
			}
		} while (numMenu != 6);
	}
}