package generics;

import java.util.NoSuchElementException;

public class LinkedList<T> {

	private Node<T> head = null;

	private int size = 0;

	// returns the number of elements in the list
	int size() {

		return size;

	}

	// inserts the specified element at the specified position in the list
	void add(int index, T data) {

		Node<T> node = new Node<>(data);

		node.next = null;

		if (index < 0 || index > size) {

			throw new IndexOutOfBoundsException();

		} else if (index == 0) {

			addFirst(data);

		} else {

			Node<T> current = head;

			for (int i = 0; i < index - 1 && current.next != null; i++) {

				current = current.next;

			}

			node.next = current.next;
			current.next = node;
		}

		size++;
	}

	// inserts the given element at the beginning of the list
	void addFirst(T data) {

		Node<T> node = new Node<>(data);

		if (head == null) {

			head = node;

		} else {

			node.next = head;

			head = node;

		}

		size++;
	}

	// appends the given element to the end of the list
	void addLast(T data) {

		Node<T> node = new Node<>(data);

		Node<T> current = head;

		while (current.next != null) {

			current = current.next;

		}

		current.next = node;

		size++;
	}

	// removes all of the elements from the list
	void clear() {

		head = null;
		size = 0;

		/*
		 * for (int i = size - 1; i >= 0; i--) {
		 * 
		 * remove(i);
		 * 
		 * }
		 */
	}

	// returns true if the list contains the specified element
	boolean contains(T data) {

		Node<T> current = head;

		while (current.next != null) {

			current = current.next;

			if (current.data == data) {

				return true;

			}
		}

		return false;
	}

	// returns the element at the specified position in the list
	T get(int index) {

		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException();

		} else if (index == 0) {

			return head.data;

		} else {

			Node<T> current = head;

			for (int i = 0; i < index && current.next != null; i++) {

				current = current.next;

			}

			return current.data;
		}

	}

	// removes the element at the specified position in the list
	T remove(int index) {

		Node<T> removed = null;

		if (size == 0) {

			throw new NoSuchElementException();

		} else if (index < 0 || index > size) {

			throw new IndexOutOfBoundsException();

		} else if (index == 0) {

			removed = head;

			head = head.next;

			size--;

		} else {

			Node<T> node = null; // the node to be removed
			Node<T> current = head;

			for (int i = 0; i < index - 1 && current.next != null; i++) {

				current = current.next;

			}

			node = current.next;

			removed = current.next;

			current.next = node.next;

			size--;

		}

		return removed.data;
	}

	// removes and returns the first element from the list.
	T removeFirst() {

		Node<T> removed = head;

		if (size == 0) {

			throw new NoSuchElementException();

		}

		head = head.next;

		size--;

		return removed.data;
	}

	// removes and returns the last element from the list
	T removeLast() {

		Node<T> removed = null;
		Node<T> current = head;

		for (int i = 0; i < size - 2; i++) {

			current = current.next;

		}

		removed = current.next;

		current.next = null;

		size--;

		return removed.data;

	}

	void show() {

		StringBuilder sb = new StringBuilder();

		Node<T> current = head;

		while (current.next != null) {

			sb.append(current.data + " ");

			current = current.next;

		}

		sb.append(current.data + " ");

		System.out.println(sb.toString());

	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.addFirst(10);
		list.addFirst(12);
		list.addFirst(15);

		list.add(1, 20);
		list.add(1, 21);
		list.add(3, 40);

		list.addLast(50);
		list.addLast(55);
		list.addLast(60);

		list.show();

		System.out.println("size()...[" + list.size() + "]");

		System.out.println("contains(60)..." + list.contains(60));

		System.out.println("remove(0)...[" + list.remove(0) + "]");

		list.show();

		System.out.println("removeFirst()...[" + list.removeFirst() + "]");

		list.show();

		System.out.println("removeLast()...[" + list.removeLast() + "]");

		list.show();

		System.out.println("size()...[" + list.size() + "]");

		System.out.println("get(1)...[" + list.get(1) + "]");

		list.clear();
		System.out.println("size()...[" + list.size() + "]");

		list.addFirst(2);
		list.show();
		System.out.println("size()...[" + list.size() + "]");
	}
}
