package Esercizio4;

import java.util.Scanner;

public class Esercizio4 {
	
	public static void main(String[] args) {
		
		contoRovescia();
		
	}
	
	public static void contoRovescia () {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci un numero intero");
		
		
		int numeroIntero = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = numeroIntero; i >= 0 ; i--) {
			System.out.print(i + ", ");
		}
		
		scanner.close();
		
	}

}
