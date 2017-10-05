
package ordenacao;

import java.util.Scanner;


public class OrdenacaoRepeticao {
    
    public static void main(String[] args) {
        
        double preco[] = new double [5];
        preco [0] = 1000000;
        preco [1] = 460000;
        preco [2] = 160000;
        preco [3] = 460000;
        preco [4] = 170000;
             
        int maisBarato = 0;        
        
    for ( int atual = 0 ; atual <=4; atual++) {
        
    if (preco[atual] < preco[maisBarato]) {
         maisBarato = atual;
     }
    }
        System.out.println("O mais barato é: " + maisBarato);
        System.out.println("O carro mais barato custa " + preco [maisBarato]);
    }
}
