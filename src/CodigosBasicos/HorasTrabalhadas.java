package CodigosBasicos;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
	    Scanner input  = new Scanner(System.in);
	    System.out.println("Digite o valor das Horas:");
	    double valorHora = input.nextDouble();
	    System.out.println("Digite a quantidade de Horas:");
	    double horasMes = input.nextDouble();
	    
	    double salario = valorHora * horasMes;
	    System.out.println("O salario é de: R$"+ salario);
	    
	}
}
