package stack;

import java.util.EmptyStackException;

/**
 * push - this method is created to add data to stack
 * display - this method is used to display stack values
 * pop - this method is used to remote element from top of the stack
 * isEmpty - this method is used to check stack is empty or not
 * peek - this method returns peek element of the stack
 * size - this method returns size of the stack


 * @param top - accepting head pointer of LinkedList to manipulate it
 * @param data - accepting data to put it in linkedList
 * @return top - it returns top of linkedList
 *
 */
public class LinkedList{

	/**
	 * push - this method is used to create data to linkedList
	 * 
	 */
	Node top;
	public int size;
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		size++;
	}
	/**
	 * display - this method is used to display stack values
	 * 
	 */

	public void display() {
		if (top == null)
			System.out.println("Empty stack");
		else {
			Node temp = top;
			while (temp.next != null) {
				System.out.print(temp.data + " - > ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	/**
	 * pop - this method is used to remote element from top of the stack
	 * 
	 */
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result=top.data;
		top=top.next;
		size--;
		return result;
	}
	/**
	 * isEmpty - this method is used to check stack is empty or not
	 * 
	 */
	public boolean isEmpty() {
		return size==0;
	}
	/**
	 * peek - this method returns peek element of the stack
	 * 
	 */
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;

	}
	/**
	 * size - this method returns size of the stack
	 * 
	 */
	public int size() {
		return size;
	}
}