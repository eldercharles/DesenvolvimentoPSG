
package CodigosBasicos;

import java.util.Scanner;

/**
 *
 * @author Convidado
 */
public class Idade {

    private static Scanner input;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
     
              int idade = 0;
              input = new Scanner (System.in);
              System.out.println("Digite sua data de nascimento");
              int dtnasc = input.nextInt();
              System.out.println("Digite seu ano atual");
              int anoatual = input.nextInt();
              idade = anoatual - dtnasc;
              System.out.println ("Sua idade é: "+ idade + " anos.");
              
        
    }
}
