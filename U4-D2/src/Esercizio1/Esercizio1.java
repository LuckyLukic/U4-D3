package Esercizio1;

public class Esercizio1 {
	
	public static void main(String[] args) {
		
		
	System.out.println(stringaPariDispari("supercalifragilistichespiralidoso"));
	System.out.println(stringaPariDispari("ciao"));
	
	System.out.println(annoBisestile(1600));
	System.out.println(annoBisestile(1680));
	System.out.println(annoBisestile(1995));
		
	}

	
	public static boolean stringaPariDispari(String parola) {
		
	return	(parola.length()) % 2 == 0;
	
	}
	
	public static boolean annoBisestile(int anno) {
		return ((anno % 4) == 0) || (anno % 100) == 0 && ((anno % 400) == 0); 
		
		}
	}

