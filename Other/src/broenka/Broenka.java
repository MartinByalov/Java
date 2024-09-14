/**
 * @title Broenka counting-out game
 * @description People are standing in a circle with numbers from 1 to n.
 * (1) We start to count from person with number 1;
 * (2) We count m people in the circle. The last numbered person is excluded;
 * (3) We repeat step (2) continuing the count from the next person until one
 * person remains.
 * @author Martin Byalov / FN: 50438
 *
 */

package broenka;

import java.util.Scanner;
import java.util.ArrayList;

public class Broenka {

	/**
	 * @param n
	 *            - number of people placed in circle participating in the game
	 * @param m
	 *            - the step with which people are excluded from the game
	 * @return p - winner of the game (the last remaining value in the circle
	 *         represented by arraylist)
	 */

	static int findWinner(int n, int m) {

		int p = 0;

		ArrayList<Integer> broenka = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			broenka.add(i + 1);
		}

		/*
		 * Example for n = 5, m = 3: position of any person in the circle is given by:
		 * index/n person 1 (p1) is at position/index 0 of n = 5 people --> p1 = 0/5, p2
		 * = 1/5, p3 = 2/5 and etc. If we represent the positions/indexes as the
		 * remainder followed by the division the positions will be --> p1 = 0/5 = 0, p2
		 * = 1/5 = 1 and etc. (1) The count starts from p1 = 0; (2) We count m people (m
		 * = 3 indexes so m = 2) --> p1 + m = 0 + 2 = 2 or pE1 = (p1 + m)/n = (0 + 2)/5
		 * = 2/5 --> the position of the first person to exclude is at index 2 of 5
		 * people; (3) Simulating the exclusion of a person from the circle: (n - 1) -->
		 * n = 4 (4) Repeat until 1 person remains --> n = 1 (index = 0): for pE2 = p2 +
		 * m or pE2 = (p2 + m)/n = (2 + 2)/4 = 4/4 = 0 index and etc.
		 */

		while (broenka.size() > 1) {

			p = (p + m) % broenka.size();

			int excluded = broenka.get(p);

			display(broenka);

			System.out.print(" No: " + excluded + " was excluded.\n");
			broenka.remove(p);

		}

		System.out.println();

		p = broenka.get(0);

		return p;
	}

	static void display(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

			System.out.print("[" + list.get(i) + "]");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Broenka game\n\n");
		System.out.println("Input number of people: ");
		int n = input.nextInt();

		System.out.println("Input count step to exclude people: ");
		int m = input.nextInt();

		input.close();

		System.out.println("The winner is: No: " + findWinner(n, m - 1));
	}
}