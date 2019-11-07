import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		int numero = 0;
		int resultado = 1;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numero = sc.nextInt();
		for(int i = 2;i<=numero;i++) {
			resultado = resultado*i;
		}
		
		System.out.println("El factorial de "+ numero + " es: "+ resultado);
		sc.close();
		
	}

}
