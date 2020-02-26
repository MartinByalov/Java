package formatter;

import java.util.Formatter;

public class FormatterExample {

	public static void main(String[] args) {

		Formatter f = new Formatter();

		f.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
		System.out.println(f);

	}
}