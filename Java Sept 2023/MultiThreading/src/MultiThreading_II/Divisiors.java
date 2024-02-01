package MultiThreading_II;

public class Divisiors {
	
	public synchronized void divisior(int num) {
		System.out.println("Divisiors of "+num+" are: ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(" "+i+", ");
			}
		}
		
	}

}
