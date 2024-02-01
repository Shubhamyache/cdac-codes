package CircularLinkList;

public class CircularLL {
	Node headNode;
	
	public CircularLL()
	{
		headNode = null;
	}
	public void addNodeEnd(int data) {
		Node newnode = new Node(data);
		
		if(headNode==null) {
			headNode = newnode;
			newnode.nexNode=headNode;
		}
		else
		{
			Node moveNode = headNode;
			while(moveNode.nexNode != headNode ) 
				moveNode = moveNode.nexNode;				
			
			moveNode.nexNode = newnode;
			newnode.nexNode = headNode;			
		}
		
	}
	
	public void addNodeBeg(int data) {
		Node newNode = new Node(data);
		if(headNode==null) {
			headNode = newNode;
			newNode.nexNode = headNode;
		}
		
		else {
			Node moveNode = headNode;
			while(moveNode.nexNode!=headNode)
			{
				moveNode= moveNode.nexNode;
			}
			newNode.nexNode = headNode;
			headNode = newNode;
			moveNode.nexNode=headNode;
		}
		
		
	}
	public int size() {
		Node moveNode = headNode;
		if(headNode==null) {
			return 0;
		}
		if(headNode.nexNode==null) {
			return 1;
		}
		int count=1;
		while(moveNode.nexNode!=headNode) {
			moveNode = moveNode.nexNode;
			count++;
		}
		return count;
	}
	
	public void addNodeMid(int pos,int data) {
		Node newnode = new Node(data); 
		int count = size();
		if(pos>count+1 && pos<0) {
			return;
		}
		if(pos==1) {
			addNodeBeg(data);
		}
		else if(pos == count+1) {
			addNodeEnd(data);
		}
		else {
			Node moveNode = headNode;
			for(int i=1;i<pos;i++) 
			{
				moveNode = moveNode.nexNode;
			}
			newnode.nexNode = moveNode.nexNode;
			moveNode.nexNode = newnode;
			
		}
		
	}
	public void display() {
		Node moveNode = headNode;
		while(moveNode.nexNode!=headNode) {
			System.out.println(moveNode.data);
			moveNode = moveNode.nexNode;
		}
		if(moveNode.nexNode==headNode) {
			System.out.println(moveNode.data);
		}
		
	}

}
