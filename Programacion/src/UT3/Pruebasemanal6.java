/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author CMaster
 *
 */
public class Pruebasemanal6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		int contador2=0;
		String frase1="";
		String frase2="";
 
		System.out.print("Escriba una palabra: ");
 
		frase1 = entrada.nextLine();
 


 
			System.out.print("Dame una segunda palabra (Tiene que tener los mismos caracteres): ");
			 frase2 = entrada.nextLine();
 

 
		
			for(int contador=0;contador<frase1.length();contador++) {
 
				for(int contador1=0;contador1 < frase1.length();contador1++) {
 
					if(frase1.charAt(contador) == frase2.charAt(contador1)) {
						++contador2;
 
				}
 
			}
		}
 
		if(contador2 ==frase1.length()) {
			System.out.println("Es un anagrama");
		}else {
			System.out.println("No es un anagrama");
		}
	}
 
}