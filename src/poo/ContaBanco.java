package poo;

public class ContaBanco {
	
    public static void main(String[] args) {
	ClassConta p1 = new ClassConta();
	p1.setNumConta(1111);
	p1.setDono("Elder");
	p1.abrirConta("CC");
	
	ClassConta p2 = new ClassConta();
	p2.setNumConta(2222);
	p2.setDono("Lethicia");
	p2.abrirConta("CP");
	
	p1.depositar(100);
	p2.depositar(500);

	p1.estadoAtual();
	p2.estadoAtual();
	
	p1.fecharConta();
}
}