package ACTIVIDAD22;
import java.util.Scanner;
import java.util.ArrayList;
public class Actividad23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Libro> libreria = new ArrayList<Libro>();
		
	//Scanner
		 Scanner sc = new Scanner(System.in);
		 Scanner sc2 = new Scanner(System.in);
	
	//Variables
		int opcion;
		String titulo;
		String autor;
		int ejemplares;
		int prestamos;
		
	//Menu
		do {
		System.out.println("Acceso al menú:");
		System.out.println("1. Se dará de alta el siguiente libro.");
		System.out.println("2. Consulta del libro seleccionado.");
		System.out.println("3. Se dará de baja el siguiente libro.");
		System.out.println("4. Préstamo de un libro.");
		System.out.println("5. Se hará la devolución del libro.");
		System.out.println("0.Si desea salir del menú.\n");
			opcion = sc.nextInt();

	//Cases
		
		switch(opcion) {
			//Characteristics of the book
			case 1:
					System.out.println("Escriba a continuación las características del libro.");
					System.out.println("Nombre del libro: ");
						titulo = sc2.next(); 
					System.out.println("Autor del libro: ");
						autor = sc2.next();
					System.out.println("Ejemplares de los que dispone: ");
						ejemplares = sc.nextInt();
					System.out.println("Prestamos realizados: ");
						prestamos = sc.nextInt();
				//Can´t be true more examples than books 
					if(prestamos > ejemplares) {
						prestamos = 0;
					}
				//Save all the data in the ArrayList
					libreria.add(new Libro(titulo,autor,ejemplares,prestamos));
						System.out.println("El registro de su libro ha sido completado con éxito.\n");
						
					break;
			//Look to the data of the book
			case 2:
				System.out.println("Escriba a continuación el título del libro del que desea hacer una consulta:");
					titulo = sc2.next();
				
				for(int i=0;i<libreria.size();i++) {
					if(libreria.get(i).getTitulo().equals(titulo)) {
						System.out.println("Libro número "+(i+1));
						System.out.println("Titulo: "+libreria.get(i).getTitulo());
						System.out.println("Autor: "+libreria.get(i).getAutor());
						System.out.println("Ejemplares: "+libreria.get(i).getEjemplares());
						System.out.println("Prestamos: "+libreria.get(i).getPrestamos()+"\n");	
				//If the title of the book is incorrect
					}else {
						System.out.println("Asegurese de escribir correctamente el título.\n");
					}
				}
					break;
			//Quit books of the library
			case 3:
				
				System.out.println("Introduzca el libro que desea dar de baja:");
					titulo = sc2.next();
				for(int i=0;i<libreria.size();i++) {
					if(libreria.get(i).getTitulo().equals(titulo)) {
						libreria.remove(i);
					}else {
						System.out.println("El libro que ha seleccionado ya está dado de baja o no está en nuestro registro, compruebelo de nuevo disculpe las molestias.");
					}
					System.out.println("El libro ha sido dado de baja.\n");
				}
					break;
			//Rent a book
			case 4:
				System.out.println("Diganos que libro desea alquilar:");
					titulo = sc2.next();
				for(int i=0;i<libreria.size();i++) {
					if(libreria.get(i).getTitulo().equals(titulo)) {
						libreria.get(i).prestamo();
					}else {
						System.out.println("No tenemos más ejemplares disponibles.");
					}
					System.out.println("El alquiler de su libro a sido completado correctamente.");
				}
					break;
			//Give the book back
			case 5:
				System.out.println("Introduzca el nombre del libro que desea devolver:");
					titulo = sc2.next();
				for(int i=0;i<libreria.size();i++) {
					if(libreria.get(i).getTitulo().equals(titulo)) {
						libreria.get(i).devolucion();
						
					}
					
				}
					break;
		
		}
		//Exit
	}while(opcion != 0);
		System.out.println("Gracias por visitar nuestra librería hasta pronto.");
	}
}