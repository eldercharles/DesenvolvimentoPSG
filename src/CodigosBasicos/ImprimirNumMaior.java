package CodigosBasicos;

import java.util.Scanner;

public class ImprimirNumMaior {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com o primeiro numero:");
		int num1 = input.nextInt();
		System.out.println("Entre com o segundo numero:");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("O numero "+num1+" é maior que o numero "+num2);
		}
		else {
			System.out.println("O numero "+num2+" é maior que o numero " +num1);
		}
	}
}
