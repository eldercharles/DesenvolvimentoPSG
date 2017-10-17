
package CodigosBasicos;

import java.util.Scanner;


public class CalcularPares {
    private static Scanner ent;

	public static void main(String[] args) {
        
    
   
 
        ent = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Digite o " + i + "º número");
            num = ent.nextInt();
            
            if(num % 2 == 0){
                contPar++;
            }

            
            if(num % 2 == 1){
                contImpar++;
            }
           
        }
        
        System.out.println("Foram digitados " + contPar + " números pares \n");
        System.out.println("E " + contImpar + " números ímpares");
        
    }
}
