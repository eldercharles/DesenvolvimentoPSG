package conjunto;

import java.util.List;

public class TesteRemove {
	public static void main(String[] args) {
		ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();
		
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		List<Object> objetos = conjunto.pegaTodas();
		
		System.out.println("antes de remover");
		
		for (Object objeto : objetos) {
			System.out.println(objeto);
		}
		
		conjunto.remove("Rafael");
		
		objetos = conjunto.pegaTodas();
		
		System.out.println("Depois de remover");
		for (Object objeto : objetos) {
			System.out.println(objeto);
	}
}
}

