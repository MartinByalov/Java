package ocenka;

import java.util.Scanner;


// Оценка
public class Ocenka {

	// Начало
	public static void main(String[] args) {
		
		// Четене на входни данни от потребителя
		Scanner input = new Scanner(System.in);
		
		System.out.println("Въведи число:");
		
		// Въведи x
		int x = input.nextInt();
		
		// Ако x е от 2 до 6 (включително)
		if(x > 1 && x < 7) {
			
			// Изведи "Валидна оценка"
			System.out.println("\"Валидна оценка\"");
			
		} 
		
		// Иначе изведи "Невалидна оценка"
		else {
			
			System.out.println("\"Невалидна оценка\"");
			
		}
	}
	// Край
}
