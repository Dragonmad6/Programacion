/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author CMaster
 *
 */
public class Notas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la nota:");
		
		float nota = entrada.nextFloat();
		
		if(nota<5) {
			System.out.println("Tu nota es insuficiente");
			
		}
		else if(nota >=5 && nota <6) {
			System.out.println("Tu nota es suficiente");
		}
		else if(nota >=6 && nota <7) {
			System.out.println("Tu nota es un bien");
		}
		else if(nota >=7 && nota <9) {
			System.out.println("Tu nota es notable");
		}
		else if(nota >=9 && nota <=10) {
			System.out.println("Tu nota es sobresaliente");
		}
		entrada.close();
	}

}
