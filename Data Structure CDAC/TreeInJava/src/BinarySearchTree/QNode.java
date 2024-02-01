package BinarySearchTree;

public class QNode {
	TNode data;
	QNode nextNode;
	
	public QNode(TNode data) {
		this.data = data;
		nextNode = null;
	}

	@Override
	public String toString() {
		return "QNode [data=" + data + "]";
	}
	

}
