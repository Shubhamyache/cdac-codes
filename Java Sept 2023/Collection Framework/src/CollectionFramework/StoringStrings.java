package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class StoringStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> strings = new ArrayList<>();
		strings.add("Shubham");
		strings.add("yache");
		strings.add("ajay");
		strings.add("shifa");
		strings.add("kunal");
		strings.add("bhushan");
		
		for(String obj: strings) {
			System.out.println(obj);
			
		}
		
		System.out.println("Enter index for deletion: ");
		int ch = sc.nextInt();
		strings.remove(ch);
		
		for(String obj: strings) {
			System.out.println(obj);
			
		}
		System.out.println("Size: "+strings.size());
		
		//using Iterator
		System.out.println("Using Iterator: ");
		Iterator<String> i = strings.iterator();
		
		while(i.hasNext()) {
			System.out.println((String)i.next());		
		}
		
		//List Iterator
		System.out.println("Using List Iterator");
		ListIterator<String> li = strings.listIterator();
		while(li.hasNext()) {
			li.next();
		}
		System.out.println("List in Reverse order: ");
		while(li.hasPrevious()) {
			System.out.println((String)li.previous());
		}
		
		//Using for each method
		System.out.println("Using foreach method: ");
		
		strings.forEach((String s) -> {System.out.print(" : "); System.out.println(s); });
		
		//sorting
		System.out.println("Sorted String data is: ");
		
		Collections.sort(strings);  //
		for(String s: strings) {
			System.out.println(s);
		}
		
		System.out.println("Enter String to check: ");
		String name = sc.next();
		if(strings.contains(name))
		{
			System.out.println(name+" is present at index "+strings.indexOf(name));
		}
	}

}
