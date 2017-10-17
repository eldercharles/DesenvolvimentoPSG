package buscaordenacaoanalise;

public class VisualizarTroca {                                      // Pag. 92 á 116
   
			public static void main(String[] args) {
			 Produto produtos[] = {
					 new Produto("Lamborguini", 1000000),
					 new Produto("Jipe", 46000),
					 new Produto("Brasilia", 16000),
					 new Produto("Smart", 46000),
					 new Produto("Fusca", 17000),
			 };
			
			 InsertionSort(produtos, produtos.length);
			imprime(produtos);
	           System.out.println();
	           System.out.println();
	           System.out.println();
	           System.out.println();
			}
			private static void imprime(Produto[] produtos) {
				for (Produto produto : produtos) {
					System.out.println(produto.getNome() + " custa " + produto.getPreco());
				}
			}
			private static void InsertionSort (Produto[] produtos, int quantidadedeelementos) {
			for (int atual = 0; atual < quantidadedeelementos ; atual++) {
			System.out.println(" Estou na casinha " + atual);	
			int analise = atual;
			while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
			System.out.println("Estou trocando " + analise + " com " + (analise -1));
				Produto produtoAnalise = produtos[analise];
				Produto produtoAnaliseMenos1 = produtos[analise -1];
				System.out.println("Estou trocando " + produtoAnalise.getNome() + " com " + produtoAnaliseMenos1.getNome());
				produtos[analise] = produtoAnaliseMenos1;
				produtos[analise -1] = produtoAnalise;
				analise--;
			}
		}
    }			
}








			