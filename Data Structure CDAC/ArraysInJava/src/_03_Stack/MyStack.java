package _03_Stack;

public class MyStack {
	private int top;
	private int size;
	private Book[] barr;
	public MyStack(int size) {
		super();
		top = -1;
		this.size = size;
		barr = new Book[size];
	}
	public MyStack() {
		super();
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
			
		}
		else
			return false;
		
	}
	
	public boolean isFull() {
		if(top==size-1) {
			return true;
			
		}
		else
			return false;
		
	}
	
	public void push(Book data) {
		if(!isFull()) {
			top++;
			barr[top]= data;
		}
		else {
			System.out.println("Stack overflow!!");
		}
		
	}
	public Book pop() {
		Book b = null;
		if(!isEmpty()) {
			b = barr[top];
			top--;
			
		}
		else {
			System.out.println("Stack Underflow");
		}
		return b;
	}
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(barr[i]);
		}
	}
	
	
	
	

}
