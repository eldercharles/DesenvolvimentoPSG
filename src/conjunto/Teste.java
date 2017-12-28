package conjunto;

public class Teste {

	public static void main(String[] args) {
		ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
		
		conjunto.adiciona("Palavra");
		conjunto.adiciona("Computador");
		conjunto.adiciona("Apostila");
		conjunto.adiciona("Instrutor");
		conjunto.adiciona("Mesa");
		conjunto.adiciona("Telefone");
	
	if (!conjunto.contem("Apostila")) {
		System.out.println("Erro: não tem a plavra: apostila");
	}
	
	conjunto.remove("Apostila");
	
	if (conjunto.contem("Apostila")) {
		System.out.println("Erro: tem a palavra: apostila");
	}
	
	if (conjunto.tamanho() != 5) {
		System.out.println("Erro: o tamanho do conjunto deveria ser 5");
		
	}
}
}
