package PriorityQueue;

public class Element {
	int data;
	int priority;
	public Element(int data, int priority)
	{
		super();
		this.data = data;
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Element [data=" + data + ", priority=" + priority + "]";
	}
	

}
