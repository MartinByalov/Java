package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		StringTokenizer st_1 = new StringTokenizer("My,name,is,Martin", ",");

		System.out.println("StringTokenizer example: ");

		while (st_1.hasMoreTokens()) {
			System.out.print(st_1.nextToken() + " ");
		}

		System.out.println();

		StringTokenizer st_2 = new StringTokenizer("cat,dog,lion,bear", ",");

		System.out.println("\nnextToken() example:");
		System.out.println("token 1: " + st_2.nextToken());
		System.out.println("token 2: " + st_2.nextToken());
		System.out.println("token 3: " + st_2.nextToken());

		String st_3 = new String("My-name-is-Martin");
		System.out.println("\nsplit() method example:");

		for (String value : st_3.split("-")) {
			System.out.println(value);
		}

	}
}
