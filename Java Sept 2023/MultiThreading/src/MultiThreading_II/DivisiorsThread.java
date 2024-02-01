package MultiThreading_II;

import java.io.FileWriter;
import java.io.IOException;

public class DivisiorsThread implements Runnable{
	private Thread t;
	private int num;
	private FileWriter fw;
	
	public DivisiorsThread(int num,FileWriter fw)
	{
		this.num = num;
		this.fw = fw;
		t = new Thread(this);
	}
	public Thread getT() {
		return t;
	}

	@Override
	public void run()
	{
		synchronized (fw)
		{
			
		
		try
		{                                              
			fw.write("The divisiors of "+num+" are: ");
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
				fw.write(" "+i+", ");
				}
			}
			fw.write("\n");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		}
	}
	
}
