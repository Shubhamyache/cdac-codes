package BOOKLINKLIST;

public class BookLinkList {
	BNode head;

	public BookLinkList() {
		super();
		head = null;
	}
	public void addNode(Book data) {
		BNode move;
		BNode newnode = new BNode(data);
		
		if(head==null) {
			head=newnode;
		}
		else {
			move = head;
			while(move.next!=null) {
				move = move.next;
			}
			move.next = newnode;
		}
	}
	public void display() {
		BNode moveBNode = head;
		while(moveBNode!=null) {
			System.out.println(moveBNode.book);
			moveBNode = moveBNode.next;
		}
	}
	
	
}
