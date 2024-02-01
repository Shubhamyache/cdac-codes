package CustomerQueue;

public class Customer {
	private int cid;
	private String name;
	public Customer(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + "]";
	}
	

}
