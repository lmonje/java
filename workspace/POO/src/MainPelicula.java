import java.util.ArrayList;
import java.util.Scanner;

public class MainPelicula {

	public static void main(String[] args) {
		
		int opcion = 1 ;	
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Alta Pel�cula");
		System.out.println("2- Lista Pel�culas");
		System.out.println("0- Salir del programa");
		opcion = sc.nextInt();
		
		
		if (opcion ==1) {
			Pelicula p1 = new Pelicula();
			altaPelicula(p1);		
			
		}
		else if (opcion==2) {
			
			System.out.println("Pel�culas: ");
		}
		while (opcion!=0) {
			System.out.println("Fin de programa");
			break;
		}
	}
public static void altaPelicula(Pelicula pelicula)
	
	{	Scanner sc = new Scanner(System.in);
		ArrayList<String> listaStrings = new ArrayList<String>();
	

		System.out.println("Introduce el t�tulo: ");
		pelicula.titulo = sc.nextLine();
		listaStrings.add(pelicula.titulo);
	
		System.out.println("Introduce el genero: ");
		pelicula.genero = sc.nextLine();
		listaStrings.add(pelicula.genero);	
		
		System.out.println("Introduce el director: ");
		pelicula.director = sc.nextLine();
		listaStrings.add(pelicula.director);
	
		
		//System.out.println("Datos: "+listaStrings);
		System.out.println(" ");

		
	}

}
