package DoublyLinkedList;

public class DoublyLLDemo {

	public static void main(String[] args) {
		DoublyLL d1 = new DoublyLL();
		d1.addNodeEnd(10);
		d1.addNodeEnd(20);
		d1.addNodeEnd(30);
		d1.addNodeEnd(40);
		d1.addNodeEnd(50);
		d1.display();
		
		d1.printReverse();
//		d1.modify_data(30);
//		System.out.println("Modify based on data: ");
//		d1.display();
//		
//		d1.modify_pos(3,8899);
//		System.out.println("Modify based on position: ");
//		d1.display();
	}

}
