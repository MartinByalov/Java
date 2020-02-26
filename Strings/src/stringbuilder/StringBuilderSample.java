package stringbuilder;

import java.lang.StringBuilder;

public class StringBuilderSample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		System.out.println("append(): ");
		sb.append("java");
		System.out.println(sb);

		System.out.println("\ninsert(): ");
		sb.insert(0, "Java");
		System.out.println(sb);

		System.out.println("\nreplace(): ");
		sb.replace(1, 3, "Java");
		System.out.println(sb);

		System.out.println("\ndelete(): ");
		sb.delete(1, 3);
		System.out.println(sb);

		System.out.println("\nreverse(): ");
		sb.reverse();
		System.out.println(sb);

		System.out.println("\nensureCapacity(10): ");
		sb.ensureCapacity(10);
		System.out.println("capacity: " + sb.capacity());
	}

}
