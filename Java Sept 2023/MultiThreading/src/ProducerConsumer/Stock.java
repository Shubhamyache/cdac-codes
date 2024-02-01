package ProducerConsumer;

public class Stock {
	int qtyProduced;
	int qtyConsumed;
	boolean bProduced;
	
	public Stock() {
		qtyProduced = qtyConsumed=0;
		bProduced = false;
	}
	
	public synchronized void produce() {
		if(bProduced) 
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qtyProduced++;
		System.out.println("Produced : "+qtyProduced);
		bProduced = true;
		notify();
		
	}
	public synchronized void consume() {
		if(!bProduced) 
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qtyConsumed++;
		System.out.println("Consumer : "+qtyConsumed);
		bProduced = false;
		notify();
		
	}

	public int getQtyProduced() {
		return qtyProduced;
	}
	

}
