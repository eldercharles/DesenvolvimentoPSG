package poo;                       // Pacote

public class ClassCaneta {     // Classe Caneta criada
    public String modelo;        // Atributos
    public String cor;            // Atributos
    public float ponta;          // Atributos
    protected int carga;             // Atributos
    protected boolean tampada;        // Atributos
    
    public void status() {       // Mostrar estado atual
        
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        
    }
    public void rabiscar() {                       // Métodos            // Void Significa  "Sem retorno".
        if (this.tampada == true) {
        	System.out.println(" Erro! Não posso rabiscar");
        }else {
        	System.out.println("Estou Rabiscando");
        }
    	
    }
    protected void tampar()  {                        // Métodos            // Void Significa  "Sem retorno".
        this.tampada = true;
    }    
    protected void destampar() {                    // Métodos            // Void Significa  "Sem retorno".
        this.tampada = false;
    }
} 