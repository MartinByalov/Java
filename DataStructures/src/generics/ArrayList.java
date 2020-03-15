package generics;

import java.util.Arrays;

public class ArrayList<E> {

	Object[] arrayList;

	private int size = 0;

	private int INITIAL_CAPACITY = 10;

	ArrayList() {

		arrayList = new Object[INITIAL_CAPACITY];
		Arrays.fill(arrayList, null);

	}

	// returns the number of elements in the list
	int size() {

		return size;

	}

	// appends the specified element to the end of the list
	void add(E data) {

		if (size == arrayList.length) {
			resize();
		}

		arrayList[size] = data;

		size++;

 	}

	// inserts the specified element at the specified position in the list.
	void add(int index, E data) {

		if (size == arrayList.length) {

			resize();
		}

		if (index < size) {

			if (arrayList[index] == data) {

				return;

			} else {
				arrayList[index] = data;
			}

		} else {

			System.out.println("index: " + index);
			throw new NullPointerException();
		}
	}

	// removes all of the elements from the list
	void clear() {

		for (int i = 0; i < arrayList.length; i++) {

			arrayList[i] = null;

		}

		size = 0;
	}

	// returns true if the list contains the specified element
	boolean contains(Object data) {

		for (Object current : arrayList) {

			if (current == data) {

				return true;

			}
		}

		return false;
	}

	// returns the element at the specified position in the list
	E get(int index) {

		if (index < size) {

			@SuppressWarnings("unchecked")
			E data = (E) arrayList[index];

			return data;

		} else {

			throw new ArrayIndexOutOfBoundsException();

		}
	}

	boolean isEmpty() {

		if (size == 0) {
			return true;
		}

		return false;
	}

	// increases the capacity of the list
	void ensureCapacity(int minCapacity) {

		while (arrayList.length < minCapacity) {

			add(null);
		}

	}

	// removes the element at the specified position in the list.
	E remove(int index) {

		if (index < size) {

			@SuppressWarnings("unchecked")
			E data = (E) arrayList[index];

			arrayList[index] = null;

			int temp = index;

			while (temp < size) {

				arrayList[temp] = arrayList[temp + 1];
				arrayList[temp + 1] = null;

				temp++;

			}

			size--;

			return data;

		} else {

			throw new ArrayIndexOutOfBoundsException();

		}
	}

	// increases the size of the list
	private final void resize() {

		arrayList = Arrays.copyOf(arrayList, arrayList.length * 2);
	}

	void show() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < size; i++) {

			sb.append(arrayList[i] + " ");

		}

		System.out.println(sb.toString());
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(15);
		list.add(16);
		list.add(20);
		list.add(24);
		list.add(11);
		list.add(2, 24);

		System.out.println("size()...[" + list.size() + "]");
		list.show();

		System.out.println("contains(24)..." + list.contains(24));
		System.out.println("isEmpty()..." + list.isEmpty());
		System.out.println("get(3)...[" + list.get(3) + "]");

		System.out.println("clear()...");
		list.clear();

		System.out.println("size()...[" + list.size() + "]");

	}
}
