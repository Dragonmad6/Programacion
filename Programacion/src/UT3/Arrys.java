/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author CMaster
 *
 */
public class Arrys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int enteros [];
		enteros = new int [10];
		int suma_de_numeros = 0;
		
		int menor = 0;
		int mayor = 0;

//Bucle para recorrer array y completarlo con valores introducisod por le usuario.	
		
		for (int i=0; i<enteros.lenght; i++) {
			
			System.out.println("Introduce el numero de la posicion"+i);
			enteros [i]= entrada.nextInt();
		}
		for (int j=0; j<enteros.length; j++) {
			suma_de_numeros = suma_de_enteros + enteros [j];
				
				if (j == 0) {
					
					menor=enteros[j];
					mayor=enteros[j];
				}
				if (enteros[j]<menor)
					
					menor=enteros[j];
				
		}
	}

}
