package MultiThreading_II;

public class PrintingTask implements Runnable {

	
	private Thread t;
	private Printer p;
	private String header,body,footer;
	
	
	public PrintingTask(Printer p, String header, String body, String footer) {
		super();
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
		this.t = new Thread(this);
	}

	
	public Thread getT()
	{
		return t;
	}

	
	public void run() {
		p.print(header, body, footer);
	}

}

