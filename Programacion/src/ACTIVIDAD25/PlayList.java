package ACTIVIDAD25;

import java.util.ArrayList;

public class PlayList {

	ArrayList <Cancion> playlist;
	String nombre;
	
	public PlayList() {
		playlist = new ArrayList <Cancion>();
	}
	public PlayList(String nombre) {
		playlist = new ArrayList <Cancion>();
		this.nombre = nombre;
	}
	
	//Metodos
	
	//Introduce una nueva cancion
	public void anyadirCancion(String titulo, String artista, int duracionMinutos) {	
		playlist.add(new Cancion(titulo,artista,duracionMinutos));
	}
	//Posicion de la cancion que quieres escuchar
	public String obtieneCancion (int posicion) {
		return playlist.get(posicion).toString();
	}
	//Cuantas canciones hay
	public int obtieneTotalCanciones() {
		int contador;
		contador = playlist.size();
		return contador;
	}
	//Muestra toda la PlayList
	public StringBuilder mostrarPlayList() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i < playlist.size();i++) {
			sb.append(playlist.get(i).toString());
			sb.append("\n");
		}
		return sb;
	}
	//Duracion de la PlayList
	public int totalDuracion() {
		int totalDuracion = 0;
		for (Cancion C: playlist){
			totalDuracion = totalDuracion + C.getDuracionMinutos();
		}
		return totalDuracion;
	}
	//Reproduce la PlayList entera
	public StringBuilder reproducirPlaylist() {
		StringBuilder sl = new StringBuilder();
		for(int i=0;i < playlist.size();i++) {
			sl.append(playlist.get(i).reproducir());
			sl.append("\n");
		}
		return sl;
	}
	//Reproduce la cancion que quieras
	public String reproducirCancion(int posicion) {
		return playlist.get(posicion).reproducir();
	}
	//Borra una cancion
	public void borrarCanciones() {
		playlist.clear();
	}
	
	public boolean borraCancion(int posicion) {

		boolean borrar = true;
			if(playlist.size() > 0) {
				if(playlist.size() >= posicion) {
					borrar = true;
					playlist.remove(posicion);
				}else {
					borrar = false;
				}
			}else {
				borrar = false;
			}
		return borrar;
	}
	//Encuentra la cancion por su titulo
	public Cancion encontrarCancionPorTitulo(String nombre){
		int posicion = 0;
		for(int i=0;i<playlist.size();i++) {
			if(playlist.get(i).getTitulo().equals(nombre)) {
				 i = posicion;
			}
		}
		return playlist.get(posicion);
	}
	//Encuentra la cancion por su artista
	public ArrayList <Cancion> encontrarCancionPorArtista(String artista){
		ArrayList <Cancion> arArtista = new ArrayList <Cancion>();
		
		for(int i=0; i < playlist.size();i++) {
			if(playlist.get(i).getArtista().equals(artista)) {
				arArtista.add (new Cancion(playlist.get(i).getTitulo(), playlist.get(i).getArtista(), playlist.get(i).getDuracionMinutos()));
			}
		}
		return arArtista;
	}
		
 }

	
	
	
	
	
 
