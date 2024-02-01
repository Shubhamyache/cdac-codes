package PriorityQueue;

public class PriorityQ
{
	int size,front,rear;
	Element arr[];
	public PriorityQ(int size) {
		this.size = size;
		front=rear=-1;
		arr = new Element[size];
	}
	public boolean isEmpty() {
		if(rear==-1)
			return true;
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(rear==size-1)
			return true;
		else {
			return false;
		}
	}
	public void enQueue(Element data) {
		if(isFull()) {
			System.err.println("Queue is full!!!");
		}
		else {
			if(front==-1) {
				front=0;
			}
			rear = rear+1;
			arr[rear]=data;
		}
		for(int i=0;i<rear;i++) {
			for(int j=0;j<rear-i;j++) {
				if(arr[j].priority<arr[j+1].priority) {
					Element tempElement;
					tempElement = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tempElement;
				}
			}
		}
		
		
	}
	public Element deQueue() {
		Element dataElement = null;
		if(isEmpty()) {
			System.err.println("Queue is empty!!");
			return dataElement;
		}
		
		dataElement = arr[front];
		if(front==rear) {
			front=rear=-1;
		}
		else {
			front = front+1;
		}
		return dataElement;
	}
	
	public void display() {
			for(int i=front;i<=rear;i++) {
				System.out.println(arr[i]);
			}
	}
	
	
	

}
