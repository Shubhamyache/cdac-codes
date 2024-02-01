package ThreadingPractice;

public class MultiThDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MultiThreadClass t1 = new MultiThreadClass(1);
		MultiThreadClass t2 = new MultiThreadClass(2);
		MultiThreadClass t3 = new MultiThreadClass(3);
		MultiThreadClass t4 = new MultiThreadClass(4);

		Thread mythread1 = new Thread(t1);
		Thread mythread2 = new Thread(t2);
		Thread mythread3 = new Thread(t3);
		Thread mythread4 = new Thread(t4);

		mythread1.start();	
		//mythread1.join();
		mythread2.start();
		//mythread2.join();
		mythread3.start();
		//mythread3.join();
		mythread4.start();
		//mythread4.join();
		


	}

}
