/**
 * 
 */
package UT3;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author CMaster
 *
 */
public class Poker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int carta [] = new int [4];
		char palo [] = new char [4];
		int suma = 0;
		

				
		System.out.println("Este es el programa de la escalera de color, para elegir un palo debe escribir en mayúscula en pantalla lo siguiente:");
		System.out.println("C = corazones");
		System.out.println("P = picas");
		System.out.println("D = diamantes");
		System.out.println("T = treboles");
		
		
		for (int i = 0; i < carta.length; i++) {
			

			System.out.println("Introduce el numero de la carta que este entre el 1 - 13:");
			
				carta [i] = entrada.nextInt();
				
			System.out.println("Introduce el palo al que corresponde la carta:");
			
				palo [i] = entrada.next().charAt(0);
					    
					suma = carta [0] + carta [1] + carta[2] + carta[3];  
		}		
			if (palo[0]==palo[0]&&palo[0]==palo[1]&&palo[0]==palo[2]&&palo[0]==palo[3]) {
				
				Arrays.sort(carta);
				
				if (carta [0] <=13 && carta[0] >=1 && carta [1] <=13 && carta[1] >=1 && carta [2] <=13 && carta[2] >=1 && carta [3] <=13 && carta[3] >=1) {
					
					//if (carta[0] == carta[1] && carta[0] == carta[2] && carta[0] == carta[3] && carta[1] == carta[0] && carta[1] == carta[2] && carta[1] == carta[3] && carta[2] == carta[3] )
						if (suma == 10) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 14) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 18) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 22) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 26) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 30) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 34 && carta[0] == 7) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 38) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 42) {
							System.out.println("La carta que falta es el "+ (carta [3] + 1));
						}
						if (suma == 46) {
							System.out.println("La carta que falta es el "+ (1));
						}
						if (suma == 11 && carta[0] == 1) {
							System.out.println("La carta que falta es el "+ (4));
						}
						if (suma == 12 && carta[0] == 1) {
							System.out.println("La carta que falta es el "+ (3));
						}
						if (suma == 13 && carta[0] == 1) {
							System.out.println("La carta que falta es el "+ (2));
						}
						if (suma == 17 && carta[0] == 2) {
							System.out.println("La carta que falta es el "+ (3));
						}
						if (suma == 16 && carta[0] == 2) {
							System.out.println("La carta que falta es el "+ (4));
						}
						if (suma == 15 && carta[0] == 2) {
							System.out.println("La carta que falta es el "+ (5));
						}
						if (suma == 21 && carta[0] == 3) {
							System.out.println("La carta que falta es el "+ (4));
						}
						if (suma == 20 && carta[0] == 3) {
							System.out.println("La carta que falta es el "+ (5));
						}
						if (suma == 19 && carta[0] == 3) {
							System.out.println("La carta que falta es el "+ (6));
						}
						if (suma == 25 && carta[0] == 4) {
							System.out.println("La carta que falta es el "+ (5));
						}
						if (suma == 24 && carta[0] == 4) {
							System.out.println("La carta que falta es el "+ (6));
						}
						if (suma == 23 && carta[0] == 4) {
							System.out.println("La carta que falta es el "+ (7));
						}
						if (suma == 29 && carta[0] == 5) {
							System.out.println("La carta que falta es el "+ (6));
						}
						if (suma == 28 && carta[0] == 5) {
							System.out.println("La carta que falta es el "+ (7));
						}
						if (suma == 27 && carta[0] == 5) {
							System.out.println("La carta que falta es el "+ (8));
						}
						if (suma == 33 && carta[0] == 6) {
							System.out.println("La carta que falta es el "+ (7));
						}
						if (suma == 32 && carta[0] == 6) {
							System.out.println("La carta que falta es el "+ (8));
						}
						if (suma == 31 && carta[0] == 6) {
							System.out.println("La carta que falta es el "+ (9));
						}
						if (suma == 37 && carta[0] == 7) {
							System.out.println("La carta que falta es el "+ (8));
						}
						if (suma == 36 && carta[0] == 7) {
							System.out.println("La carta que falta es el "+ (9));
						}
						if (suma == 35 && carta[0] == 7 ) {
							System.out.println("La carta que falta es el "+ (10));
						}
						if (suma == 41 && carta[0] == 8) {
							System.out.println("La carta que falta es el "+ (9));
						}
						if (suma == 40 && carta[0] == 8) {
							System.out.println("La carta que falta es el "+ (10));
						}
						if (suma == 39 && carta[0] == 8) {
							System.out.println("La carta que falta es el "+ (11));
						}
						if (suma == 45 && carta[0] == 9 ) {
							System.out.println("La carta que falta es el "+ (10));
						}
						if (suma == 44 && carta[0] == 9 ) {
							System.out.println("La carta que falta es el "+ (11));
						}
						if (suma == 43 && carta[0] == 9) {
							System.out.println("La carta que falta es el "+ (12));
						}
						if (suma == 36 && carta[0] == 1){
							System.out.println("La carta que falta es el "+ (11));
						}
						if (suma == 35 && carta[0] == 1 ) {
							System.out.println("La carta que falta es el "+ (12));
						}
						if (suma == 34 && carta[0] == 1 ) {
							System.out.println("La carta que falta es el "+ (13));
						}

					
					System.out.println("El palo es de "+ (palo[0]) );
				}
			}

			if (palo[0]!=palo[0]||palo[0]!=palo[1]||palo[0]!=palo[2]||palo[0]!=palo[3]) {
				
				System.out.println("No hay escalera.");
				
			}
			
				
//			
//			System.out.printf("\n");
//	        for(int i=0; i<carta.length; i++) {
//	            System.out.println(carta[i]);
//	        }
//	        for(int i=0; i<palo.length; i++) {
//	            System.out.println(palo[i]);
//	        }	
//		
		
		
		
	}

}	
        	 