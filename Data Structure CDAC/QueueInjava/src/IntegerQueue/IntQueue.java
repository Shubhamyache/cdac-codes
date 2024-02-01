package IntegerQueue;

public class IntQueue {
	private int size;
	private int rear;
	private int front;
	
	private int arr[];
	public IntQueue(int size) {
		super();
		this.size = size;
		front=rear =-1 ;
		arr = new int[size];
		
	}
	public IntQueue() {
		super();
		this.size = 3;
		front=rear =-1 ;
		arr = new int[size];
		
	}
	
	private boolean isEmpty() {
		if(front==-1) {
			return true;
			
		}
		else
			return false;
	}
	
	private boolean isFull() {
		if(rear==size-1) {
			return true;
		}
		return false;
	}
	
	
	public void EnQueue(int in) {
		if(!isFull()) {
			if(front==-1) {
				front=0;
			}
			rear++;
			arr[rear] = in;
			
		}
		else {
			System.out.println("Queue is full!!!!");
		}
	}
	public int DeQueue() {
		int res = -9999;
		if(!isEmpty())
		{
			res = arr[front];
			if(front==rear)
				front=rear=-1;
			else
				front++;
					
		}
		return res;
	}
	public void display() {
		System.out.println("________QUEUE DISPLAY____________");
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}
	

}










