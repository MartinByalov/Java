package triangleArea;

import java.util.Scanner;

// Обиколка на триъгълник
public class TriangleArea {

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
		
		// Въведи c
		System.out.println("Въведи c:");
		int c = input.nextInt();
		
		int p;
		
		// Пресметни p = a + b + c
		p = a + b + c;
		
		// Изведи p
		System.out.println("p = " + p);
	}
	// Край
	
}

