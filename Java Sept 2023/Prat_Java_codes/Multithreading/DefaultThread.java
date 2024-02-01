package Multithreading;

public class DefaultThread {

	public static void main(String[] args) {
		Thread t= new Thread();
		System.out.println("name = "+t.getName());
		System.out.println("Priority = "+t.getPriority());
		
	}

}
