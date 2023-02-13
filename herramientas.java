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
	/**Herramientas contiene metodos generales usados en el resto de clases.
	 * Método que pide por teclado un int.
	 * @author Adriandela
	 * @return Devuelve el número entero intoducido por teclado.
	 */
	public static int pedirInt() {
		int numeroLec;
		
		Scanner lectorInt = new Scanner (System.in);
		numeroLec = lectorInt.nextInt();
		lectorInt.nextLine();
		
		return numeroLec;
	}
	/**Herramientas contiene metodos generales usados en el resto de clases.
	 * Método que comprueba que el número menú está entre los valores deseados.
	 * @author Adriandela
	 * @return Devuelve el número entero de la elección.
	 */
	public static int buclemenu() {
		int eleccionMenu;
		boolean numCorrecto = false;
		
		eleccionMenu = herramientas.pedirInt();
				
		do {
			if(eleccionMenu <=6 && eleccionMenu > 0) {
				numCorrecto = true;
			}else {
				System.out.println("Número erroneo");
				eleccionMenu = herramientas.pedirInt();
			}
		}while(!numCorrecto);
		
		return eleccionMenu;
	}
	/**Herramientas contiene metodos generales usados en el resto de clases.
	 * Método que recorre un array buscando algún espacio vacío para el usuario.
	 * @author Adriandela
	 * @return Devuelve la primera posición vacía que encuentre.
	 */
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
	}
	/**Herramientas contiene metodos generales usados en el resto de clases.
	 * Método que recorre un array comprobando si hay alguna posición utilizada, termina cuando encuentra uno o llega al final del array.
	 * @author Adriandela
	 * @return Devuelve un valor booleano.
	 */
	public static boolean verificarArrayVacio(String[] mascotas){
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
