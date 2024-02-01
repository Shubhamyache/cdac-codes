package CircularLinkList;

public class Node {
	int data;

	Node nexNode;
	
	public Node(int data) {
		this.data = data;
		nexNode=null;
		
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	

}
