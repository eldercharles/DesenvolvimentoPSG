
package poo;

public class Caneta {

    public static void main(String[] args) {
        
      ClassCaneta c1 = new ClassCaneta();          // Instanciar      //---- Criando um objeto apartir da classe caneta----
      c1.cor = "Azul";
      c1.ponta = 0.5f;
      c1.tampar();
      
      c1.status();                 // Status
      c1.rabiscar();
      
      
      ClassCaneta c2 = new ClassCaneta();
      c2.modelo = "BIC";
      c2.cor = "Preta";
      c2.destampar();
      c2.status();
      c2.rabiscar();
    }
    
}
