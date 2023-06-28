package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
	
	public static void main(String[] args) {
		
		metodoSwitch();
		
		
		
		
	}
	
	public static void metodoSwitch () {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un umero da 0 a 10");
		int numeroIntero = scanner.nextInt();
		scanner.nextLine();
		
		switch (numeroIntero) {
		
		case 0 :
			System.out.println("Zero");
			break;
			
		case 1 :
			System.out.println("Uno");
			break;
			
		case 2 :
			System.out.println("Due");
			break;
			
		case 3 :
			System.out.println("Tre");
			break;	
		
		default:
			System.out.println("Non abbiamo questo numero in memoria!");
		    break;
		}
	}

}
