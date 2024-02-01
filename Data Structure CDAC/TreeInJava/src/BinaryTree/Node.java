package BinaryTree;

public class Node {
	int data;
	Node leftNode;
	Node rightNode;
	
	public Node(int data){
		this.data = data;
		leftNode=rightNode = null;
		
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	

}
