package ProducerConsumer;

public class Consumer implements Runnable {
	private Thread t;
	private Stock s;
	private boolean bRun;
	
	public Consumer(Stock s) {
		t = new Thread(this);	
		this.s = s;
		bRun=true;
	}
	
	public Thread getT() {
		return t;
	}
	

	@Override
	public void run() {
		while(bRun) {
			s.consume();
		}
	}
	
	public void stopNow() {
		bRun = false;
	}

}
