/**
 * 
 */
package ACTIVIDAD25;
import java.util.Scanner;

import ACTIVIDAD22.Libro;

import java.util.ArrayList;
/**
 * @author CMaster
 *
 */
public class Actividad25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Scanner
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
	//Objeto
		PlayList playlist = new PlayList();
		
	//Variables
		int opcion;
		String titulo;
		String artista;
		int duracionMinutos;
		int posicion;
		
//Menu
	System.out.println("Bienvenidos al creador de PlayList de Spotify, a continuacion pulse 1 para comenzar a crear: \n");
	
	do {
		System.out.println("Acceso al menu:");
		System.out.println(" 1. Añadir cancion.");
		System.out.println(" 2. Elegir el numero de cancion");
		System.out.println(" 3. Muestra el total de canciones registradas.");
		System.out.println(" 4. Se ve a continuacion toda la PlayList.");
		System.out.println(" 5. Total de minutos que dura la PlayList.");
		System.out.println(" 6. Reproducir la PlayList entera.");
		System.out.println(" 7. Elige la cancion que quieras reproducir.");
		System.out.println(" 8. Borrar la lista de canciones.");
		System.out.println(" 9. Eliminar cancion de la PLayList.");
		System.out.println("10. Buscar informacion sobre una cancion.");
		System.out.println("11. Buscar informacion sobre un artista.");
		System.out.println(" 0. Salir del menu");
			opcion = sc.nextInt();
		
		switch(opcion) {
			
			case 1:
				System.out.println("Escribe a continuacion los datos de la cancion:\n");
				System.out.println("Nombre de la cancion: ");
					titulo = sc2.nextLine();
				System.out.println("Artista de la cancion: ");
					artista = sc2.nextLine();
				System.out.println("Duracion de la cancion: ");
					duracionMinutos = sc.nextInt();
					
					playlist.anyadirCancion(titulo, artista, duracionMinutos);
				System.out.println("Cancion registrada correctamente.\n");
				break;
			case 2:
				System.out.println("Ponga a continuacion el numero de cancion que quieres escuchar:");
					posicion = sc.nextInt();
				System.out.println("La cancion en esa posicion es: "+playlist.obtieneCancion(posicion-1)+"\n");
				break;
			case 3:
				System.out.println("El numero de canciones que tienes registradas son: ");
				System.out.println(playlist.obtieneTotalCanciones());
				break;
			case 4:
				System.out.println("Las canciones que tienes registradas en la PlayList:\n");
				System.out.println(playlist.mostrarPlayList());
				break;			
			case 5:
				System.out.println("El tiempo total de la PlayList es de:");
				System.out.println(playlist.totalDuracion()+" minutos.");
				break;
			case 6:
				System.out.println("Reproducir toda la PlayList: ");
				System.out.println(playlist.reproducirPlaylist());
				break;
			case 7:
				System.out.println("Elige la cancion que quieras reproducir: ");
					posicion = sc.nextInt();
				System.out.println(playlist.reproducirCancion(posicion-1));
				break;
			case 8:
				System.out.println("Se han eliminado todas las canciones registradas.");
				playlist.borrarCanciones();
				break;
			case 9:
				System.out.println("Elimina la cancion que quieras segun su numero en lista de la Playlist");
				posicion = sc.nextInt();
				playlist.borraCancion(posicion-1);
				System.out.println("La cancion ha sido eliminada...");
				break;
			case 10:
				System.out.println("Ponga el nombre de la cancion:");
					titulo = sc2.nextLine();
				System.out.println(playlist.encontrarCancionPorTitulo(titulo));
				break;
			case 11:
				System.out.println("Introduzca el nombre del artista:");
					artista = sc2.nextLine();
				System.out.println(playlist.encontrarCancionPorArtista(artista));
				break;				
		}
	
		}while(opcion != 0);
			System.out.println("Gracias por elegir nuestro servicio de PlayList hasta la proxima.");
	}
}


