/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author CMaster
 *
 */
public class Camposdefutboldefinitivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int metros;
		int div;
		
		System.out.println("Bienvenido a la calculadora de campos de futbol si introduce 0 a continuación el progrma finalizará:");
		System.out.println("Introduce los metros cuadrados:");
	        metros = entrada.nextInt();
		
		while (metros != 0) {
					
		
	     	{System.out.println("Introduce los campos de futbol:");
			int campos = entrada.nextInt();
	     		if (campos == 0){
			System.out.println("Sintax Error");
		  	
	     	}else {
	     	
	     	div = metros / campos;
		
	     		if (div == 5000){
				System.out.println("SI");
				
			  	
	     		}else {
				System.out.println("NO");
				
	     		}
	     		System.out.println("Introduce los metros cuadrados:");
	     		metros = entrada.nextInt();
				}
	     	}
	     }
		}		

	}


