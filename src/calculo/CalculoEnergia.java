package calculo;

import java.util.Scanner;

public class CalculoEnergia {

	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		System.out.println(" Digite o consumo de w:");
		float w = input.nextFloat();
	    System.out.println(" Digite as horas:");
	    int horas = input.nextInt();
	    float kw = (w * horas) * 30 /1000;
	    float total = (kw * 0.35f);
	    
	    System.out.printf("O consumo de energia é de " + kw + " kw/h por mes." + " que dá cerca de: R$ %.2f",total);
		
		
		
	}
}
