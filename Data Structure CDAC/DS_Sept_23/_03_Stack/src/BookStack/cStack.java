package BookStack;

public class cStack {
	int size,top;
	Book arr[];
	public cStack()
	{
		size=3;
		top=-1;
		arr=new Book[size];
	}
	public cStack(int s)
	{
		size=s;
		top=-1;
		arr=new Book[size];
	}
	public boolean isEmpty()
	{
		return  top==-1?true:false;
	}
	public boolean isFull()
	{
		return  top==size-1?true:false;
	}
	public void push(Book data)
	{
		if(!isFull())
		{
			top++;
			arr[top]=data;
		}
		else
			System.out.println(" Stack is Full ");
		
		
	}
	public Book pop()
	{
		Book data=null;
		if(!isEmpty())
		{
			data=arr[top];
			top--;
			
		}
		return data;
		
				
	}
	public void display()
	{
		System.out.println(" ---------- Stack Is ----------\n");
		for(int i=top;i>=0;i--)
			System.out.println("\t"+arr[i]);
	}

	}
