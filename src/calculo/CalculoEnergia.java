package calculo;

import java.util.Scanner;

public class CalculoEnergia {                       // Caso você tenha um aparelho que consuma 1000 W (divida o valor por 1000
	                                                // para saber em kW= 1kW) ou 1kW, e ele ficar ligado durante uma hora,
                                                    // você terá um consumo de 1kWh. Assim, se durante 30 dias do mês ele ficar 
                                                    // ligado durante duas horas, você terá um consumo de 
                                                    // 1kW * 30 dias * 2 horas = 60kWh. Se ele ficar ligado 20 dias, 2 horas por dia
                                                    // terá um consumo de 40kWh. Pois basta multiplicar o consumo diário pelo 
                                                    // número de dias ligados no mês.
                                                       
    private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		System.out.println(" Digite o consumo de w:");
		float w = input.nextFloat();
	    System.out.println(" Digite as horas:");
	    int horas = input.nextInt();
	    float kw = (w * horas) * 30 /1000;
	    float total = (kw * 0.30f);
	    
	    System.out.printf("O consumo de energia é de " + kw + " kw/h por mes." + " que dá cerca de: R$ %.2f",total);
		
		
		
	}
}
