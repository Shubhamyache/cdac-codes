package threadcomm;

public class ProducerConsumerDemo {
	public static void main(String[] args) {
		//common shared resource
		Stock s = new Stock();
		
		//multiple threads
		//newly created state
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		//runnable 
		p.getT().start();
		c.getT().start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		p.stopNow();
		c.stopNow();
		
		try {
			p.getT().join();
			c.getT().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total qty produced : "+s.getQtyProduced());
		System.out.println("Total qty cosumed : "+s.qtyConsumed);
		
		
		
	}

}
