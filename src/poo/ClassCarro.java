package poo;

public class ClassCarro {

	String Modelo;
	String Cor;
	int Ano;
	int Portas;
	boolean Ligado;
	
	void status() {
		System.out.println("Modelo " + this.Modelo);
		System.out.println("Cor " + this.Cor);
		System.out.println("Ano " + this.Ano);
		System.out.println("Quantidade de Portas " + this.Portas);
		
	}
	
	void Ligar() {
	  this.Ligado = true;
	}
	
	void Desligar() {
	  this.Ligado = false;
	}
	
	void Acelerar() {
	if	(this.Ligado == true) {
		System.out.println("----------------------------------");
		System.out.println("Estou acelerando!");
	} else {
		  System.out.println("------------------------ --------");
		  System.out.println(" Não posso acelerar!, estou desligado");	
		
		}
		
	}
	
	
	
}
