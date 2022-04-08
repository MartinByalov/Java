package sravnenie;

import java.util.Scanner;

// Сравнение
public class Sravnenie {

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

		// x взема въведената стойност за a
		int x = a;
		
		// Ако b > x
		if (b > x) {

			// Тогава x взема въведената стойност за b
			x = b;

			// Изведи x
			System.out.println("x = b = " + x);
		}

		// Ако c > x
		if (c > x) {

			// Тогава x взема въведената стойност за c
			x = c;

			// Изведи x
			System.out.println("x = c = " + x);
		}
		// Ако и двете стойности (b, c) са по-големи от x, то тогава ще се изведат и двете равенства
	}
	// Край
}
