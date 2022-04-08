package ravenstvo;

import java.util.Scanner;

// Равенство
public class Ravenstvo {

	// Начало
	public static void main(String[] args) {
		
		// Четене на входни данни от потребителя
		Scanner input = new Scanner(System.in);
		
		// Въведи a
		System.out.println("Въведи a:");
		int a = input.nextInt();
		
		// Въведи b
		System.out.println("Въведи b:");
		int b = input.nextInt();
		
		int c = 0;
		
		// Пресметни c = a
		c = a;
		
		System.out.println("\nПресметни c = a;\nc = a = " + c + "\n");
		
		// Пресметни a = b
		
		a = b;
		
		System.out.println("Престметни a = b;\na = b = " + a + "\n");
		
		// Пресметни b = c
		
		System.out.println("Пресметни b = c;\nb = c = " + b + "\n");
		
		// Изведи a, b
		System.out.println("Изведи a, b;\na = " + a + ", b = " + b + "\n");
		
	}
	// Край
}
