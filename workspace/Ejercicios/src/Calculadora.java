import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int numero1=0;
	int numero2=0;
	int opcion=0;
	
  
    
    do {
    	System.out.println("1- Sumar");
    	System.out.println("2- Restar");
    	System.out.println("3- Multiplicar");
    	System.out.println("4- Dividir");
    	System.out.println("0- Fin");
    	
    	opcion = sc.nextInt();
    	System.out.println("Introduzca 2 numeros");
    	numero1 = sc.nextInt();
    	numero2 = sc.nextInt();
    
    if(opcion==1)
    {
    	int sumar = numero1+numero2;
    	System.out.println(sumar);
    	opcion =0;
    	
    	
    }
    else if(opcion==2)
    {
    	 
    	 int restar = numero1-numero2;
    	 System.out.println(restar);
    	 opcion =0;
    	
    	 
    }
    else if(opcion==3)
    {
    	 int multiplicar = numero1*numero2;
    	 System.out.println(multiplicar);
    	 opcion =0;
    	 
    	
    	
    }
    else if(opcion==4)
    {
    	 
    	int dividir = numero1/numero2;
    	 System.out.println(dividir);
    	 opcion =0;
    	 
    }

    }
    
    while (opcion != 0);
	System.out.println("Fin del programa");
	sc.close();
	}


    

	}


