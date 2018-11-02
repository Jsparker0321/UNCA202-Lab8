import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {

		LinkedDeque<String> test = new LinkedDeque<String>();

		test.addFirst("Jessica");
		test.addFirst("Tyler");
		test.addFirst("Michael");

		test.printForward();

		test.addLast("Brandy");
		test.addLast("Baxter");
		test.addLast("Susan");
		
		test.printBackward();
	
		
		System.out.println("The first element is: " + test.getFirst());
		System.out.println("The last element is: " + test.getLast());
		
		test.addFirst("Romeo");
		test.addFirst("Rachel");
		test.addLast("Juliet");
		test.addLast("Derrick");
		
		test.printForward();

		System.out.println("The element removed was: " + test.removeFirst());
		System.out.println("The element removed was: " + test.removeLast());
		
		test.printForward();
		
		test.addFirst("Jacob");
		test.addFirst("Brian");
		test.addFirst("Jimmy");
		test.addFirst("Kyle");
		test.addLast("Brian");
		test.addLast("Isaiah");
		test.addLast("Cameron");
		test.addLast("Romeo");

		test.printForward();
		//test.removeFirstOccurrence("Brian");
		//test.removeFirstOccurrence("Romeo");
		//System.out.println("Element found: " + found1);
		//test.printForward();

		test.removeLastOccurrence("Brian");
		test.removeLastOccurrence("Romeo");
		test.printForward();
		/*boolean found2 = test.removeLastOccurrence("Romeo");
		System.out.println("Element found:" + found2);
		test.printForward();*/

	}

}
