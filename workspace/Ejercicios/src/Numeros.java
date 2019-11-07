import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		System.out.println("Introduzca un numero: ");

        numero = sc.nextInt();//aqui el programa se quedara parado a la espera de que el ususaio ponga un numero y pulse enter
        int numero1=0;
        
        for (int i=1;i<=numero;i++) {
        	System.out.println(i);
        }
        System.out.println("¿Quiere introducir otro numero? 0 es si, 1 salir del programa");
        int respuesta = 0;
        respuesta = sc.nextInt();
        
        if(respuesta == 0) {
        	int numeroDos = 0;
        	numeroDos = sc.nextInt();
   
        for (int j=1;j<=numeroDos;j++) {
        	
        	System.out.println(j);
        	
        		 
        }
        }
        else 
        {
        	System.out.println("Fin del programa");
        }
        
        	
       
        sc.close();

	}

}
