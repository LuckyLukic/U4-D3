package Esercizio3;

import java.util.Scanner;

public class Esercizio3 {
	
	public static void main(String[] args) {
		
		splitString();
		
	}
	
	public static void splitString () {
		
		Scanner scanner = new Scanner (System.in);
		
		String q = ":q";
	    
		
		
		System.out.println("Scrivi una frase");
		String frase = scanner.nextLine();
		
		
		while(!frase.equals(q)) {
			
			String[] myArray = frase.split("");
			
			
			
			for (String carattere: myArray) {
				System.out.print(carattere + ", ");	
			}
			
			System.out.println("\nScrivi un'altra frase");
			frase = scanner.nextLine();
			
		}
		
		System.out.println("gioco finito");
				
		scanner.close();
		
	}

}
