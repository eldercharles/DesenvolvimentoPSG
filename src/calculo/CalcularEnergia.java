package calculo;

import java.util.Scanner;

      public class CalcularEnergia {
    	  
     private static Scanner teclado;

	public static void main(String[] args) {
		
	  teclado = new Scanner (System.in);
      System.out.println(" Informe o consumo de kw/h: ");
      int kwh = teclado.nextInt();
      double valor = 0;
      double icms = 0;
    
      if (kwh <= 100) {
          valor = kwh * 0.08;
          icms = valor * 0.18;
        }

      if (kwh > 100 && kwh <=200) {
          valor = kwh * 0.10; 
          icms = valor * 0.18;
        }
    
      if (kwh <= 200 && kwh <=500) {
          valor = kwh * 0.12;
          icms = valor * 0.18;
        }

      if (kwh > 500) {
          valor = kwh * 0.15; 
          icms = valor * 0.18;
        } 

      double valorTotal = valor + icms;
      System.out.println (" O valor é de: " + valor);
      System.out.println (" O icms é de: " + icms);
      System.out.printf (" O total a ser pago é de: %.2f R$ ",valorTotal);
    }
}
      
