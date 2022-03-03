package stack;

public class Node {

	public int data;
	public Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	public void displayNode()
    {
        System.out.print(data+"  ");
    }
	
	
}