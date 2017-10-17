
package buscaordenacaoanalise;

import java.util.Scanner;


public class PrecoCarroCondicional {     // Feito com estruturas condicionais.
    
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner (System.in);
        System.out.println("Digite o valor do carro1:");
        float preco1 = input.nextFloat();
        System.out.println("Digite o valor do carro2:");
        float preco2 = input.nextFloat();
        System.out.println("Digite o valor do carro3:");
        float preco3 = input.nextFloat();       
        
        
        if      (preco1 < preco2 && preco1 < preco3) { 
            System.out.println("O Carro 1 vale " +preco1+ " R$ , então ele é o mais barato.");
        }
        else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("O Carro 2 vale " +preco2+ " R$ , então ele é o mais barato.");
        }
        else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("O Carro 3 vale " +preco3+ " R$ , então ele é o mais barato.");
        }
    }
}