package CodigosBasicos;

import java.util.Scanner;

public class Exponencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner entrada=new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num=entrada.nextInt(); 

        System.out.println("Digite o expoente: ");
        int exp=entrada.nextInt();

        double result= Math.pow(num, exp); 

        System.out.println("O número: "+num+"\n elevado ao expoente: "+exp+ "\n é igual á: "+result); 

    } 
}