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
	
//	@Override
//	public String toString() {
//		return "El título es,"+this.titulo+"su autor es "+getAutor()+
//		
//	}
//	
	
	
	
	
}
