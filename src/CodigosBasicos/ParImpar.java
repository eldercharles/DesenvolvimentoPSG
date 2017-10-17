package CodigosBasicos;

import java.util.Scanner;

public class ParImpar {
    private static Scanner input;

	public static void main(String[] args) {
       
        input = new Scanner (System.in);
        System.out.println("Insira um numero");
        int num = input.nextInt();
        
        
        if (num % 2 ==0)
        {
            System.out.println("Par");
        }
        else  {
                System.out.println("Impar");
                }
        
        }
}