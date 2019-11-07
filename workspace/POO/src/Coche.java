
public class Coche {
	
	public String matricula;
	public String marca;
	public String modelo;
	public String estado;




	public Coche(String matricula, String marca, String modelo, String estado) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.estado = estado;
	}
	public Coche() {
		super();
		this.marca ="";
		
		
	}
	
	public Coche (String matricula) {
		this(); 
		this.matricula = matricula;
	}
	
	public Coche(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;

	}
	
	
	
	
}
