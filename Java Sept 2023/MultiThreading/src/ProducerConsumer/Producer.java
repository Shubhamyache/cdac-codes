package ProducerConsumer;

public class Producer implements Runnable {
	private Thread t;
	private Stock s;
	private boolean bRun;
	
	public Producer(Stock s) {
		this.s = s;
		t = new Thread(this);
		bRun = true;
	}
	
	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		while(bRun) {
			s.produce();
		}
		
	}
	public void stopNow(){
		
		bRun = false;
		
	}

}
