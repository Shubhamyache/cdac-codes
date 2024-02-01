package StringLL;

public class StringLLDemo {

	public static void main(String[] args) {
		StringLL ll = new StringLL();
		
		ll.addNodeBeg("rohit");		
		ll.addNodeEnd("Pratiksha");
		ll.addNodeEnd("shubham");
		ll.addNodeEnd("Bhushan");
		ll.addNodeEnd("krishana");
		ll.addNodeEnd("Mahesh");
		ll.addNodeEnd("Aniket");
		ll.addNodeEnd("srinath");
		ll.addNodeEnd("Mansi");
		ll.addNodeEnd("yache");
		ll.addNodeEnd("sana");
		ll.addNodeEnd("vishaka");
		ll.addNodeEnd("Ajay");
//		ll.display();
//		ll.insertAt(4, "Sangitaa");
//		ll.modifyAccToPos(3,"AAADDDDDFFFFF");
//		ll.delete("Pratiksha");
//		ll.display();
//		System.out.println("Reverse list: " );
//		ll.reverse(ll.headNode);
		System.out.println("Mid node is: "+ll.findMid());
	}

}
