package poo;

public class Caneta {     // Classe Caneta criada
    String modelo;        // Atributos
    String cor;            // Atributos
    float ponta;          // Atributos
    int carga;             // Atributos
    boolean tampada;        // Atributos
    
    void status() {       // Mostrar estado atual
        
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        
    }
    void rabiscar() {                     // Métodos            // Void Significa  "Sem retorno".
        
    }
    void tampar()  {                        // Métodos            // Void Significa  "Sem retorno".
        this.tampada = true;
    }    
    void destampar() {                    // Métodos            // Void Significa  "Sem retorno".
        this.tampada = false;
    }
} 