import java.util.ArrayList;
import java.util.Scanner;

public class MainCoche2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int respuesta = 0;
		System.out.println("¿Desea introducir tres coches? 1-Sí 0-No");
		respuesta = sc.nextInt();
		if(respuesta==1)
		{	
			Coche c1 = new Coche();
			inscribirCoche(c1);
			imprimirCoche(c1);
			Coche c2 = new Coche();
			inscribirCoche(c2);
			imprimirCoche(c2);
			Coche c3 = new Coche();
			inscribirCoche(c3);
			imprimirCoche(c3);
			
		}
		System.out.println("Fin del programa");
		
		
	

	}
	
	public static void inscribirCoche(Coche coche)
	
	{	Scanner sc = new Scanner(System.in);
		ArrayList<String> listaStrings = new ArrayList<String>();
	

		System.out.println("Introduce la matricula: ");
		coche.matricula = sc.nextLine();
		listaStrings.add(coche.matricula);
	
		System.out.println("Introduce la marca: ");
		coche.marca = sc.nextLine();
		listaStrings.add(coche.marca);	
		
		System.out.println("Introduce el modelo: ");
		coche.modelo = sc.nextLine();
		listaStrings.add(coche.modelo);
	
		System.out.println("Introduce el estado: ");
		coche.estado = sc.nextLine();
		listaStrings.add(coche.estado);
		
		//System.out.println("Datos: "+listaStrings);
		System.out.println(" ");

		
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
