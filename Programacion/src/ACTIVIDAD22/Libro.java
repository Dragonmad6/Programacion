/**
 * 
 */
package ACTIVIDAD22;

/**
 * @author CMaster
 *
 */
public class Libro {
	
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestamos;
	
	
	//Constructor vacío
	public Libro() {}
	
	//Constructor con valores
	public Libro(String titulo, String autor, int ejemplares, int prestamos) {
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestamos(prestamos);
	}
	
	
	//Getters
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public int getPrestamos() {
		return prestamos;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public void setPrestamos(int prestamos) {
		this.prestamos = prestamos;
	}

	//Metodos
	public boolean prestamo() {
		boolean p = false;
		if (prestamos < ejemplares ) {
			p = true;
			prestamos++;
		}else{
			p = false;
		}
		return p;
	}
	public boolean devolucion() {
		boolean d = false;
		if (prestamos > 0) {
			d = true;
			prestamos--;
		}else{
			d = false;			
		}
		return d;
	}
	
	@Override
	public String toString() {
		return "El título es, "+this.titulo+" su autor es "+this.autor+" el número que tiene de ejemplares es de: "+this.ejemplares+" de los cuales: "+this.prestamos+"están prestados";
		
	}
	
	
	
	
	
}
