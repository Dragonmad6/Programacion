/**
 * 
 */
package objetos;
import java.util.Scanner;
/**
 * @author CMaster
 *
 */
public class Uso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double altura;
		double radio;
		
		System.out.println("Introduce la altura:");
		altura = entrada.nextDouble();
		
		System.out.println("Introduce la radio:");
		radio = entrada.nextDouble();
		
		Cilindro micilindro = new Cilindro(altura, radio);
		
		System.out.println("AREA CILINDRO:"+micilindro.area());
		System.out.println("VOLUMEN CILINDRO:"+micilindro.volumen());
	}

}
