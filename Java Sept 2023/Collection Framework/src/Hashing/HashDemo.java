package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashDemo {

	public static void main(String[] args) {
		Set<Student> stud = new HashSet<Student>();
		
		Student s1 = new Student(1,"Shubham","Latur",92.08f);
		Student s2 = new Student(2,"rohit","Latur",72.07f);
		Student s3 = new Student(3,"prat","pune",62.08f);
		Student s4 = new Student(4,"shifa","nashik",82.08f);
		
		
		Student s5 = new Student(5,"mansi","pune",72.08f);
		Student s6 = new Student(6,"bhushan","harangul",52.08f);
		Student s7 = new Student(7,"akash","nashik",81.08f);

		
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		stud.add(s5);
		stud.add(s6);
		stud.add(s7);
		
		for(Student s: stud)
			System.out.println(s);

		
		



		
		
		

	}

}
