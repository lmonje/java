
public class MainStrings {

	public static void main(String[] args) {
		//Las cadenas en java no son primitivos
		//son objectos 
		String cadena= "Harry Potter";
		String cadena2 = "Hermione Granger";
		String cadena3 = "Ron Weasley";
		
		String valor="Homero";
		String valor2="Homero";
		
		//para comparar strings SIEMPRE el metodo equals
		if (valor.contentEquals(valor2)) {
			System.out.println("Los nombres son iguales");
		}
		
		String valor3 ="homero";
		if (valor.contentEquals(valor3)) {
			System.out.println("Los nombres son iguales");
		}
		
		else {
		
		System.out.println("Los nombres son diferentes");
			
		}
		if (valor.equalsIgnoreCase(valor3)) {
			System.out.println("Los nombres son iguales");
		}
		
		else {
		
		System.out.println("Los nombres son diferentes");
			
		}
		String frase = "homero se comio un pollo";
		if (frase.contains("homero")) {
			System.out.println("Si que existe homero");
		}
		
		else {
		
		System.out.println("No existe homero");
			
		}
		String mayusculas = frase.toUpperCase();
		System.out.println(mayusculas);
		
		System.out.println(frase.endsWith("pollo"));
		
		String subcadena =frase.substring(0,9).substring(0,6);
		System.out.println(subcadena);
	
		String subcadena2 =frase.substring(0,6).toUpperCase();
		System.out.println(subcadena2);
		
	}

}
