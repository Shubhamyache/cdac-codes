package CustomerQueue;

public class CustQueue {
	private int size;
	private int rear;
	private int front;
	private Customer[] arr;
	public CustQueue(int size) {
		super();
		this.size = size;
		rear = front =-1;
		arr = new Customer[size];
	}
	public CustQueue() {
		super();
		size =3;
		rear=front=-1;
		arr = new Customer[size];
	}
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear==size-1) {
			return true;
			
		}
		else
			return false;
	}
	public void EnQueue(Customer data) {
		if(!isFull()) {
			rear++;
			if(front==-1) {
				front =0;
			}
			arr[rear]=data;
		}
		else {
			System.out.println("Queue is Full!!!!");
		}
	}
	public Customer DeQueue() {
		Customer data = null;
		if(!isEmpty()) {	
			data = arr[front];
			if(front==rear) {
				front=rear=-1;
			}
			else
				front++;
			
		}
				
		
		return data;
	}
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
	
	

}
