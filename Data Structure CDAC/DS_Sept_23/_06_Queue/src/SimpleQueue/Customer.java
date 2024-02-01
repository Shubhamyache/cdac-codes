package SimpleQueue;

public class Customer {
	private int cid;
	private String cname;
	@Override
	public String toString() {
		return "[" + cid + " "+ cname + "] ";
	}
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Customer() {
		super();
	}
	

}
