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
	public void añadirCancion(String titulo, String artista, int duracionMinutos) {	
		PlayList.add(new Cancion(titulo,artista,duracionMinutos));
	}
	
	public void setTitulo (String titulo) {
	}
	
	
	
	
	
	
	
 }
