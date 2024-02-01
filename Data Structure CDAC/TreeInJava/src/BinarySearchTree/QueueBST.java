package BinarySearchTree;

public class QueueBST
{
	QNode frontNode,rearNode;
	public QueueBST() {
		frontNode=rearNode=null;
	}
	
	public boolean isEmpty() {
		if(frontNode==null) {
			return true;
		}
		else 
			return false;
	}
	public void enQueue(TNode data) {
		
		
			QNode newnode = new QNode(data);
			
			if(frontNode==null) {
				frontNode = rearNode = newnode;	
				return;
			}
			rearNode.nextNode = newnode;
			rearNode = newnode;			
					
	}
	
	public TNode deQueue() {
		TNode data = null;
	
		if(isEmpty()) {
			return data;
		}
		else
		{
			data = frontNode.data;
			if(frontNode==rearNode) {
				frontNode=rearNode=null;
			}
			else 
				frontNode = frontNode.nextNode;
			return data;
		}
		
	}
	
	public void display() {
		QNode moveNode = frontNode;
		while(moveNode!=null) {
			System.out.println(moveNode.data);
			moveNode = moveNode.nextNode;
		}
		
	}
}




