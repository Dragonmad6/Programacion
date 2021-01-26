/**
 * 
 */
package ACTIVIDAD22;
import java.util.Scanner;
/**
 * @author CMaster
 *
 */
public class actividad22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String titulo, autor;
			 int ejemplares;
		// Crea un objeto de la clase Libro llamado libro1 con los siguientes datos
			 Libro libro1 = new Libro("La casa de la pradera", "Chiquito de la calzada", 10, 9);
	    // Crea un objeto de la clase Libro llamado libro2 con los siguientes datos:
			 Libro libro2 = new Libro("El ultimo mohicano", "Kiko Rivera", 5, 4);
	    //Simula un alquiler del libro1 y comprueba si se ha hecho o no.
			 if (libro1.prestamo()) {
			 System.out.println("Se ha prestado el libro " + libro1.getTitulo()+" hay prestados: "+libro1.getPrestamos());
			 } else {
			 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para	prestar.");
			 }
		//Muestra el numero de ejemplares prestados de libro1
			 System.out.println("\nHay "+libro1.getPrestamos()+"\n");
		//Simula otro alquiler del libro 1 y vuelve a mostrar los ejemplares prestados
			 if (libro1.prestamo()) {
			 System.out.println("Se ha prestado el libro " + libro1.getTitulo()+" hay prestados: "+libro1.getPrestamos());
			 } else {
			 System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar, hay prestados: "+libro1.getPrestamos()+"\n");
			 }
	   //Realiza una devolucion de un ejemplar del libro1.
			 if (libro1.devolucion()) {
			 System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
			 } else {
			 System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados \n");
			 }
	   //Pon (set) el numero de ejemplares prestados del libro1 a 0
			 libro1.setPrestamos(0);
	   //Haz la devolucion de un ejemplar de libro1 y muestra el numero de ejemplares prestados. 
			 if (libro1.devolucion()) {
			 System.out.println("Se ha devuelto el libro " + libro1.getTitulo()+" quedan: "+libro1.getPrestamos());
			 } else {
			 System.out.println("\nNo hay ejemplares del libro " + libro1.getTitulo() + " prestados, quedan: "+libro1.getPrestamos()+ "\n");
			 }
	   //Muestra el contenido de libro2 (tostring)
			 System.out.println(libro2.toString()+"\n");
	
	   //Pide al usuario que introduzca los datos de un tercer libro (libro3) y muestralo despues.
			 Libro libro3 = new Libro();
		        System.out.println("Título del libro: ");
		        	libro3.setTitulo(sc.nextLine());
		        System.out.println("Autor del libro: ");
		        	libro3.setAutor(sc.nextLine());
		        System.out.println("Ejemplares del libro: ");
		        	libro3.setEjemplares(sc.nextInt());
		        System.out.println("Libros prestados: ");
		        	libro3.setPrestamos(sc.nextInt());
		        System.out.println(libro3.toString());
			 



			 }
	}

