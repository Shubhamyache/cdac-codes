package MultiThreading_II;

import java.io.FileWriter;
import java.io.IOException;

public class DivisiorsMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f = new FileWriter("C:\\Users\\HP\\Desktop\\Java Sept 2023\\MultiThreading\\src\\MultiThreading_II\\divisor.txt");
		DivisiorsThread dt1 = new DivisiorsThread(800, f);
		dt1.getT().start();	
		DivisiorsThread dt2 = new DivisiorsThread(600, f);
		dt2.getT().start();	
		DivisiorsThread dt3 = new DivisiorsThread(450, f);
		dt3.getT().start();
	
		try {
			dt1.getT().join();
			dt2.getT().join();
			dt3.getT().join();
			}
		
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("End of Divisors: ");
		f.close();

		

	}

}
