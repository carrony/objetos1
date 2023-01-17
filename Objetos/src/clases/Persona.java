package clases;

 public class Persona {

	// estado o variables miembro
	protected String nombre;
	private String dni;
	private int altura;
	private int edad;
	private double peso;
	
	// constructor
	public Persona(String nombre, String dni, int altura, int edad, double peso) {
		this.nombre=nombre;
		this.dni=dni;
		this.altura=altura;
		this.edad=edad;
		this.peso=peso;
	}
	
	// contructor sin parámetros
	public Persona() {
		nombre=null;
		dni=null;
	}
	
	// comportamiento o los métodos
	public double calculaIMC() {
		return this.peso/Math.pow(altura/100.0,2);
	}
	
	// getters y setters
	//getter
	public String getNombre() {
		return this.nombre;
	}
	
	
}
