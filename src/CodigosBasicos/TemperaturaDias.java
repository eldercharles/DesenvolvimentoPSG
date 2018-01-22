package CodigosBasicos;

public class TemperaturaDias {
	public static void main(String[] args) {
		double[] Temperatura = new double[365];
		Temperatura[0]= 31.3;
		Temperatura[1]= 32;
		Temperatura[2]= 33.77;
		Temperatura[3]= 34;
		Temperatura[4]= 33.31;
		
		System.out.println("A temperatura no dia 1º é de: "+Temperatura[0]);
		System.out.println("-----------------------------------------------");
		System.out.println("O tamanho do array é de: "+Temperatura.length);
		System.out.println("-----------------------------------------------");
		for (int i=0; i < Temperatura.length; i++) {       
			
	  //System.out.println("O valor da temperatura do dia " + i + " é: " + Temperatura[i]);	                                              
		System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + Temperatura[i]);
	}
		
		// Imprimir sem o Indice, SOMENTE o valor.
		for (double temp : Temperatura) {
			System.out.println(temp);
		}
}
}
