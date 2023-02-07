
public class accionesArray {
	
	public static void añadirMascota(String[] especies,String[]razas ,String[] dueños,String especie,String raza,String dueño,int i) {
		
		especies[i] = especie;
		 
		 razas[i] = raza;
		 
		 dueños[i] = dueño;
	}
	public static void buscarMascota(String especie, String raza, String dueño, String[] especies,String[]razas ,String[] dueños, int[] posicionesBusqueda) {
		int k= 0;
		int j = 0;

		int longitudFiltro;
		int longitudDueños;
		
		longitudDueños = dueños.length;
			
			for(int i = 0; i < longitudDueños; i++, j++) {
				if(dueño.equals(dueños[i])) {
					posicionesBusqueda[j] = i;
					
				}else {
					posicionesBusqueda[j] = 99;	
				}
			}
			longitudFiltro = posicionesBusqueda.length;
			j = 0;
			
			for(int i = 0; i< longitudFiltro;i++ ,j++) {
					if(posicionesBusqueda[i] != 99){
						if(especie.equals(especies[posicionesBusqueda[i]])){
							posicionesBusqueda[j] = posicionesBusqueda[i];
						}else {
							posicionesBusqueda[j] = 99;
						}
				}	
			}
			j = 0;
			
			for(int i = 0; i < longitudFiltro; i++, j++) {
					if(posicionesBusqueda[i] != 99){
					if(raza.equals(razas[posicionesBusqueda[i]])) {
						posicionesBusqueda[j] = posicionesBusqueda[i];
					}else {
						posicionesBusqueda[j] = 99;
					}
				}
			}
	}
	
		
	
	public static void buscarMascotaRaza(String raza, String[] razas, int[] posicionesBusqueda) {

		int j = 0;
		int longitudRazas;
		
		
		longitudRazas = razas.length;
		
		for(int i = 0; i < longitudRazas; i++, j++) {
			if(raza.equals(razas[i])) {
				posicionesBusqueda[j] = i;
				
			}else {
				posicionesBusqueda[j] = 99;	
			}
		}
	}
		
	public static void buscarMascotaDueño(String dueño, String[] dueños, int[] posicionesBusqueda) {
		
		int j = 0;
		int longitudDueños;
		
		
		longitudDueños = dueños.length;
		
		for(int i = 0; i < longitudDueños; i++, j++) {
			if(dueño.equals(dueños[i])) {
				posicionesBusqueda[j] = i;
				
			}else {
				posicionesBusqueda[j] = 99;	
			}
		}
	}
	
	public static void buscarMascotaEspecie(String especie, String[] especies, int[] posicionesBusqueda) {
		
		int j = 0;
		int longitudEspecies;
		int[] posicionesFiltro = new int [20];
		
		longitudEspecies = especies.length;
		
		for(int i = 0; i < longitudEspecies; i++, j++) {
			if(especie.equals(especies[i])) {
				posicionesBusqueda[j] = i;
				
			}else {
				posicionesBusqueda[j] = 99;	
			}
		}
	}
	
	public static void modificarMascota(String[] especies,String[]razas ,String[] dueños, int[] posicion) {
		String especie;
		String raza;
		String dueño;
		
		
		mensajes.MenNewEspecie();
		especie = herramientas.pedirString();
		
		mensajes.MenNewRaza();
		raza = herramientas.pedirString();
		
		mensajes.MenNewDueño();
		dueño = herramientas.pedirString();
		
		accionesArray.añadirMascota(especies,razas,dueños,especie, raza, dueño, posicion[0]);
	}
}
