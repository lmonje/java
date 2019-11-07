import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Introduzca un numero: ");

			numero = sc.nextInt();

			for (int i = 1; i <= numero; i++) {

				if (i % 2 == 0) {
					System.out.println(i);
				};
			}

		} while (numero == 0);
		System.out.println("Fin del programa");
		sc.close();
	}

}
