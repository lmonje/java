
public class Bucles {

	public static void main(String[] args) {
		
		
		System.out.println("Bucles");
		for (int i=0;i<=10;i++) {
			System.out.println("El numero es "+ i);
		}
		int contador = 0;
        while(contador <= 10) {
        	System.out.println("El contador vale "+ contador);
        	contador++;
        }
        System.out.println(contador);
        contador =0;
        do{
            System.out.println("el contador vale: " + contador);
            contador++;
        }while(contador <= 10);
        System.out.println(contador);

	}

}
