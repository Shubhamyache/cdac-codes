package CharStack;

public class cStack {
	int size,top;
	char arr[];
	public cStack()
	{
		size=3;
		top=-1;
		arr=new char[size];
	}
	public cStack(int size)
	{
		this.size=size;
		top=-1;
		arr=new char[size];
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
		return top==size-1?true:false;
	}
//		if(top==size-1)
//			return true;
//		else
//			return false;
//	}
	public void push(char ch)
	{
		if(!isFull())
		{
			arr[++top]=ch;
		}
		else
			System.out.println("Stack Is Full !!! ");
	}
	public char pop()
	{
		char ch='\0';
		if(!isEmpty())
			ch=arr[top--];
		return ch;
	}
	public void display()
	{
		System.out.println(" ---------- Stack Is ----------\n");
		for(int i=top;i>=0;i--)
			System.out.println("\t"+arr[i]);
	}
}
