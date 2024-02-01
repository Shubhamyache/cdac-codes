package PracticeJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class missing_positiveNumber {
	public static int findMinPositive(int nums[]) {
		Set<Integer> set = new HashSet<>();
		for(Integer element: nums) {
			set.add(element);
		}
	    boolean flag=false;
		for(int i=0;i<nums.length;i++) {
			
		}
		return 1;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-8,2,34,1,3,9};
		int result = findMinPositive(nums);
		System.out.println(result+ "  ");

	}

}
