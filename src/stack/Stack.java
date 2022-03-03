package stack;
/**
 * Main method for manipulation stack using linkedList
 * @param args - 
 */
public class Stack {
	public static void main(String[] args) {
		/*
		 * PROCEDURE
		 * 1. Creating stack using linked list
		 * 2. using push() method push values to stack
		 * 3.Displays stack values
		 */
		/*
		 * 1.creating linked list
		 */
		LinkedList list = new LinkedList();

		/*
		 * 2.pushing elements to stack
		 */
		list.push(70);
		list.push(30);
		list.push(56);

		/*
		 * 3.Displaying the stack
		 */
		list.display();

	}
}
