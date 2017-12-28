package estruturadedados;

public class TesteTempoDoContem {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		long inicio = System.currentTimeMillis();
		
		// Adicionado 100000 alunos e
		// Verificando se eles foram realmente adicionados.
	    for (int i = 1; i < 30000; i++) {
	    	Aluno aluno = new Aluno();
	        vetor.adiciona(aluno);
	        if(!vetor.contem(aluno)) {
	        	System.out.println("Erro: aluno " + aluno + " não foi adicionado.");
	        }
	    }
	    
	    // Verificando se o vetor não encontra alunos não adicionados.
	    for (int i = 1; i < 3000; i++) {
	    	Aluno aluno = new Aluno();
	    	if (vetor.contem(aluno)) {
	    		System.out.println("Erro: aluno " + aluno + " foi adicionado.");
	    	}
	    }
	    
	    long fim = System.currentTimeMillis();
	    double tempo = (fim - inicio) / 1000.0;
	    System.out.println("Tempo = " + tempo);
	    
	    
	    
	    }
}
