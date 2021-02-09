package ACTIVIDAD25;

public class Cancion {

	private String titulo;
	private String artista;
	private int duracionMinutos;
	
	//Constructor vacio
	public Cancion() {
		
	}
	
	
	//Constructor con valores
	public Cancion(String titulo, String artista, int duracionMinutos) {
		setTitulo(titulo);
		setArtista(artista);
		setDuracionMinutos(duracionMinutos);
	}
	
	//Getters
	public String getTitulo() {
		return titulo;
	}
	public String getArtista() {
		return artista;
	}
	public int getDuracionMinutos() {
		return duracionMinutos;
	}
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}
	
	//Methods
	@Override
	public String toString() {
		return this.titulo+" - "+this.artista+"("+this.duracionMinutos+" minutos)";
	}



}
