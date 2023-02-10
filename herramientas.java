import java.util.Scanner;

public class herramientas {
	/**Herramientas contiene metodos generales usados en el resto de clases.
	 * Método que pide por teclado una cadena.
	 * @author Adriandela
	 * @return Devuelve la cadena introducida por teclado.
	 */
	public static String pedirString(){
		String mascota;
		
		Scanner lectorStr = new Scanner(System.in);
		mascota = lectorStr.nextLine();
		
		return mascota;
	}
	public static int pedirInt() {
		int numeroLec;
		
		Scanner lectorInt = new Scanner (System.in);
		numeroLec = lectorInt.nextInt();
		lectorInt.nextLine();
		
		return numeroLec;
		
		}
	public static int buclemenu() {
		int eleccionMenu;
		boolean numCorrecto = false;
		
		eleccionMenu = herramientas.pedirInt();
				
		do {
			if(eleccionMenu <=6 && eleccionMenu > 0) {
				numCorrecto = true;
				System.out.println("Ahora si");
			}else {
				System.out.println("Número erroneo");
				eleccionMenu = herramientas.pedirInt();
			}
			
		}while(!numCorrecto);
		
		return eleccionMenu;
	}
	public static int verificarEspacioLibre(String[] mascotas){
		int i = 0;
		boolean libre = false;
		int longitud;
		
		longitud = mascotas.length;
		
		do {
			if(mascotas[i] == "") {
				libre = true;
				
			}else {
				i++;
				libre = false;
			}
		}while(!libre && i < longitud );
		
		
		return i;
	}public static boolean verificarArrayVacio(String[] mascotas){
		int i = 0;
		boolean vacio = true;
		int longitud;
		
		longitud = mascotas.length;
		
		do {
			if(mascotas[i] == "") {
				vacio = true;
				i++;
			}else {
				vacio = false;
			}
		}while(vacio && longitud < 20);
		
		
		return vacio;
	}  
	
		
	

}
