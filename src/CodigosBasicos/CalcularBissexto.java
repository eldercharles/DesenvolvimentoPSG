package CodigosBasicos;

import java.util.Scanner;

public class CalcularBissexto {
  
	 public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Insira um ano: ");
		int ano = teclado.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0)) {
			System.out.println(+ ano + " É um ano BISSEXTO.");
		}
		
		else {
			System.out.println(+ ano + " Não é um ano BISSEXTO.");
		}
	}
}
