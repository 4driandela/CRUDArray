import java.util.Arrays;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMenu;
		
		int i = 0;
		int j = 0;
		
		String[] especies = {"" , "", "", "","" , "","" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" };
		String[] razas = {"" , "", "", "","" , "","" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" };
		String[] dueños = {"" , "", "", "","" , "","" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" };
		
		
		int[] posicionesBusqueda = new int [20];
		int posicion;
		
		String especie;
		String raza;
		String dueño;
		
		int espacioLibre;
		do {
			mensajes.menu();
			
			numMenu = herramientas.buclemenu();//Devuelve la elección en int del menú;
			
			switch(numMenu) {
			case 1:
				espacioLibre = herramientas.verificarEspacioLibre(dueños);
				System.out.println(espacioLibre);
				if(espacioLibre < 20) {
				
				mensajes.MenEspecie();
				especie = herramientas.pedirString();
				
				mensajes.MenRaza();
				raza = herramientas.pedirString();
				
				mensajes.MenDueño();
				dueño = herramientas.pedirString();
			
				accionesArray.añadirMascota(especies,razas,dueños,especie, raza, dueño, espacioLibre);
				System.out.println((especies[espacioLibre]));
				System.out.println((razas[espacioLibre]));
				System.out.println((dueños[espacioLibre]));
				
				espacioLibre = herramientas.verificarEspacioLibre(dueños);
				System.out.println(espacioLibre);
				}else {
					System.out.println("Lo sentimos, el espacio en memoria está completo");
				}
				
				break;

			case 2:
				if(!herramientas.verificarArrayVacio(dueños)) {
				mensajes.MenFiltroBusqueda();
				numMenu = herramientas.pedirInt();
				
				switch(numMenu) {
				case 1:
					mensajes.MenEspecie();
					especie = herramientas.pedirString();
					
					mensajes.MenRaza();
					raza = herramientas.pedirString();
					
					mensajes.MenDueño();
					dueño = herramientas.pedirString();
					
					accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños,posicionesBusqueda);
					
					for(int m = 0; m < posicionesBusqueda.length; m++) {
						if(posicionesBusqueda[m] != 99) {
							mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
						}
					}
				break;
				case 2:
					mensajes.MenEspecie();
					especie = herramientas.pedirString();
					
					accionesArray.buscarMascotaEspecie(especie, especies, posicionesBusqueda);
					for(int m = 0; m < posicionesBusqueda.length; m++) {
						if(posicionesBusqueda[m] != 99) {
							mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
						}
					}
					break;
					
				case 3:
					mensajes.MenRaza();
					raza = herramientas.pedirString();
					accionesArray.buscarMascotaRaza(raza, razas, posicionesBusqueda);
					
					for(int m = 0; m < posicionesBusqueda.length; m++) {
						if(posicionesBusqueda[m] != 99) {
							mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
						}
					}
					break;
					
				case 4:
					mensajes.MenDueño();
					dueño = herramientas.pedirString();
					accionesArray.buscarMascotaDueño(dueño, dueños, posicionesBusqueda);
					
					for(int m = 0; m < posicionesBusqueda.length; m++) {
						if(posicionesBusqueda[m] != 99) {
							mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
						}
					}
					break;
					}
				}else {
					System.out.println("Lo sentimos, el array actualmente está vacío");
				}
				break;
				
			case 3:
				if(!herramientas.verificarArrayVacio(dueños)) {
				posicion = 0;
				mensajes.MenEspecie();
				especie = herramientas.pedirString();
				
				mensajes.MenRaza();
				raza = herramientas.pedirString();
				
				mensajes.MenDueño();
				dueño = herramientas.pedirString();
				
				accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños,posicionesBusqueda);
				
				for(int m = 0; m < posicionesBusqueda.length; m++) {
					if(posicionesBusqueda[m] != 99) {
						mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
						posicion = m;
					}
				}
				mensajes.MenNewEspecie();
				especies[posicion] = herramientas.pedirString();
				
				mensajes.MenNewRaza();
				razas[posicion] = herramientas.pedirString();
				
				mensajes.MenNewDueño();
				dueños[posicion] = herramientas.pedirString();
				
				mensajes.MenBusquedaRes(especies, razas, dueños, posicion);
				
				System.out.println("Dueños: " + Arrays.toString(dueños));
				System.out.println("Especie " + Arrays.toString(especies));
				System.out.println("Raza " + Arrays.toString(razas));
				}else {
					System.out.println("Lo sentimos, el array actualmente está vacío");
				}
				
					break;
			case 4:
				if(!herramientas.verificarArrayVacio(dueños)) {
					posicion = -1;
					mensajes.MenEspecie();
					especie = herramientas.pedirString();
					
					mensajes.MenRaza();
					raza = herramientas.pedirString();
					
					mensajes.MenDueño();
					dueño = herramientas.pedirString();
					
					accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños,posicionesBusqueda);
				
					for(int m = 0; m < posicionesBusqueda.length; m++) {
						if(posicionesBusqueda[m] != 99) {
							mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda[m]);
							posicion = m;
						}
					}
					if(posicion != -1) {
					especies[posicion] = "";
					
					razas[posicion] = "";
					
					dueños[posicion] = "";
					
					System.out.println("Dueños: " + Arrays.toString(dueños));
					System.out.println("Especie " + Arrays.toString(especies));
					System.out.println("Raza " + Arrays.toString(razas));
						}
				}else {
					System.out.println("Lo sentimos, el array actualmente está vacío");
				}
				break;
			case 5: 
				System.out.println("Dueños: " + Arrays.toString(dueños));
				System.out.println("Especie " + Arrays.toString(especies));
				System.out.println("Raza " + Arrays.toString(razas));
				break;
			case 6: 
				System.out.println("Terminamos con el programa");
				break;
				}
			}while(numMenu != 6);
		}	
	}
		


