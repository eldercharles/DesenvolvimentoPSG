package listaligada;

import java.util.LinkedList;

                                          //  A classe (LinkedList) faz o papel da nossa Lista Ligada
                                          //  dentro da biblioteca do Java.Ela possui os mesmos métodos
                                          //  que a ArrayList, e adiciona alguns outros,como o addFirst(Object),
                                          //  removeFirst(), addLast(Object)e removeLast(),que operam no começo 
                                          //  e no fim da Lista em tempo constante.
import estruturadedados.Aluno;

public class Teste {

	 public static void main(String[] args) {
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		
		Aluno manoel = new Aluno();
		
		manoel.setNome("Manoel");
		
		Aluno joaquim = new Aluno();
		joaquim.setNome("Joaquim");
		
		LinkedList ListaLigada = new LinkedList();
		
		ListaLigada.add(maria);
		ListaLigada.add(manoel);
		ListaLigada.add(1, joaquim);
		
		for (int i = 0; i < ListaLigada.size(); i++) {
			System.out.println(ListaLigada.get(i));
		}
		
		
		
		
	}
}
