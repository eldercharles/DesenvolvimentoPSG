package CodigosBasicos;

import java.util.Scanner;

public class MediaAluno {
     private static Scanner input;

	public static void main(String[] args) {
         
         float media = 0;
         input = new Scanner (System.in);
         System.out.println("Digite a primeira nota");
         float nota1 = input.nextFloat();
         System.out.println("Digite a segunda nota");
         float nota2 = input.nextFloat();
         
         media = (nota1 + nota2) / 2;
         
         if (media >=6 && media < 9) {
         System.out.println("Sua media é: " + media);
         
         }
         else if (media >=9) {
             System.out.println("Parabéns aluno, Sua media é: " + media);
         }
             else if (media <6) {
            System.out.println("Estude mais aluno, Sua media é: " + media);

}   
}
}