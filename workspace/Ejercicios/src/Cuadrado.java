import java.util.Scanner;
public class Cuadrado {

	public static void main(String[] args) {

		int numero = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numero = sc.nextInt();
		
		System.out.println("El cuadrado de " + numero+ " es " + numero*numero );
		sc.close();
		
	}

}
