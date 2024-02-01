package FileIOPackage;

import java.io.Serializable;

public class Emp implements Serializable {
	String name;
	int eid;
	
	public Emp() {}
	public Emp(String n, int id) {
		this.name = n;
		this.eid = id;
	}
	@Override
	public String toString() {
		return "Name= " + name + ", eid= " + eid;
	}
	

}
