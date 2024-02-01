package CircularLinkList;

public class CircularLLDemo {

	public static void main(String[] args) {
		CircularLL cLl = new CircularLL();
		cLl.addNodeEnd(10);
		cLl.addNodeEnd(20);
		cLl.addNodeEnd(30);
		cLl.addNodeEnd(40);
		cLl.addNodeEnd(50);
		cLl.addNodeEnd(60);
		cLl.addNodeBeg(90);
		cLl.addNodeMid(5, 300);
		System.out.println("Size of LL: "+cLl.size());
		cLl.display();

	}

}
