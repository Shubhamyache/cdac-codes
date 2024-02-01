package BinarySearchTree;


public class TNode {
	int data;
	TNode leftNode;
	TNode rightNode;
	
	public TNode(int data){
		this.data = data;
		leftNode=rightNode = null;
		
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	

}
