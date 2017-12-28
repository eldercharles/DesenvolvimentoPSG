package CodigosBasicos;

public class Fibonacci {

    
    public static void main(String[] args) {
        
        // 0,1,1,2,3,5,8,13,21...
        int antes = 0;
        int depois = 1;
        
        System.out.print(depois);
        
        while (depois <= 100) {
            
        depois = antes + depois;
        antes = depois - antes;
        
        if (depois <= 100) {
        System.out.print(", " + depois);
          
        } else {
            System.out.println(".");
        }
        }
        
    }
    
}
