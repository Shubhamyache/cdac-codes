package TreeSet_Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FiveStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<String> stringset = new TreeSet<>((String s1, String s2)->{return (s1.length()-s2.length());});
		//implementing comparator interface here using lambda function ()->{}
		System.out.println("Enter String as input: ");
		for(int i=0;i<5;i++) {
			System.out.println(i+" String");
			String str = sc.next();
			stringset.add(str);
			
		}
		for(String s:stringset)
			System.out.println(s);

	}

}
