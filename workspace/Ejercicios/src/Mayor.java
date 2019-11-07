import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {

		int numero = 0;
		int numeroMayor = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();
			if (numero > numeroMayor) {
				numeroMayor = numero;
			}
		
		} while (numero > 0);

		System.out.println("El numero mayor es: " + numeroMayor);
		sc.close();
	}
}
