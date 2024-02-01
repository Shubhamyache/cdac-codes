package UserDefineLL;

public class Emp {
	private int eid;
	private String name;
	public Emp()
	{
		eid=1;
		name="Seeta";
	}
	public Emp(int id,String nm)
	{
		eid=id;
		name=nm;
	}
	public String toString()
	{
		return "[ "+eid+" "+name+" ]";
	}

}
