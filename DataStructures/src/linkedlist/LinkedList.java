package linkedlist;

/**
 * LinkedList implementation with most common methods in use.
 * 
 * @author Martin Byalov
 */
public class LinkedList {

	Node head;

	private int size = 0;

	public LinkedList() {
	}

	/**
	 * This method appends the specified element to the end of the list.
	 * 
	 * @param data - the element specified by this parameter is appended to end of
	 *             the list.
	 */
	public void add(Object data) {

		Node node = new Node(data);

		if (head == null) {

			head = node;

		} else {

			Node current = head;

			while (current.next != null) {

				current = current.next;

			}

			current.next = node;
		}

		size++;
	}

	/**
	 * This method inserts the specified element at the specified position in the
	 * list.
	 * 
	 * @param index - specifies the position from the LinkedList where the element
	 *              to be inserted.
	 * @param data  - the element specified by this parameter is inserted at the
	 *              specified position.
	 */
	public void add(int index, Object data) {

		Node node = new Node(data);

		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException();

		}

		else if (index == 0) {

			addFirst(data);

		} else {

			Node current = head;

			for (int i = 0; i < index - 1; i++) {

				current = current.next;

			}

			if (current.next == null) {

				add(data);

			} else {

				node.next = current.next;
				current.next = node;

			}
		}

		size++;
	}

	/**
	 * This method inserts the specified element at the beginning of the list.
	 * 
	 * @param data - the element specified by this parameter is appended at
	 *             beginning of the list.
	 */
	public void addFirst(Object data) {

		Node node = new Node(data);

		if (head == null) {

			head = node;

		} else {

			node.next = head;
			head = node;

		}

		size++;
	}

	/**
	 * This method retrieves and removes the head (first element) of the list.
	 * 
	 * @return the first element of the list or the element present at the head of
	 *         the list.
	 */
	public Object remove() {

		Node current = head;
		Node node = current;

		head = current.next;
		current = null;

		return node.data;
	}

	/**
	 * This method removes the element at the specified position in the list.
	 * 
	 * @param index - specifies the position of the element to be removed from the
	 *              LinkedList.
	 * @return the element that has just been removed from the list.
	 */
	public Object remove(int index) {

		Node current = head;

		for (int i = 0; i < index - 1; i++) {

			current = current.next;

		}

		Node node = current.next;

		current.next = node.next;

		return node.data;
	}

	/**
	 * This method removes all of the elements from the list.
	 */
	public void clear() {

		head = null;
		size = 0;

	}

	/**
	 * This method replaces the element at the specified position in this list with
	 * the specified element.
	 * 
	 * @param index - refers to the position of the element that is to be replaced
	 *              from the linked list.
	 * @param data  - it is the new element by which the existing element will be
	 *              replaced and is of the same object type as the linked list.
	 * @return the previous value from the linked list that is replaced with the new
	 *         value.
	 */
	public Object set(int index, Object data) {

		Node current = head;
		Node node = current;

		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException();
		}

		else if (index == 0) {

			head = new Node(data);
			head.next = current.next;

			return node.data;

		} else {

			for (int i = 0; i < index - 1; i++) {

				current = current.next;

			}

			node = current.next;
			current.next = new Node(data);
			current.next.next = node.next;

			return node.data;

		}
	}

	/**
	 * This method returns the element at the specified position in this list.
	 * 
	 * @param index - specifies the position or index of the element to be fetched
	 *              from the LinkedList.
	 * @return the element present at the position specified by the parameter index.
	 */
	public Object get(int index) {

		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException();
		}

		else if (index == 0) {

			return head.data;

		} else {

			Node current = head;

			for (int i = 0; i < index; i++) {

				current = current.next;

			}

			return current.data;
		}
	}

	/**
	 * Simple print of the list.
	 */
	public void display() {

		Node current = head;

		while (current.next != null) {

			System.out.print(current.data + " ");

			current = current.next;
		}

		System.out.print(current.data + "\n");
	}

	/**
	 * This method returns the number of elements in the list.
	 * 
	 * @return the size or the number of elements present in the LinkedList.
	 */
	public int size() {

		return size;
	}

	public static void main(String[] args) {

		// LinkedList list = new LinkedList();

	}
}
