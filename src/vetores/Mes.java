package vetores;

public class Mes {

	
	public static void main (String[] args) {
		
		String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
				"Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		

		int total [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int c=0; c < mes.length; c++) {
			System.out.println("O mes de " + mes[c] + " tem " + total[c] + " dias ao todo");
			
		}
		
		}
}