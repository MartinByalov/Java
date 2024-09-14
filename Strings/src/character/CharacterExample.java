package character;

public class CharacterExample {

	public static void main(String[] args) {

		Character ch = 'a';

		System.out.println("Class Character methods for  for char - \"a\":");
		System.out.println("isLetter() method: " + Character.isLetter(ch));
		System.out.println("isDigit() method: " + Character.isDigit(ch));
		System.out.println("isWhitespace() method: " + Character.isWhitespace(ch));
		System.out.println("isUpperCase() method: " + Character.isUpperCase(ch));
		System.out.println("isLowerCase() method: " + Character.isLowerCase(ch));
		System.out.println("toUpperCase() method: " + Character.toUpperCase(ch));
		System.out.println("toLowerCase() method: " + Character.toLowerCase(ch));
		System.out.println("toString() method for char - ch: " + Character.toString(ch));

	}
}
