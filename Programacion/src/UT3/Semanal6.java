/**
 * 
 */
package UT3;
import java.util.Scanner;
import java.util.Arrays;
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
 
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner salida = new Scanner(System.in);
		
		String salir = "";
		String palabra1 = "";
		String palabra2 = "";
		
		System.out.println("Programa de Anagramas");
		do {
			System.out.println("Escriba 'salir' para detener el programa sino escriba cualquier cosa:\n");
				salir = salida.nextLine();
			if(salir.equals("salir") == true) {
				System.out.println("El programa ha finalizado.");
			}else {
				System.out.println("Escriba la primera palabra: \n");
					palabra1 = entrada1.nextLine();	
				System.out.println("Escriba la segunda palabra: \n");
					palabra2 = entrada2.nextLine();
				
				char[] frase1 = palabra1.toCharArray();
				char[] frase2 = palabra2.toCharArray();
				
				Arrays.sort(frase1);
				Arrays.sort(frase2);
				
				palabra1 = new String(frase1);					
				palabra2 = new String(frase2);	

				if (palabra1.equals(palabra2)) {
					System.out.println("Si es un anagrama.\n");
				} else {
					System.out.println("No es un anagrama.\n");
				}
			}
		}while(salir.equals("salir") == false);
	}
}

