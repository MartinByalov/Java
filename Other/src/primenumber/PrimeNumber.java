package primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int number) {

		if (number <= 1) {

			return false;

		}

		for (int i = 2; i < Math.sqrt(number); i++) {

			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int n = input.nextInt();

		input.close();

		if (isPrime(n)) {

			System.out.println(n + " is a prime number.");
		} else {

			System.out.println(n + " isn't a prime number.");
		}

	}

}
