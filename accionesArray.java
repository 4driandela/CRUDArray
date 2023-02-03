
public class accionesArray {
	
	public static String[] añadirMascota(String[] especies,String[]razas ,String[] dueños,String especie,String raza,String dueño,int i) {
		
		especies[i] = especie;
		 
		 razas[i] = raza;
		 
		 dueños[i] = dueño;
		
		return especies;
	}
	public static int[] buscarMascota(String especie, String raza, String dueño, String[] especies,String[]razas ,String[] dueños) {
		int k= 0;
		int j = 0;
		int[] posicionesFiltro = new int [20];
		int longitudFiltro;
		int longitudDueños;
		int longitudEspecies;
		int longitudRazas;
		
		longitudDueños = dueños.length;
		longitudEspecies = especies.length;
		longitudRazas = razas.length;
			
			for(int i = 0; i < longitudDueños; i++) {
				if(dueño.equals(dueños[i])) {
				posicionesFiltro[j] = i;
					j++;
				} 
			}
			longitudFiltro = posicionesFiltro.length;
			j = 0;
			
			for(int i = 0; i< longitudFiltro;i++) {
					if(especie.equals(especies[posicionesFiltro[i]])){
						posicionesFiltro[j] = posicionesFiltro[i];
						j++;
					}	
			}
			j = 0;
			
			for(int i = 0; i < longitudFiltro; i++) {
				if(raza.equals(razas[posicionesFiltro[i]])) {
					posicionesFiltro[j] = posicionesFiltro[i];
					j++;
				}
			}
	
		return posicionesFiltro;
	}
	
		
	
	public static int[] buscarMascotaRaza(String raza, String[] razas) {
		int k= 0;
		int j = 0;
		int longitudRazas;
		int[] posicionesFiltro = new int [20];
		
		longitudRazas = razas.length;
		
		for(int i = 0; i < longitudRazas; i++) {
			if(raza.equals(razas[i])) {
				posicionesFiltro[j] = i;
				j++;
			}
		}
		return posicionesFiltro;
	}
		
	public static int[] buscarMascotaDueño(String dueño, String[] dueños) {
		int k= 0;
		int j = 0;
		int longitudDueños;
		int[] posicionesFiltro = new int [20];
		
		longitudDueños = dueños.length;
		
		for(int i = 0; i < longitudDueños; i++) {
			if(dueño.equals(dueños[i])) {
				posicionesFiltro[j] = i;
				j++;
			}
		}
		return posicionesFiltro;
	}
	
	public static int[] buscarMascotaEspecie(String especie, String[] especies) {
		int k= 0;
		int j = 0;
		int longitudEspecies;
		int[] posicionesFiltro = new int [20];
		
		longitudEspecies = especies.length;
		
		for(int i = 0; i < longitudEspecies; i++) {
			if(especie.equals(especies[i])) {
				posicionesFiltro[j] = i;
				j++;
			}
		}
		return posicionesFiltro;
	}
	
	public static void modificarMascota() {
		
	}
}
