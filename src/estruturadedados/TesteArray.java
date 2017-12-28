package estruturadedados;

import java.util.ArrayList;

public class TesteArray {
  public static void main(String[] args) {
	
	  ArrayList Vetor = new ArrayList();
	  
	  Aluno aluno1 = new Aluno();
	  Aluno aluno2 = new Aluno();
	  Aluno aluno3 = new Aluno();
	  
	  Vetor.add(aluno1);
	  Vetor.add(aluno2);
	  Vetor.add(0, aluno3);
	  
	  int tamanho = Vetor.size();
	  
	  if (tamanho != 3) {
		  System.out.println("Erro: O tamanho da lista está errado.");
	  }
	  
	  if (!Vetor.contains(aluno1)) {
		  System.out.println("Erro: Não achou um aluno que deveria estar na lista");
	  }
	  
	  Vetor.remove(0);
	  tamanho = Vetor.size();
	  
	  if (tamanho !=2) {
		  System.out.println("Erro: O tamanho da lista está errado.");
	  }
	  
	  if (Vetor.contains(aluno3) ) {
		  System.out.println("Erro: Achou um aluno que não deveria estar na lista");
	  }
	  
	  
}
  
         ArrayList VetorSemGenerics = new ArrayList();
         ArrayList<Aluno> VetorcomGenerics = new ArrayList<Aluno>();
         
         Aluno aluno = new Aluno();
         
       
         
         Aluno a1 = (Aluno) VetorSemGenerics.get(0);
         
}
