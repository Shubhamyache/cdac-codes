package CircularQueue;

public class cQueue {
	private int size,rear,front;
	int arr[];
	public cQueue()
	{
		size=3;
		front=rear=-1;
		arr=new int [size];
	}
	public cQueue(int s)
	{
		size=s;
		front=rear=-1;
		arr=new int [size];
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
		if(front==(rear+1)%size)
			return true;
		else
			return false;
	}
	public void enQueue(int data)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		else
			System.out.println(" Queue Is Full ");
		
	}
	public int deQueue()
	{
		int data=-9999;
		if(!isEmpty())
		{
			data=arr[front];
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%size;
		}
		return data;
	}
	public void display()
	{
		int i;
		System.out.println("----------- Queue Is ------\n");
		for(i=front;i!=rear;i=(i+1)%size)
			System.out.print(arr[i]+"\t");
		if(i==rear)
			System.out.print(arr[i]+"\t");
		System.out.println();
		System.out.println("Front->"+front);
		System.out.println("Rear ->"+rear);
	}
	
	
	
	
	

}











