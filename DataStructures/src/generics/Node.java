package generics;

public class Node<T> {

	T data = null;
	Node<T> next = null;
	Node<T> previous = null;

	Node(T data) {

		this.data = data;

	}

	public T getData() {
		return data;
	}

}
