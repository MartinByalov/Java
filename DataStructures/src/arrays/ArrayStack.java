package arrays;

class ArrayStack {

	private int[] array;
	private int top; // top of the stack as index
	private int capacity;

	// Creating new stack
	ArrayStack(int size) {

		array = new int[size];
		capacity = size;
		top = -1;

	}

	// Returns the size of the stack
	public int size() {

		return top + 1;

	}

	public boolean isEmpty() {

		if (size() == 0) {

			return true;

		} else {

			return false;
		}

	}

	public boolean isFull() {

		if (size() == capacity) {

			return true;

		} else {

			return false;
		}
	}

	// Insert element in stack
	public void push(int x) {

		if (isFull()) {

			System.out.println("The stack is full!");

		} else {

			top++;
			array[top] = x;

		}
	}

	public int peek() {

		if (!isEmpty()) {

			return array[top];

		} else {

			System.out.println("The stack is empty!");

			return -1;
		}
	}

	public void pop() {

		if (isEmpty()) {

			System.out.println("The stack is empty!");

		} else {

			System.out.println(peek() + " was removed!");

			top--;

		}

		/*
		 * In array type of stack the top element isn't actually removed but replaced in
		 * the next push().
		 */
	}

	/*
	 * public void display() {
	 * 
	 * int length = capacity - 1;
	 * 
	 * for(int i = 0; i <= length; i++) {
	 * 
	 * System.out.println("[" + array[length - i] + "]");
	 * 
	 * } }
	 */

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		ArrayStack stack = new ArrayStack(10);

	}
}
