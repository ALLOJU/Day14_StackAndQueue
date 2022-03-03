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
		/*
		 * 4.Displaying the stack size
		 */
		System.out.println("Stack size is  "+list.size());
		/*
		 * 5.check stack empty or not 
		 */
		System.out.println("Stack is empty or not  "+list.isEmpty());
		/*
		 * 6.display peek element of the stack 
		 */
		System.out.println("Peek element of stack  "+list.peek());
		/*
		 * 7.pop element of the stack
		 */
		System.out.println("pop element of stack  "+list.pop());
	}
}
