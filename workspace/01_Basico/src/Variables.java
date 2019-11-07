
public class Variables {

	public static void main(String[] args) {
		/*en jave tenemos 2 tipos de variables
		 tenemos variables primitivas
		 tenemos variables de referencia
		 las siguientes serian variables primitivas
		 */
		//int, long, double, boolean
		int numero = 0;//variable numerica
		System.out.println("El numero es: "+ numero);
		int numero2 = 78;
		System.out.println(numero2);
		//Otros tipos
		long numeroLargo = 678;
		double numeroReal = 34.67;
		boolean cierto = true;
		cierto = false;
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
		//El otro tipo son las variables de referencia o directamente referencias
		String nombre ="Pepe";//declaración y asignación de la variable
		System.out.println("el nombre es : " + nombre);
		nombre = "Laura";//asignación de la variable
		System.out.println("el nombre es : " + nombre);
		int numero3;//esto se puede pero es buena costumbre inicializar las variables
		numero3 = 56;
		System.out.println(numero3);
		
		double numero4 = 67.634;
		double numero5 = numero4;
		
		int numero6 = 56;
		double numero7 = numero6;
		
		double numero8 =86;
		int numero9 = (int)numero8;
	}

}
