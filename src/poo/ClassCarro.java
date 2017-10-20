package poo;

public class ClassCarro {

	public String Modelo;
	public String Cor;
	public int Ano;
	public int Portas;
	public boolean Ligado;
	
	public void status() {
		System.out.println("Modelo " + this.Modelo);
		System.out.println("Cor " + this.Cor);
		System.out.println("Ano " + this.Ano);
		System.out.println("Quantidade de Portas " + this.Portas);
		
	}
	
	protected void Ligar() {
	  this.Ligado = true;
	}
	
	protected void Desligar() {
	  this.Ligado = false;
	}
	
	protected void Acelerar() {
	if	(this.Ligado == true) {
		System.out.println("----------------------------------");
		System.out.println("Estou acelerando!");
	} else {
		  System.out.println("------------------------ --------");
		  System.out.println(" Não posso acelerar!, estou desligado");	
		
		}
		
	}
	
}
