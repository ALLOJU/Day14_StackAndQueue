package stack;
/**
 * push - this method is created to add data to stack


 * @param head - accepting head pointer of LinkedList to manipulate it
 * @param data - accepting data to put it in linkedList
 * @return head - it returns head of linkedList
 *
 */
public class LinkedList{
	
	/**
	* push - this method is used to create data to linkedList
	* 
	*/
	Node head;
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
        head = newNode;
	}
	
	public void display() {
        if (head == null)
          System.out.println("Empty stack");
        else {
          Node temp = head;
          while (temp.next != null) {
          System.out.print(temp.data + " - > ");
          temp = temp.next;
          }
          System.out.println(temp.data);
        }
}
}