package Interfaces;

public class StringMain {

	public static void main(String[] args) {
	String s1="Pratiksha";
	String s2= "Kakade";
	cString	s=new cString();
	s.reverse(s1);
	s.toUpperCase(s1);
	System.out.println("\n"+s.length(s1));
	System.out.println(s.isPallindrome(s1));
	System.out.println(s.append(s1,s2));
	

	}

}
