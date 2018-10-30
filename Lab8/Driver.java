
public class Driver {

	public static void main(String[] args) {
		
		LinkedDeque<E> test = new LinkedDeque<E>();
		
	    System.out.println(test.addFirst(10));
		test.addFirst(34);
		test.addLast(56);
		test.addLast(364);
		test.printForward();
		test.removeFirst();
		test.removeLast();
		test.printBackward();

	}

}
