
public class Driver {

	public static void main(String[] args) {
		
		LinkedDeque<Integer> test = new LinkedDeque<Integer>();
		
	    test.addFirst(10);
		test.addFirst(34);
		test.printForward();
		test.addLast(56);
		test.addLast(364);
		test.addLast(55);
		test.printForward();
		test.printBackward();
		test.removeFirst();
		//test.removeLast();
		//test.printBackward();

	}

}
