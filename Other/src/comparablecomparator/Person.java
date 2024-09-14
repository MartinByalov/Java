package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparator<Person>, Comparable<Person> {

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	/*
	 * compare()... 
	 * returns 0 if obj1 == obj2 
	 * returns 1 if obj1 > obj2 
	 * returns -1 if obj1 < obj2
	 */

	@Override
	public int compare(Person personOne, Person personTwo) {

		if (personOne.age == personTwo.age) {

			return 0;

		} else if (personOne.age > personTwo.age) {

			return 1;

		} else {

			return -1;
		}
	}

	@Override
	public int compareTo(Person otherPerson) {

		return this.name.compareTo(otherPerson.name);
	}

	public static void main(String[] args) {

		// define list of people
		List<Person> list = new ArrayList<>();

		list.add(new Person("Ricarda", 22));
		list.add(new Person("Cherrie", 20));
		list.add(new Person("John", 31));
		list.add(new Person("Kevin", 25));
		list.add(new Person("Oswaldo", 36));

		/*
		 * In order to be able to sort the list we must define the Person object as
		 * comparable.
		 */

		// Sorts the list of names
		Collections.sort(list);

		for (Person p : list) {

			System.out.println(p.getName() + " " + p.getAge());
		}

		System.out.println();

		// Sorts the list using the comparator
		Collections.sort(list, new Person());

		for (Person p : list) {

			System.out.println(p.getName() + " " + p.getAge());

		}
	}
}
