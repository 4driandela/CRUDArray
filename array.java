import java.util.Arrays;
import java.util.zip.ZipError;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMenu;
		
		int i = 0;
		int j = 0;
		String[] especies = {"" ,"" ,"" ,"" ,"" , "","" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" };
		String[] razas = {"" ,"" ,"" ,"" ,"" , "","" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" };
		String[] dueños = {"" , "", "", "","" , "","" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" ,"" };
		
		int[] posicionesBusqueda = new int [20];
		
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
				break;
			case 2:
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
					
					accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños);
					
					do {
						posicionesBusqueda[j] = accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños)[i];
						i++;
						j++;
						
					}while(accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños)[i] != 0);
					i = 0;
					j = 0;
					
					do {
						mensajes.MenBusquedaRes(especies, razas, dueños,posicionesBusqueda, j, i);
						j++;
						i++;
						
					}while(posicionesBusqueda[j] != 0);
					j = 0;
					i = 0;
					break;
				case 2:
					mensajes.MenEspecie();
					especie = herramientas.pedirString();
					
					do {
						posicionesBusqueda[j] = accionesArray.buscarMascotaEspecie(especie,especies)[i];
						i++;
						j++;
						
					}while(accionesArray.buscarMascotaEspecie(especie,especies)[i] != 0);
					j = 0;
					i = 0;
					do {
						mensajes.MenBusquedaRes(especies, razas, dueños,posicionesBusqueda, j, i);
						j++;
						i++;
					}while(posicionesBusqueda[j] != 0);
					j = 0;
					i = 0;
					break;
					
				case 3:
					mensajes.MenRaza();
					raza = herramientas.pedirString();
					
					do {
						posicionesBusqueda[j] = accionesArray.buscarMascotaRaza(raza,razas)[i];
						i++;
						j++;
						
					}while(accionesArray.buscarMascotaRaza(raza,razas)[i] != 0);
					j = 0;
					i = 0;
					do {
						mensajes.MenBusquedaRes(especies, razas, dueños,posicionesBusqueda, j, i);
						j++;
						i++;
						
					}while(posicionesBusqueda[j] != 0);
					j = 0;
					i = 0;
					break;
					
				case 4:
					mensajes.MenDueño();
					dueño = herramientas.pedirString();
					
					do {
						posicionesBusqueda[j] = accionesArray.buscarMascotaDueño(dueño,dueños)[i];
						i++;
						j++;
						
					}while(accionesArray.buscarMascotaDueño(dueño,dueños)[i] != 0);
					j = 0;
					i = 0;
					do {
						
						mensajes.MenBusquedaRes(especies, razas, dueños,posicionesBusqueda, j, i);
						j++;
						i++;
						
					}while(posicionesBusqueda[j] != 0);
					j = 0;
					i = 0;
					break;
				}
				break;
			case 3: 
				mensajes.MenEspecie();
				especie = herramientas.pedirString();
				
				mensajes.MenRaza();
				raza = herramientas.pedirString();
				
				mensajes.MenDueño();
				dueño = herramientas.pedirString();
				
				accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños);
				
				
				do {
					posicionesBusqueda[j] = accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños)[i];
					i++;
					j++;
					
				}while(accionesArray.buscarMascota(especie, raza, dueño, especies, razas, dueños)[i] != 0);
				i = 0;
				j = 0;
				
				do {
					mensajes.MenBusquedaRes(especies, razas, dueños,posicionesBusqueda, j, i);
					j++;
					i++;
					
				}while(posicionesBusqueda[j] != 0);
				j = 0;
				i = 0;
			
			mensajes.MenNewEspecie();
			especie = herramientas.pedirString();
			
			mensajes.MenNewRaza();
			raza = herramientas.pedirString();
			
			mensajes.MenNewDueño();
			dueño = herramientas.pedirString();
			
			accionesArray.añadirMascota(especies,razas,dueños,especie, raza, dueño,posicionesBusqueda[0]);
			mensajes.MenBusquedaRes(especies, razas, dueños, posicionesBusqueda, j, i);

			case 4:
					System.out.println("Dueños: " + Arrays.toString(dueños));
					System.out.println("Especie " + Arrays.toString(especies));
					System.out.println("Raza " + Arrays.toString(razas));
			case 5: 
					System.out.println("Terminamos con el programa");
					break;
				}
			}while(numMenu != 5);
		}	
	}
		


