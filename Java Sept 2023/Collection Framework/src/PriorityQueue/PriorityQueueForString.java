package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> words = new PriorityQueue<>((String s1,String s2) -> {return s1.length()-s2.length();});
		words.add("Shubham");
		words.add("Shifa");
		words.add("rohit"); 
		words.add("ram");
		words.add("laxman");
		words.add("a");
		words.add("bb");
		words.add("Pratiksha");
		
		while(words.size()>0) {
			System.out.println(words.poll());
		}

	}

}
