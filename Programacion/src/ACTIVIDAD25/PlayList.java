package ACTIVIDAD25;

import java.util.ArrayList;

public class PlayList {

	ArrayList <Cancion> PlayList;
	String nombre;
	
	public PlayList() {
		PlayList = new ArrayList <Cancion>();
	}
	public PlayList(String nombre) {
		PlayList = new ArrayList <Cancion>();
		this.nombre = nombre;
	}
	
	//Methods
	public void anyadirCancion(String titulo, String artista, int duracionMinutos) {	
		PlayList.add(new Cancion(titulo,artista,duracionMinutos));
	}
	
	public String obtieneCancion (int posicion) {
		return PlayList.get(posicion).toString();
	}

	public int obtieneTotalCanciones() {
		int contador;
		contador = PlayList.size();
		return contador;
	}
	
//	public String mostrarPlayList() {
//
//	}
	
	public int totalDuracion() {
		int totalDuracion = 0;
		for (Cancion C: PlayList){
			totalDuracion = totalDuracion + C.getDuracionMinutos();
		}
		return totalDuracion;
	}
	
	public void reproducirCancion(int posicion) {
		PlayList.get(posicion).reproducir();
	}
	
	public void borrarCanciones() {
		PlayList.clear();
	}
	
	public boolean borraCancion(int posicion) {

		boolean borrar = true;
			if(PlayList.size() > 0 ) {
				
			}
		return borrar;
	}
	
	
	
	
	
	
	
 }
