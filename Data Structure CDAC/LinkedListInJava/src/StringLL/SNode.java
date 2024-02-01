package StringLL;

public class SNode {
	String name;
	SNode next;
	public SNode(String name) {
		super();
		this.name = name;
		next = null;
		
	}
	public SNode() {
		super();
		next = null;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SNode getNext() {
		return next;
	}
	public void setNext(SNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "SNode [name=" + name + "]";
	}
	
	
	
	

}
