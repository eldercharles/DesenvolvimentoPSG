package estruturadedados;

public class AdicionaNoFim {                          /* Esta operação receberá um aluno e vai guardá-lo no fim da Lista. 
                                                       * Então, precisamos saber onde é o fim da Lista.
	                                                   * A dificuldade em descobrir a última posição depende de como os alunos serão 
	                                                   * armazenados no array. */
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Joao");
		a2.setNome("Jose");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		
	}
}
