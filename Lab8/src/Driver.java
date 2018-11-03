import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {

		LinkedDeque<String> test = new LinkedDeque<String>();

		System.out.println("The Beginning List: ");
		System.out.println("--------------------");
		test.addFirst("Jessica");
		test.addLast("Tony");
		test.addFirst("Tyler");
		test.addLast("Jacob");
		test.printForward();

		System.out.println("The listed printed backwards: ");
		test.printBackward();
	
		System.out.println("Getting elements: ");
		System.out.println("------------------");
		System.out.println("The first element is: " + test.getFirst());
		System.out.println("The last element is: " + test.getLast());
		
		System.out.println();
		
		System.out.println("Removing elements: ");
		System.out.println("-------------------");
		System.out.println("The first element removed was: " + test.removeFirst());
		System.out.println("The last element removed was: " + test.removeLast());
		System.out.println();
		System.out.println("The remaining list: ");
		test.printForward();
		
		
		System.out.println("A new list: ");
		System.out.println("------------");
		test.addFirst("Regina");
		test.addFirst("Piper");
		test.addFirst("Jessica");
		test.addFirst("Brian");
		test.addFirst("Jimmy");
		test.addFirst("Donald");
		test.addFirst("Roman");
		test.addFirst("Karl");
		test.addFirst("Peter");
		test.addFirst("Romeo");
		test.addLast("Brian");
		test.addLast("Isaiah");
		test.addLast("Cameron");
		test.addLast("Jessica");
		test.addLast("Becky");
		test.addLast("Roger");
		test.addLast("Karl");
		test.addLast("Amy");
		test.addLast("Romeo");
		test.addLast("Billy Bob Joe");
		test.printForward();
		
		System.out.println("Removing occurrences: ");
		System.out.println("----------------------");
		test.removeFirstOccurrence("Brian");
		test.removeFirstOccurrence("Romeo");
		test.removeLastOccurrence("Jessica");
		test.removeLastOccurrence("Karl");
		
		
		System.out.println("The remaining list: ");
		test.printForward();

	

	}

}
