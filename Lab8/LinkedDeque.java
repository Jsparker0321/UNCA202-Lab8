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

	public int size() {
		return size;
	}
	
// Complete the following methods:

	public void addFirst(E element) {

		Node temp1;

		if (head != null) {
			
			head.previous = temp1;
		}
		head = temp1;

		if (tail == null) {
			tail = temp1;
			size++;
		}

	}

	public E removeFirst() {
		
		/*if ( size == 0 ) throw new NoSuchElementException();
		Node temp1 = tail;
		tail = tail.previous;
		tail.next = null;
		size--;*/
		
		Node current;

		current.previous.next = current.next;
		current.next.previous = current.previous;

		return null;
	}

	public E getFirst() {

		return null;
	}

	public boolean removeFirstOccurrence(Object obj) {
		
		return false;
	}

	public void addLast(E element) {
		 
		Node temp1;
		if (tail != null) {
			tail.next = temp1;
		}
		tail = temp1;

		if (head == null)
			head = temp1;
			size++
	}

	public E removeLast() {

		if ( size == 0 ) throws new NoSuchElementException();
			Node temp1 = tail;
			tail = tail.previous;
			tail.next = null;
			size --;
		return null;
	}

	public E getLast() {

		return null;
	}

	public boolean removeLastOccurrence(Object obj) {

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