package DynamicQueue;

public class DynamicQ {
	Node front,rear;
	public DynamicQ() {
		front = rear = null;
	}
	public boolean isEmpty() {
		if(rear==null) 
			return true;
		else
			return false;
		
	}
	public void enQueue(int data){
		Node newnode = new Node(data);
		if(rear==null) {
			rear=front=newnode;
		}
		else 
		{
		rear.nextNode=newnode;
		rear = newnode;
		newnode.nextNode=null;	
		}
				
	}
	public int deQueue() 
	{
		int n = -9999;
		int data;  
		Node moveNode = front;
		if(isEmpty()) 
		{
			System.err.println("Queue is empty!!");
			return n;
		}
		
		data = front.data;
		front = front.nextNode;
		return data;
		
	}
	public void display() {
		Node moveNode = front;
		while(moveNode!=null) {
			System.out.println(moveNode.data);
			moveNode = moveNode.nextNode;
		}
	}
	@Override
	public String toString() {
		String string = "";
		Node moveNode = front;
		while(moveNode!=null) {
			string = string+" "+moveNode.data;
			moveNode=moveNode.nextNode;
		}
		return string;
	}
	
	

}
