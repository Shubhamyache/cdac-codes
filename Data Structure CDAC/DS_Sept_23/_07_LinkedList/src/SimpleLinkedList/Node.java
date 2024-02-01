package SimpleLinkedList;

public class Node {
	int data;
	Node link;
	
	public String toString() {
		return data + " ";
	}
	public Node(int data) {
		super();
		this.data = data;
		this.link = null;
	}
	

}
