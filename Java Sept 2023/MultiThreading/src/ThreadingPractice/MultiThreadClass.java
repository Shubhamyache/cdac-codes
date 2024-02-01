package ThreadingPractice;

public class MultiThreadClass implements Runnable{
	private int threadNum;
	public MultiThreadClass(int threadNum) {
		this.threadNum = threadNum;
		
	}

	@Override
	public void run()
	{
		for(int i=1;i<=3;i++)
			System.out.println(i + " of Thread "+threadNum);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
