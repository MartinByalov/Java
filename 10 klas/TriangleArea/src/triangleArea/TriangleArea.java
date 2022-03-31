package triangleArea;

import java.util.Scanner;

// Задача 1
public class TriangleArea {

	// Начало
	public static void main(String[] args) {
		
		// Потребителят въвежда данни в текстово поле
		Scanner input = new Scanner(System.in);
		
		// Въведи a, b, c
		System.out.println("Въведи a:");
		int a = input.nextInt();
		
		System.out.println("Въведи b:");
		int b = input.nextInt();
		
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

