
// Organizar Nomes em ordem alfabética....

package ordenacao;

import java.util.Arrays;                //Importar os Arrays


public class OrdenacaoNomes {
 
    public static void main(String[] args) {
    String [] nome = { "Elder", "Marcos", "Carlos"};
    Arrays.sort(nome);
    for (String pessoa: nome)    // Para cada 
        System.out.println(pessoa);
        System.out.println("----------");
        System.out.println("Contém " +nome.length + " Nomes");
    }
    }
    


  