/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author CMaster
 *
 */
public class SemanalSemana3CamposFutbol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int div;
		
		System.out.println("Introduce los metros cuadrados:");
		int metros = entrada.nextInt();
		System.out.println("Introduce los campos de futbol:");
		int campos = entrada.nextInt();
		
		div = metros / campos;
				
		while (metros == 0) {
			if (div == 5000){
				System.out.println("SI");
				
			}else {
				System.exit(0);
				
				
			}
			entrada.close();
		
		}
	}

}
