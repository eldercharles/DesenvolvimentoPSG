package poo;

public class Carro {

	
	public static void main(String[] args) {
	ClassCarro carro1 = new ClassCarro();
	
	carro1.Modelo = "Celta";
	carro1.Cor = " Prata";
	carro1.Ano = 2003;
	carro1.Portas = 4;
    carro1.Ligado = true;
    
    carro1.status();
	carro1.Acelerar();
}
}