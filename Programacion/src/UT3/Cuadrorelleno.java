/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author CMaster
 *
 */
public class Cuadrorelleno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		
		int i;
		int j = 0;
		System.out.println("Pideme un numero para que corresponda a los metros que equivalen los lados del cuadrado.");
			int lado = entrada.nextInt();
			
			
			do {
				
			for (i = 1;i <= lado ; i++) {
				
				System.out.printf("* ");
				
				}
			j ++;
			i = 1;
			System.out.printf("\n");
			
			}
			while (lado != j);
			
					
			
			
		
	   
	}		
}