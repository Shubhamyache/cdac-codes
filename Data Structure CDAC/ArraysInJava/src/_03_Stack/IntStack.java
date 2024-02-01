package _03_Stack;

public class IntStack {
	private int top;
	private int size;
	private int[] arr;
	
	public IntStack(int size) {
		super();
		top = -1;
		this.size = size;
		arr = new int[size];
		
	}
	
	public IntStack() {
		super();
		top =-1;
		size =3;
		arr = new int[size];
		
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
		return false;
		
	}
	
	public void push(int ch) {
		if(!isFull()) {
			top++;
			arr[top] = ch;
			
		}
		else {
			System.out.println("Stack is full..!");
		}
				
	}
	
	public int pop(){
		int varChar = -9999;
		if(!isEmpty()) {
			
			varChar = arr[top];
			top--;
			
		}
		else {
			System.out.println("Stack is Underflow");
		}
		return varChar;
		
	}
	
	public void display() {
		System.out.println("________Stack_______");
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
