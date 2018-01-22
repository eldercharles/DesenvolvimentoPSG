package vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorAComValorB {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int[] vetorA = new int[2];
	//int[] vetorB = new int[vetorA.length];
	double[] vetorB = new double[vetorA.length];    //<----- Necessario para imprimir raiz quadrada.
	
	for ( int i = 0; i < vetorA.length; i++) {
		
		System.out.println("Entre com o valor da posicao: "+i);
		vetorA[i] = input.nextInt();
		
		/*vetorB[i] = vetorA[i];*/               //<------- Imprimir o valor de B igual o valor de A. 
		/*vetorB[i] = vetorA[i] * 2;*/            //<-------Imprimir o valor de B igual A multiplicado por 2.
		/*vetorB[i] = vetorA[i] * vetorA[i];*/      //<-------Imprimir o valor de B com o valor de A ao quadrado. 
		vetorB[i] = Math.sqrt(vetorA[i]);        //<-------- Imprimir raiz quadrada do valor A.
	}
	
	/* for ( int i = 0; i < vetorA.length; i++) {
		vetorB[i] = vetorA[i]; */
	
	System.out.print("Vetor A = ");
	for ( int i = 0; i < vetorA.length; i++) {
		System.out.print(vetorA[i]+ " ");
	}
	System.out.println();
	
	DecimalFormat df = new DecimalFormat("###,###.##");  // Separador de Decimais.
	
	System.out.print("Vetor B = ");
	for ( int i = 0; i < vetorB.length; i++) {
		System.out.print(df.format(vetorB[i])+ " ");
    }   
	System.out.println();
   }
}
