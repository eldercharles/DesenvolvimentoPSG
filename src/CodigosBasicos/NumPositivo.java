package CodigosBasicos;

import java.util.Scanner;

public class NumPositivo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com um numero:");
	    int numero = input.nextInt();
	    
	    if (numero >= 0) {
	    	System.out.println("O numero "+numero+" é positivo.");
	    }
	    else {
	    	System.out.println("O numero "+numero+" é negativo.");
	    }

  }
}