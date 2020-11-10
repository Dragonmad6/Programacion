package UT3;
import java.util.Scanner;
public class TelasElefante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int telaraña;
		int elefante;
		int suma = 0;
		
			System.out.println("Introduce el peso que soporta la telaraña.");
				telaraña = entrada.nextInt();
			
		while(telaraña !=0){
			
		System.out.println("Introduce el peso de los elefantes.");
			elefante = entrada.nextInt();
		
			suma = suma + elefante;
			
			if (suma > telaraña) {
				System.out.println("La telaraña se ha roto!!!");
					suma = 0;
				System.out.println("Introduce el peso que soporta la telaraña.");
					telaraña = entrada.nextInt();
			}
			if (elefante == 0) {
				System.out.println("La telaraña aguanta más...");
					suma = 0;
				System.out.println("Introduce el peso que soporta la telaraña.");
					telaraña = entrada.nextInt();
			}
		}
		System.out.println("La telaraña tiene que pesar algo.");
		entrada.close();
	}
	
}
