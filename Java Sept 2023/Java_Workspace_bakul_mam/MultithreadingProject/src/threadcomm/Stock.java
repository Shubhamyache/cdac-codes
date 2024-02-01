package threadcomm;

public class Stock {
	private int qtyProduced;
	int qtyConsumed;
	boolean bProduced;  //true-consumer, false-producer 
	
	public Stock()
	{
		qtyProduced = qtyConsumed = 0;
		bProduced = false;
	}
	
	//stock instance can acquire the lock - monitor
	public synchronized void produce()
	{
		//some qty is already present
		if(bProduced)
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//this part gets executed only when bProduced is false
		qtyProduced++;
		System.out.println("Produced : "+qtyProduced);
		bProduced = true;
		notify();
		
	}
	
	public synchronized void consume()
	{
		//no qty is available to consume
		if(!bProduced)
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//this part gets executed only when bProduced is true
		qtyConsumed++;
		System.out.println("Consumed : "+qtyConsumed);
		bProduced=false;
		notify();
	}

	public int getQtyProduced() {
		return qtyProduced;
	}

	/*public boolean isbProduced() {
		return bProduced;
	}*/
	
	
	
	

}
