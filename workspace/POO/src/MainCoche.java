
public class MainCoche {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		c1.matricula = "123456F";
		c1.marca = "Seat";
		c1.modelo = "Ibiza";
		c1.estado = "Nuevo";
		
		//System.out.println("Matrícula "+ c1.matricula);
		//System.out.println("Marca "+c1.marca);
		//System.out.println("Modelo "+c1.modelo);
		//System.out.println("Estado "+c1.estado);
		//System.out.println(" ");
		
		
		Coche c2 = new Coche();
		c2.matricula = "456456F";
		c2.marca = "BMW";
		c2.modelo = "Monet";
		c2.estado = "Segunda mano";
		
		Coche c3 = new Coche();
		c3.matricula = "754321F";
		c3.marca = "KIA";
		c3.modelo = "Moderno";
		c3.estado = "Nuevo";
		
		imprimirCoche(c1);
		imprimirCoche(c2);
		imprimirCoche(c3);
	

		Coche c4 = c2;
		c4.estado = "Nuevo";
		c4.matricula = "123456F";
		imprimirCoche(c4);
		System.out.println("****Ahora con constructores*****");
		
		Coche c5 = new Coche("CWEQ123");
		c5.modelo= "Testarrosa";
		imprimirCoche(c5);
		Coche c6 = new Coche("123344G", "Volkswagen");
		imprimirCoche(c6);
	

		
	}
	
	
	public static void imprimirCoche(Coche coche)
	{
		System.out.println("Matrícula "+ coche.matricula);
		System.out.println("Marca "+coche.marca);
		System.out.println("Modelo "+coche.modelo);
		System.out.println("Estado "+coche.estado);
		System.out.println(" ");
	}
	

}
