
package ordenacao;

import java.util.Scanner;


public class PrecoCarroCondicional {     // Feito com estrutura condicionais.
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o valor do carro1:");
        float preco1 = input.nextFloat();
        System.out.println("Digite o valor do carro2:");
        float preco2 = input.nextFloat();
        System.out.println("Digite o valor do carro3:");
        float preco3 = input.nextFloat();       
        
        
        if      (preco1 < preco2 && preco1 < preco3) { 
            System.out.println("Carro1 é mais barato.");
        }
        else if (preco2 < preco1 && preco1 > preco3) {
            System.out.println("Carro2 é mais barato.");
        }
        else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("Carro3 é mais barato.");
        }
    }
}