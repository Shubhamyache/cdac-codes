public class Person
{
	String name;
	Date bdate;
	
	public Person(){
		this.name="NA";
		bdate = new Date(1,1,1970);
	}
	public Person(String name, int dd,int mm, int yy){
		this.name = name;
		bdate = new Date(dd,dd,yy);
	}
	
	public void display(){
		System.out.println("Name: "+name);
		bdate.showDate();

	}
}