package CodigosBasicos;

import java.util.Locale;

public class Idioma {

	public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println ("O idioma do seu Sistema Operacional é o: " +  loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
   }
  }
        
     

