package _03_Stack;

public class Cstack {
	private int top;
	private int size;
	private char[] arr;
	public Cstack(int size)
	{
		super();
		this.size = size;
		top = -1;
		arr = new char[size];
		
	}
	
	public Cstack() {
		super();
		top =-1;
		size =3;
		arr = new char[size];
		
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false; 
		
	}
	
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}
		else
			return false;
		
	}
	
	public void push(char ch) {
		if(!isFull()) {
			top++;
			arr[top] = ch;
			
		}
		else {
			System.out.println("Stack is full..!");
		}
				
	}
	
	public char pop(){
		char varChar = '\0';
		if(!isEmpty()) {
			
			varChar = arr[top];
			top--;
			
		}
		
		return varChar;
		
	}
	
	public void display() {
		System.out.println("________Stack_______");
		for(int i=top;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
