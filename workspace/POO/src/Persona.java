//las clases en java son moldes para la creacion de objectos, son planos
//en los que java se va a basar para la creacion de los objectos
public class Persona { 
	//una clase java (en cualguier lenguaje) tiene
	//atributos y tiene metodos
	//los atributos en java se suelen poner dentro de la clase 
	//y al principio de ella
	
	public String nombre;
	public double peso;
	public int edad;
	
	public Persona(){
		
	}
	
	public Persona(String nombre, double peso, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
	}
	
	
	//public  Persona() {
		
	//}
	//public Persona (String nombre1, double peso1, int edad1) {
		//nombre = nombre1;
		//peso = peso1;
		//edad = edad1;
	//}
	
	
}
