package buscaordenacaoanalise;


     public class BuscaMenorPosicionado {
    	 
    	                                             // Pag. 34 á 36
     
	 public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Produto produtos[] = new Produto[5];
		produtos[0] = new Produto ("Lamborghini" , 1000000);
		produtos[1] = new Produto ("Jipe" , 46000);
		produtos[2] = new Produto ("Brasilia" , 16000);
		produtos[3] = new Produto ("Smart" , 46000);
		produtos[4] = new Produto ("Fusca" , 17000);
		
		int maisBarato = 0;
		
		for (int atual = 0; atual <= 4; atual++) {
		if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
			
			maisBarato = atual;
		}
		}
		
		System.out.println(maisBarato);
		System.out.println(" O carro " + produtos[maisBarato] .getNome() + " é o mais barato, e custa " + produtos[maisBarato].getPreco() );
		
		}
		
	}
	
	 