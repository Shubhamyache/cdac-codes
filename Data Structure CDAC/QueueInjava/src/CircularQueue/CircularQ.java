package CircularQueue;

public class CircularQ {
	private int size ;
	private int rear;
	private int front;
	private int arr[];
	public CircularQ(int size) {
		
		this.size = size;
		front=rear=-1;
		arr = new int[size];
	}
	public CircularQ() {
		size = 3;
		front=rear=-1;
		arr = new int[size];
		
	}
	public boolean isFull() {
		if(front==(rear+1)%size) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		return false;
	}
	public void EnQueue(int in) {
		int size = arr.length;
		if(!isFull()) {
			if(front==-1) {
				front=0;
			}
			rear = (rear+1)%size;
			arr[rear] = in;	
						
		}
		else {
			System.out.println("Queue is full!!!");
		}
	}
	
	public int DeQueue() {
		int size = arr.length;
		int data=-9999;
		if(!isEmpty()) {
			data = arr[front];
			if(front==rear) {
				front=rear=-1;
			}
			else
				front =  (front+1)%size;		
			
		}
		
		return data;
	}
	public void display() {
		int i;
		System.out.println("\n--------Queue is-----------");
		for(i=front;i!=rear;i=(i+1)%size)
			System.out.println(arr[i]+"\t");
		if(i==rear) {
			System.out.println(arr[i]+"\t");
		}
		
		
		System.out.println();
		System.out.println("Front->"+front);
		System.out.println("Rear ->"+rear);
		
	}
	
	

}
