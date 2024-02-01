package IntStack;

public class cStack {
	private int size;
	private int top;
	private int arr[];
	public cStack()
	{
		size=3;
		top=-1;
		arr=new int[size];
	}
	public cStack(int size)
	{
		this.size=size;
		top=-1;
		arr=new int [size];
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
		
	}
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else
			return false;
		
	}
	public void push(int data)
	{
		if(!isFull())
		{
			top++;
			arr[top]=data;
		}
		else
			System.out.println(" Stack Is Full !!! ");
		
	}
	public int pop()
	{
		int data=-9999;
		if(!isEmpty())
		{
			data=arr[top];
			top--;
		}
		return data;
	}
	public int peek()
	{
		int data=-9999;
		if(!isEmpty())
		{
			data=arr[top];
			//top--;
		}
		return data;
	}
	public void display()
	{
		System.out.println("----------- Stack Is ---------");
		for(int i=top;i>=0;i--)
			System.out.println("\t"+arr[i]);
		
	}
}
