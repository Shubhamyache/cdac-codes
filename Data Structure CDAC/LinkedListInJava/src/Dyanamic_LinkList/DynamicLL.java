package Dyanamic_LinkList;

public class DynamicLL {
	Node top;
	public DynamicLL() {
		top = null;
	}
	public void push(int data) {
		Node newnode = new Node(data);
		if(top==null) 
			top = newnode;
		
		else {
			newnode.nextNode = top.nextNode;
			top = newnode;				
		}
	}
	
	public int pop() {
		int delNode = top.data;
		top = top.nextNode;
		return delNode;
		
	}
	
	public void display() {
		Node moveNode = top;
		while(moveNode!=null) {
			System.out.println(moveNode.data);
			moveNode = moveNode.nextNode;
		}
	}

}
