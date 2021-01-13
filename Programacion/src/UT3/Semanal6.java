/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author CMaster
 *
 */
public class Semanal6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner entrada = new Scanner(System.in);
		
		
		String palabra1 = "";
		String palabra2 = "";
		int salir = 0; 
		int salir2 = 0;
		
		while (salir != 1) {

		do{
			System.out.print("Escriba una palabra: ");
 				palabra1 = entrada.nextLine();
 				
 				if (palabra1.length() > 1000) {
 					
 					System.out.println("La palabra no puede ser tan extensa"); 					
 				}else {
 					System.out.print("Dame una segunda palabra (Tiene que tener los mismos caracteres si desea finalizar): ");
 						palabra2 = entrada.nextLine();
 					
 	 				if (palabra2.length() > 1000) {
 	 				
 	 					
 	 					System.out.println("La palabra no puede ser tan extensa"); 
 	 				}
 				}

 	}while (salir != 0); {
 		
 		if (palabra1 == palabra2 || palabra1.length() == palabra2.length()) {

 				System.out.println("Si es un anagrama");
 
 		}else {
 			
 			System.out.println("No es un anagrama");
 		}
			}
 		System.out.println("Si desea salir del programa pulse 1.");
	
 			salir = entrada.nextInt();
}
	}
}
