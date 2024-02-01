package MultiThreading_II;

public class Printer {

	public synchronized void print(String header,String body,String footer)
	{
		
		try
		{
			System.out.print(header);
			Thread.sleep(500);
			System.out.print(body);
			Thread.sleep(500);
			System.out.print(footer);
			System.out.println();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
