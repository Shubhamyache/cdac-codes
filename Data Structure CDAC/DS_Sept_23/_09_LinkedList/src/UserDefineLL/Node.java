package UserDefineLL;

public class Node {
	private Emp data;
	private Node next;
    public Node()
    {
    	data=null;
    	next=null;
    }
    public Node(Emp da)
    {
    	data=da;
    	next=null;
    }
	public Emp getData() {
		return data;
	}
	public void setData(Emp data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
    public String toString()
    {
    	return data+" ";
    }
	

}
