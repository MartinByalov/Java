package arrays;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * ArrayList array implementation with most common methods in use.
 * 
 * @author Martin Byalov
 *
 */
public class ArrayList {

	private Object[] arrayList;

	private int size = 0; // number of elements in the array list.
	private int capacity;

	/**
	 * This constructor is used to create an empty array list.
	 * 
	 * @param size - size of the array list specified by the user.
	 */
	public ArrayList(int size) {

		capacity = size;

		arrayList = new Object[size];

	}

	/**
	 * This method inserts an element at the beginning of the list.
	 * 
	 * @param item - the element to be inserted in the list.
	 */
	public void add(Object item) {

		if (size == capacity) {

			ensureCapacity(capacity * 2);
		}

		arrayList[size] = item;

		size++;

	}

	/**
	 * This method returns the number of elements in the array list.
	 * 
	 * @return the size or the number of elements present in the LinkedList.
	 */
	public int size() {

		return size;
	}

	/**
	 * Returns true if this list contains the specified element.
	 * 
	 * @param item - element whose presence in this list is to be tested.
	 * @return true if the specified element is found in the list else it returns
	 *         false.
	 */
	public boolean contains(Object item) {

		for (Object current : arrayList) {

			if (current != null && current.equals(item)) {

				return true;

			}
		}

		return false;
	}

	/**
	 * Replaces the element at the specified position in this list with the
	 * specified element.
	 * 
	 * @param item  - element to be stored at the specified position.
	 * @param index - index of the element to replace.
	 */
	public void set(Object item, int index) {

		if (index < size) {

			if (contains(item)) {

				arrayList[index] = item;

			} else {

				arrayList[index] = item;
			}

		} else {

			throw new IndexOutOfBoundsException();
		}
	}

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index - index of the elements to be returned.
	 * @return the element at the specified index in the given list.
	 */
	public Object get(int index) {

		if (index < capacity) {

			if (contains(arrayList[index]) && arrayList[index] != null) {

				return arrayList[index];

			} else {

				throw new NoSuchElementException();

			}

		} else {

			throw new IndexOutOfBoundsException();
		}

	}

	/**
	 * Removes the element at the specified position in the array list.
	 * 
	 * @param index - index of the elements to be removed.
	 */
	public void removeAt(int index) {

		if (index < 0 || index > size) {

			throw new IndexOutOfBoundsException();

		} else {

			arrayList[index] = null;
		}

	}

	/**
	 * This method removes the first occurrence of the specified element from the
	 * list if the element is present. If the element is not present, the list isn't
	 * changed.
	 * 
	 * @param item
	 */
	public void remove(Object item) {

		if (contains(item)) {

			arrayList[indexOf(item)] = null;

		} else {

			throw new NoSuchElementException();
		}

	}

	/**
	 * This method removes all the elements from the list. The list will be empty.
	 * S
	 */
	public void clear() {

		for (int i = 0; i < capacity; i++) {

			arrayList[i] = null;
		}

	}

	/**
	 * This method returns the index of the first occurrence of the specified
	 * element in the list or -1 if the list doesn't contain the element.
	 * 
	 * @param item
	 * @return
	 */
	public int indexOf(Object item) {

		int index = -1;

		for (int i = 0; i < capacity; i++) {

			if (arrayList[i] != null && arrayList[i].equals(item)) {

				index = i;

				break;
			}
		}

		if (index == -1) {

			throw new NoSuchElementException();
		}
		return index;

	}

	/**
	 * This method takes the desired minimum capacity as a parameter.
	 * 
	 * @param minCapacity
	 */
	private void ensureCapacity(int minCapacity) {

		/*
		 * Labour approach
		 * 
		 * Object[] newArrayList = new Object[capacity];
		 * 
		 * for (int i = 0; i < newArrayList.length; i++) {
		 * 
		 * newArrayList[i] = arrayList[i]; }
		 * 
		 * arrayList = new Object[minCapacity];
		 * 
		 * for (int i = 0; i < newArrayList.length; i++) {
		 * 
		 * arrayList[i] = newArrayList[i]; }
		 */

		// convenient approach
		arrayList = Arrays.copyOf(arrayList, minCapacity);

		capacity = minCapacity;
	}

	/**
	 * Simple print of the list.
	 */
	public void display() {

		for (int i = 0; i < capacity; i++) {

			System.out.print(arrayList[i] + " ");

		}

		System.out.println();
	}

	public static void main(String[] args) {

		ArrayList list = new ArrayList(4);

		list.add(14);
		list.add(14);
		list.add(15);
		list.add(15);
		list.add("Ivan");
		list.add(1333);

		list.add("0");
		list.add("zaz");

		list.display();

		System.out.println(list.indexOf(15));
	}
}
