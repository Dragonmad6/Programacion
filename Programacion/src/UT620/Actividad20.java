/**
 * 
 */
package UT620;

/**
 * @author CMaster
 *
 */
public class Actividad20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona yo = new Persona();		
			yo.setNombre("Carlos");
			
		System.out.println(yo.getNombre());
			yo.setApellidos("Calvo Calzado");
		System.out.println(yo.getApellidos());
			yo.setAnio(2001);
			yo.setMes(11);
			yo.setDia(14);
			yo.setSexo('H');
			yo.saludar();
			
		System.out.println(yo.mostrarEdad());
		
		Persona invento = new Persona("PEPE", "lopez garcia", 8000, 34, -3, 'G');
		invento.saludar();
		
		

	}
	
	

}