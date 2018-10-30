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

		DNode temp1 = new DNode(element);
		
		
			temp1.next = head.next;
			temp1.next.previous = temp1;
			head.next = temp1;
			temp1.previous = head;
			
		return;
	}

	public E removeFirst() {
		

		 /* DNode current;
		  
		  current.previous.next = current.next; 
		  current.next.previous = current.previous;
		  */
		return null;
	}

	public E getFirst() {

		return null;
	}

	public boolean removeFirstOccurrence(Object obj) {

		return false;
	}

	public void addLast(E element) {
		
		DNode temp1 = new DNode( element );
		
		DNode temp2 = head;
		
		temp1.next = null;
		
		if (isEmpty())
			throw new NoSuchElementException();
			
			
		if ( head == null) {
			temp1.previous = null;
			head = temp1;
			return;
		}
		
		while( temp2.next != null) {
			temp2 = temp2.next;
		}

			temp2.next = temp1;
			temp1.previous = temp2;
			
			return;
	}

	public E removeLast() {
		

		/*E element = tail.getLast();
		
		if (isEmpty())
			throw new NoSuchElementException();
		if (  == 0 ) throw new NoSuchElementException();
			DNode temp1 = tail;
			tail = tail.previous;
			tail.next = null;
			
		return;
		
		DNode pointer = head;
		
		while ( pointer.next != null) {
			pointer = pointer.next;
		}*/
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