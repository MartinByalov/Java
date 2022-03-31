package sezoni;

import java.util.Scanner;

// Сезони
public class Sezoni {

	// Начало
	public static void main(String[] args) {

		// Четене на входни данни от потребителя
		Scanner input = new Scanner(System.in);

		System.out.println("Въведи число:");
		
		// Въведи a
		int a = input.nextInt();

		// Ако а е от 2 до 4 (включително)
		if (a >= 2 && a <= 4) {

			// Изведи Пролет
			System.out.println("Сезонът е Пролет.");
		}

		// Ако а е от 5 до 7 (включително)
		else if (a >= 5 && a <= 7) {

			// Изведи Лято
			System.out.println("Сезонът е Лято.");
		}

		// Ако а е от 8 до 10 (включително)
		else if (a >= 8 && a <= 10) {

			// Изведи Есен
			System.out.println("Сезонът е Есен.");
		}

		// Ако нито едно от условията не е изпълнено:
		else {

			// Изведи Зима
			System.out.println("Сезонът е Зима.");
		}
	}
	// Край
}
