package _11_DymanicStack;

public class cStack {
	Node top;
	public cStack()
	{
		top=null;
	}
	public void push(int data)
	{
		Node n1=new Node(data);
		if(top==null)
			top=n1;
		else
		{
			n1.next=top;
			top=n1;
		}
	}
	public boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	public int pop()throws StackEmptyException
	{
		int data=0;
		if(isEmpty())
			throw new StackEmptyException("No data available ");
		else
		{
			 data=top.data;
			top=top.next;
			
		}
		return data;
	}
	public void display()
	{
		Node move=top;
		while(move!=null)
		{
			System.out.println(move.data);
			move=move.next;
		}
	}

}