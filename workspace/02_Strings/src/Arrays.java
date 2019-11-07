import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		
		//Java tiene listas dinamicas y listas estaticas
		
		//estatica
		int[]arrayNumeros = new int[10];
		arrayNumeros[0] = 23;
		arrayNumeros[4] = 56;
		System.out.println(arrayNumeros[0]);
		System.out.println(arrayNumeros[1]);
		System.out.println(arrayNumeros.length);
		for(int i=0;i<=arrayNumeros.length - 1; i++)
		{
			System.out.println("Valor de la posicion "+ i + " del array es " +arrayNumeros[i]);
		}
		System.out.println(arrayNumeros[5]);
		System.out.println("esto se ejecuta despues");
		
		//dinamicos son objectos en java
		ArrayList<String> listaStrings = new ArrayList<String>();
		listaStrings.add(0, "Harry");
		listaStrings.add(1, "Hermione");
		listaStrings.add("Ron");
		System.out.println(listaStrings.get(0));
		System.out.println(listaStrings.get(2));
		
		for(int j=0;j<listaStrings.size(); j++) {
			System.out.println(listaStrings.get(j));
		}
		//para recorrer un array es un for each
		for (String valor : listaStrings) {
			System.out.println(valor);
			
		}
		
	
	}
 
}
