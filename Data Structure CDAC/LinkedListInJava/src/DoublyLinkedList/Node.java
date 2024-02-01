package DoublyLinkedList;

public class Node {
	Node prevNode;
	int data ;
	Node nextNode;
	
	public Node(int data) {
		this.data = data;	
		prevNode=nextNode=null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	

}
