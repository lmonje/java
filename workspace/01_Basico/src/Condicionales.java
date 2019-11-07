
public class Condicionales {

	public static void main(String[] args) {
		boolean cierto = true;
		//ifs
		if(cierto == true) {
			System.out.println("El valor es cierto");
		}
		if (cierto != true) {
			System.out.println("El valor es falso");
		}
		if (cierto) {
			System.out.println("El valor es verdadero");
		}
		if (!cierto) {
			System.out.println("El valor es falso");
		}
		if (cierto) {
			System.out.println("Es verdadero");
			System.out.println("Y lo sabes");
		}
		cierto= false;
		if (!cierto) {
			System.out.println("Ahora es falso");
		}
		int numero1 = 1;
		int numero2 = 10;
		if(numero1 > 0 && numero2 < 20);
		{
			System.out.println("El numero es mayor que 0 Y menor que 20");
		}
		if (numero1 < 0 || numero2 < 20);
		{
			System.out.println("El numero1 es menor que 0 o numero2 menor que 20");
		}
		if(cierto) {
			System.out.println("La variable es cierta");
		}else {
			System.out.println("La variable NO es cierta");
		}
		int numero = 1;
		if (numero==0) {
			System.out.println("El numero vale cero");
		}
		else if (numero==1) {
			System.out.println("El numero vale uno");
		}
		else if (numero==2) {
			System.out.println("El numero vale dos");
		}
		else {
			System.out.println("El numero no vale ni 0 ni 1 ni 2");
		}
	
	}

}
