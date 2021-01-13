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
 
 	while (salir == 0) {
			System.out.print("Escriba una palabra: ");
 				palabra1 = entrada.nextLine();
 				
 				if (palabra1.length() > 1000) {
 					
 					System.out.println("La palabra no puede ser tan extensa"); 					
 				}else {
 					System.out.print("Dame una segunda palabra (Tiene que tener los mismos caracteres si desea finalizar, escriba 'salir'): ");
 						palabra2 = entrada.nextLine();
 					
 	 				if (palabra2.length() > 1000) {
 	 					
 	 					System.out.println("La palabra no puede ser tan extensa"); 
 	 				}
 				}
	 				salir = 1;	
 			
 	}while (salir != 0); {
 		
 		if (palabra1 == palabra2) {
 			
 			if (palabra1.length() == palabra2.length()) {
 				
 				System.out.println("Si es un anagrama");
 			}
 			
 		}else {
 			
 			System.out.println("No es un anagrama");
 		}
		
			}	

	}
}
