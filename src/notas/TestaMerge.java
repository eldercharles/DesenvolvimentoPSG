package notas;

public class TestaMerge {

	public static void main(String[] args) {
		Nota[] notasDoAniche = {
				new Nota ("mariana", 5),
				new Nota ("andre", 4),
				new Nota ("carlos", 8.5),
				new Nota ("paulo", 9)
		};
		Nota[] notasDoAlberto = {
				new Nota ("juliana", 6.7),
				new Nota ("guilherme", 7),
				new Nota ("lucia", 9.3),
				new Nota ("ana", 10) 
				
		};
		
	}  
	

		private static Nota[] junta(Nota[] notasDoAniche, Nota[] notasDoAlberto) {
		int total = notasDoAniche.length + notasDoAlberto.length;
		Nota[] resultado = new Nota[total];
		return resultado;
	}
		
		
		int atualDoAniche = 0;
		int atualDoAlberto = 0;
	
		Nota[] rank = junta(notasDoAniche, notasDoAlberto);
		for (Nota nota : rank ) {
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}

	    int atual = 0;
	    while (atualDoAniche < notasDoAniche.length && atualDoAlberto < notasDoAlberto.length) {
	    	
		Nota nota1 = notasDoAniche[atualDoAniche];
		Nota nota2 = notasDoAlberto[atualDoAlberto];
		System.out.println(" Estou comparando " + nota1.getAluno() + " com " + nota2.getAluno());
		
		if (nota1.getValor() < nota2.getValor()) {
		   resultado[0] = nota1;
			atualDoAniche++;
		} else {
		   resultado[0] = nota2;
			atualDoAlberto++;
		}
		atual++;
		
		while(atualDoAlberto < notasAlberto.length)
		
	}  
	     
	    
	     
	}
	



}

