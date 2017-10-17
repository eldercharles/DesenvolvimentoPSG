
package buscaordenacaoanalise;

public class BuscaEspecifica {                             // Pag. 39 á 44

	public static void main(String[] args) {
		Produto produtos[] = { 
				new Produto("Lamborguini", 1000000),
				new Produto("Jipe", 46000),
				new Produto("Brasilia", 16000), 
				new Produto("Fusca", 46000), 
				new Produto("Smart", 17000), 
				null, null,
				null, null, null };

		buscaMenor(produtos);
	}

	private static int buscaMenor(Produto[] produtos) {
		int maisBarato = 0;
		int termino = produtos.length - 1;
		for (int atual = 0; atual <= termino; atual++) {
			if (produtos[atual] != null) {

				if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
					maisBarato = atual;
				}
				System.out.println(" O carro " + produtos[maisBarato].getNome() + " é o mais barato, e custa "
						+ produtos[maisBarato].getPreco());
			}

		}
		return maisBarato;
	}

}
