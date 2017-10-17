package buscaordenacaoanalise;
                                                       // Pag. 37 á 39
public class BuscaInicioAoFim {

	public static void main(String[] args) {

		Produto produtos[] = { new Produto("Lamborguini", 1000000), new Produto("Jipe", 46000),
				new Produto("Brasilia", 16000), new Produto("Fusca", 46000), new Produto("Smart", 17000), null, null,
				null, null, null };

		buscaMenor(produtos, 0, 9);
	}

	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		for (int atual = inicio; atual <= termino; atual++) {
			if (produtos[atual] != null) {

				if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
					maisBarato = atual;
				}
			}
		}
		System.out.println("O carro mais barato é o(a): " + produtos[maisBarato].getNome() + " que custa " + produtos[maisBarato].getPreco());
		return maisBarato;
	}

}
