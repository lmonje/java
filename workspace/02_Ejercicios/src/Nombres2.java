import java.util.ArrayList;
import java.util.Scanner;

public class Nombres2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaNombres = new ArrayList<String>();
		System.out.println("Introduce un nombre: ");
		String nombre = sc.nextLine();
		do {
		listaNombres.add(nombre);

		}while(nombre.contains("fin"));
		
	}

}
