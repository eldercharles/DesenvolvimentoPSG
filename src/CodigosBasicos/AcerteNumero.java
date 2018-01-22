package CodigosBasicos;

import java.util.Scanner;
import java.util.Random;              //  -C---------- Criar numero inteiro aleatório

public class AcerteNumero {   
	
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		Random random = new Random();
		
		boolean acertou = false;
		int tentativas = 10;
		int numeroSecreto = random.nextInt();
		long chute = 0;
		
		System.out.println(numeroSecreto);
		while (tentativas > 0 && acertou == false) {
			System.out.println("Qual seu chute?");
			chute = teclado.nextLong();
			
			if (numeroSecreto == chute) {
				System.out.println("Parabéns, você ACERTOU !!!");
				acertou = true;
			} 
			
			else if (chute < numeroSecreto ) {
				--tentativas;
				System.out.println("Numero muito pequeno!" + tentativas + " tentativas restante.");
			}
			
			else {
				--tentativas;
				System.out.println("Numero muito grande!" + tentativas + " tentativas restante.");
			}
		}
	}
}
		
		
	
		
