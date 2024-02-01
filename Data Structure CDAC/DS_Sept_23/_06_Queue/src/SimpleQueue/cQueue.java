package SimpleQueue;

public class cQueue {
	int size,rear,front;
	Customer arr[];
	public cQueue()
	{
		size=3;
		rear=front=-1;
		arr=new Customer[size];
	}
	public cQueue(int s)
	{
		size=s;
		rear=front=-1;
		arr=new Customer[size];
	}
	private boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}
	private boolean isFull()
	{
		if(rear==size-1)
			return true;
			else
				return false;
	}
	public void enQueue(Customer data) {
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=rear+1;
			arr[rear]=data;
		}
		System.out.println(" rear  ->" +rear);
		System.out.println(" front ->" +front);
	}
	public Customer deQueue()
	{
		Customer data=null;
		if(!isEmpty())
		{
			data=arr[front];
			if(front==rear)
				front=rear=-1;
			else
				front=front+1;
		}
		System.out.println(" rear  ->" +rear);
		System.out.println(" front ->" +front);
	
		return data;
		
	}
	public void display()
	{
		System.out.println("----- queue Is \n");
		if(isEmpty())
		{
			System.out.println("Queue Is Empty ");
			return;
		}
		for(int i=front;i<=rear;i++)
			System.out.print(arr[i]+" ");
		
	}

}
