package factorial;

public class Factorial {

	static String iterativeFactorial(int number) {

		StringBuilder sb = new StringBuilder();

		int result = 1;

		for (int i = 1; i <= number; i++) {

			result *= i;

		}

		sb.append("factorial of " + number + " = " + result + " = 1");

		for (int i = 2; i <= number; i++) {

			sb.append(" . " + i);

		}

		return sb.toString();

	}

	static int recursiveFactorial(int number) {

		if (number == 0) {

			return 1;

		}

		return number * recursiveFactorial(number - 1);

	}

	public static void main(String[] args) {

		System.out.println("iterative..." + iterativeFactorial(15));
		System.out.println("recursive..." + recursiveFactorial(15));

	}
}
