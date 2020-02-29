package queue;

public class ArrayQueue {

	private int[] array;
	private int front; // front element of the queue (remove from)
	private int rear; // last element of the queue (add from)
	private int capacity;
	private int count; // current size of the queue

	ArrayQueue(int size) {

		array = new int[size];

		/*
		 * for(int i = 0; i < array.length; i++) {
		 * 
		 * array[i] = -1; }
		 */

		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	// Return the size of the queue
	public int size() {

		return count;
	}

	public boolean isEmpty() {

		if (size() == 0) {

			System.out.println("The queue is empty!");
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

	// Add element to the queue
	public void enqueue(int x) {

		if (isFull()) {

			System.out.println("The queue is full!");

		} else {

			rear++;
			array[rear] = x;
			count++;
		}
	}

	public void dequeue() {

		if (isEmpty()) {

			System.out.println("The queue is empty!");

		} else {

			array[front] = -1;
			front++;
			count--;
		}
	}

	public void display() {

		int length = capacity - 1;

		System.out.print("R>");
		for (int i = 0; i <= length; i++) {

			System.out.print("[" + array[length - i] + "]");

		}

		System.out.println(">F");

	}

	public static void main(String[] args) {

		ArrayQueue queue = new ArrayQueue(5);

		queue.enqueue(5); // Will be removed from the front first
		queue.enqueue(3); // Will be added from the rear
		queue.enqueue(13); // -//-
		queue.enqueue(12); // -//-
		queue.enqueue(42); // -//-

		queue.display();
		System.out.println("Size is: " + queue.size());

		queue.dequeue();

		queue.display();
		System.out.println("Size is: " + queue.size());

		queue.dequeue();

		queue.display();
		System.out.println("Size is: " + queue.size());
	}
}
