package office.staff;
import office.utility.Date;
public class Person{
	private String name;
	private Date bdate;
	
	public Person(){
		name = "NA";
		bdate = new Date(1,1,1970);
	}
	public Person(String name, int d, int m, int y){
		this.name = name;
		bdate = new Date(d,m,y);
	}
	
	public void display(){
			System.out.println("Name: "+name);
			bdate.display();

	}
}