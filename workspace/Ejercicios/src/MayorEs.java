import java.util.Scanner;

public class MayorEs {

	public static void main(String[] args) {

		int numero = 0;
	
		Scanner sc = new Scanner(System.in);
		do {
			int numeroMayor = 0;
			do {
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();
			if (numero > numeroMayor) {
				numeroMayor = numero;
			}
			
		} while (numero > 0);

		System.out.println("El numero mayor es: " + numeroMayor);
		System.out.println("Deseas introducir otra secuencia 0-Si 1-No ");
		numero = sc.nextInt();
		} while (numero == 0);
		System.out.println("Fin del programa");
		
	}
}
