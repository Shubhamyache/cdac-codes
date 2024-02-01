package Mail;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class DemoMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Mail> setmail = new TreeSet<>();
		
		Mail m1 = new Mail(1234,"shubham","message","May i help you!",LocalDateTime.parse("2023-12-31T06:40:00"));
		Mail m2 = new Mail(1235,"shifa","news","India won world cup!",LocalDateTime.parse("2023-10-31T07:30:00"));
		Mail m3 = new Mail(1236,"akshay","exam schedule","11 nov",LocalDateTime.parse("2023-08-11T02:45:00"));
		Mail m4 = new Mail(1237,"rahul","address","Karve nagar",LocalDateTime.parse("2023-11-16T03:50:00"));
		Mail m5 = new Mail(1238,"bhushan","marks","34 out of 40",LocalDateTime.parse("2023-09-18T04:42:00"));
		
		setmail.add(m1);
		setmail.add(m2);

		setmail.add(m3);
		setmail.add(m4);
		setmail.add(m5);

		
		
		setmail.forEach((Mail m)->{System.out.println(m);});


	}

}
