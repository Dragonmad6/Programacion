/**
 * 
 */
package UT620;

/**
 * @author CMaster
 * Clase persona con anombre, apellidos edad y saludo
 */
public class Persona {
	//Atributos de la clase privados, no accesibles desde fuera de la clase
	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;
	
	//Constructor vacio
	public Persona() {
		
	}
	
	//Creación
	public Persona(String nombre, String apellidos, int anio, int mes, int dia, char sexo) {
		setNombre(nombre);
		setApellidos(apellidos);
		setAnio(anio);
		setMes(mes);
		setDia(dia);
		setSexo(sexo);
	}

	//Getters para todos las características
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public int getAnioNacimiento() {
		return this.anioNacimiento;
	}
	
	public int getMesNacimiento() {
		return this.mesNacimiento;
	}
	
	public int getDiaNacimiento() {
		return this.diaNacimiento;
	}
	
	public char getSexo() {
		return this.sexo;¡¡
	}
	
	
	public void setNombre(String nombre) {
		//Convierto nombre en palabra con la primera en mayuscula
		nombre = convertirNombresPropios(nombre);
		
		//Si es menor que 4, uso sin especificar
		if(nombre.length() < 4 )
			nombre="Sin especificar";
		
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		//Cada apellido con la letra en mayuscula
		apellidos = convertirNombresPropios(apellidos);
		
		//Si es menor que 4, uso sin especificar
		if(apellidos.length() < 4 )
			apellidos="Sin especificar";
		
		this.apellidos = apellidos;
	}
	
	public void setAnio(int anio) {
		//Cumpla las restricciones de edad menor o mayor que esos años
		if (anio < 1900 || anio > 2020)
			anio = 2000;
		
		this.anioNacimiento = anio;
	}
	
	public void setMes(int mes) {
	//Verifica que cumpla en un mes entre el 1 y el 12
		if (mes < 1 || mes > 12)
			mes = 1;
		
		this.mesNacimiento = mes;
	}
	
	public void setDia(int dia) {
	//Verifica el día de nacimiento entre los días 1 y 31
		if (dia < 1 || dia > 31)
			dia = 1;
		
		this.diaNacimiento = dia;
	}
	
	public void setSexo(char sexo) {
	//Verifica si es H o M
		if (sexo != 'H' || sexo != 'M')
			sexo = 'X';
		this.sexo = sexo;
	}
	
	public int getEdad() {
		int edad = java.time.LocalDate.now().getYear() - this.anioNacimiento;	
		return edad;
	}
	
	public String mostrarEdad() {
		return "En la actualidad tengo "+getEdad()+" años. \n";
	}
	
	//TODO cambiar para que no pinte en consola desde la clase Persona
	public void saludar() {
		System.out.printf("Hola soy %s %s y naci el %d/%d/%d. \n", nombre, apellidos, diaNacimiento, mesNacimiento, anioNacimiento);
	}
	
	private String toUpperPrimeraLetra(String palabra) {
		String npropio = palabra.toLowerCase();
		String letra=palabra.substring(0,1).toUpperCase();
		npropio=letra + npropio.substring(1);	
		return npropio;
	}
	
	private String convertirNombresPropios(String nombrespropios) {
		//Convierto los apellidos en un array de strings separandolo por espacios
		String[] array_propios = nombrespropios.split(" ");
				
		//Convierto cada elemento del array , en una palabra con la primera en mayusculas
		for (int i=0;i<array_propios.length;i++)
			array_propios[i] = toUpperPrimeraLetra(array_propios[i]);
				
		//Creo la cadena de apellidos ya formateada concatenando los apellidos del array
		String nombres_formateado = "";
		for (int i=0;i<array_propios.length;i++)
			nombres_formateado = nombres_formateado + array_propios[i] +" ";
		
		return nombres_formateado;
	}
	
	
	
}














