package SinglyLinked;

public class Node {
	int data;
	Node link;
	
	public Node() {
		link = null;
		
	}
	public Node(int data) {
		this.data = data;
		link = null;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	
	

}
