package vetores;

import java.util.Arrays;

public class PreenchimentoVetor {
	
	public static void main(String[] args) {
	int v[] = new int[20];
    Arrays.fill(v, 0);
    for(int valor: v) {
    	System.out.println(valor + " ");
    }
	
	}
}
