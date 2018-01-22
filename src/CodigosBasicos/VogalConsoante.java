package CodigosBasicos;

import java.util.Scanner;

public class VogalConsoante {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma letra:");
		String letra = input.nextLine();
		
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida.");
		}
		
		switch (letra) {
		case "A" :
			System.out.println("É uma vogal.");
			break;
		case "E" :
			System.out.println("É uma vogal.");
			break;
		case "I" :
			System.out.println("É uma vogal.");
			break;
		case "O" :
			System.out.println("É uma vogal.");
			break;
		case "U" :
			System.out.println("É uma vogal.");
			break;
		case "a" :
			System.out.println("É uma vogal.");
			break;
		case "e" :
			System.out.println("É uma vogal.");
			break;
		case "i" :
			System.out.println("É uma vogal.");
			break;
		case "o" :
			System.out.println("É uma vogal.");
			break;
		case "u" :
			System.out.println("É uma vogal.");
			break;
		default : System.out.println("É uma Consoante.");
		
	}
	}
}
