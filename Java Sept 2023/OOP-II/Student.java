public class Student{
	private int id;
	private float percentage;
	public Student(){}
	public Student(int i,float p)
	{
		id = i;
		percentage = p;
	}
	
public void display()
{
	if(percentage >= 90){
		System.out.println("Excellent");
	}
	else if(percentage>=90&& percentage < 90){
				System.out.println("Very Good");
	}
	else if(70 <=percentage && percentage < 80){
				System.out.println("Good");
	}
	else if(60 <=percentage && percentage < 70){
				System.out.println("Average");
	}
	else if(40 <=percentage && percentage < 60){
				System.out.println("pass");
	}
	else if(percentage < 40){
				System.out.println("fail");

	}
	
}
}