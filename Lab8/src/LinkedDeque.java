import java.util.NoSuchElementException;

public class LinkedDeque<E> implements Deque<E> {

	private static class DNode<E> {

		private E data;
		private DNode<E> previous;
		private DNode<E> next;

		public DNode(E data, DNode<E> previous, DNode<E> next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}

		public DNode(E data) {
			this(data, null, null);
		}

		public DNode() {
			this(null, null, null);
		}
	}

	private DNode<E> head;
	private DNode<E> tail;

	// Creates both a dummy head and a dummy tail.
	public LinkedDeque() {
		head = new DNode<>();
		tail = new DNode<>();
		head.next = tail;
		tail.previous = head;
	}

	public boolean isEmpty() {
		return head.next == tail;
	}

	public void clear() {
		head.next = tail;
		tail.previous = head;
	}

	// Complete the following methods:

	public void addFirst(E element) {

		if (isEmpty())
			throw new NoSuchElementException();

		DNode<E> temp1 = new DNode<>(element);

		temp1.next = head.next;
		temp1.next.previous = temp1;
		head.next = temp1;
		temp1.previous = head;

		return;
	}

	public E removeFirst() {

		if (isEmpty())
			throw new NoSuchElementException();

		DNode<E> deletion = new DNode<>();

		deletion = head.next;

		if (head.next == null) {
			tail = null;
		} else {
			head.next.previous = null;
			head = head.next;
		}

		return head.data;
	}

	public E getFirst() {

		return head.next.data;
	}

	public boolean removeFirstOccurrence(Object obj) {

		if (isEmpty())
			throw new NoSuchElementException();

		DNode<E> current = head;
		if (current.data.equals(obj)) {
			head = current.next;
		} else {
			boolean found = false;
			while (current != null && !found) {
				if (current.next.previous == null) {
					current.next.previous = current;
				}
				current = current.next;
				if (current.data.equals(obj)) {
					found = true;
					if (current.next == null) {
						current.previous.next = null;
					} else {
						current.previous.next = current.next;
					}
				}
			}
		}

		return false;

	}

	public void addLast(E element) {

		if (isEmpty())
			throw new NoSuchElementException();

		DNode<E> temp1 = new DNode<>(element);

		temp1.previous = tail.previous;
		temp1.previous.next = temp1;
		tail.previous = temp1;
		temp1.next = tail;

		return;
	}

	public E removeLast() {

		if (isEmpty())
			throw new NoSuchElementException();

		DNode<E> deletion = new DNode<>();

		deletion = tail.previous;

		if (tail.previous == null) {
			head = null;
		} else {
			tail.previous.next = null;
			tail = tail.previous;
		}

		return tail.data;

	}

	public E getLast() {

		return tail.previous.data;
	}

	public boolean removeLastOccurrence(Object obj) {

		DNode<E> current = head;
		DNode<E> prev = null;
		DNode<E> temp = null;

		while (current != null) {
			if (current.next != null && current.next.data == obj) {
				prev = current;
				temp = current.next;
			}
			current = current.next;
		}
		prev.next = temp.next;
		return false;
	}

	public void printForward() {
		System.out.println("The deque printed forward:");
		DNode current = head.next;
		while (current != tail) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println();
	}

	public void printBackward() {
		System.out.println("The deque printed backward:");
		DNode current = tail.previous;
		while (current != head) {
			System.out.println(current.data);
			current = current.previous;
		}
		System.out.println();
	}

}