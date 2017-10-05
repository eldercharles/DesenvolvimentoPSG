/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigosBasicos;

import java.util.Scanner;

/**
 *
 * @author Convidado
 */
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
              int idade = 0;
              Scanner input = new Scanner (System.in);
              System.out.println("Digite sua data de nascimento");
              int dtnasc = input.nextInt();
              System.out.println("Digite seu ano atual");
              int anoatual = input.nextInt();
              idade = anoatual - dtnasc;
              System.out.println ("Sua idade é: "+ idade + " anos.");
              
        
    }
}
