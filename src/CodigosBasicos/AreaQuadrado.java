package CodigosBasicos;

import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    System.out.println("Digite o tamanho do lado do quadrado:");
    double lado = input.nextDouble();
    
    // area = lado * lado
    double area = Math.pow(lado, 2);
    
    System.out.println("A area do quadrado é: " + area);
    System.out.println("O dobro da area do quadrado é: " + (area * 2));
    
 	}
	

	}