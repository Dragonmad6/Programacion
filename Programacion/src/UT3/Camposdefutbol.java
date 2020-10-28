/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author CMaster
 *
 */
public class Camposdefutbol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);

	        double key = 1;
	        int dim;

	        while (key >= 1) {
	            System.out.println("Introduce los metros del campo: " );
	            int campo = entrada.nextInt();
	            System.out.println("Intorduce los campos: ");
	            int metros = entrada.nextInt();

	            dim = campo / metros;

	            if (dim == 5000) {
	                System.out.println("Si");
	            }
	            else if (dim != 5000) {
	                System.out.println("No");
	                System.out.println("Continuar con la operacion pulse 1 para cancelar pulse 0 ");
	                double cerr = entrada.nextInt();

	                key = 1 * cerr;
	            }

	        }
	    }
	}
