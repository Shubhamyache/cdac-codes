package Assigments;

public class PerfectNumber {
	public static boolean perfectNumber(int num) {
		int i=0,sum=0;
		for(i=1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(num==sum) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		boolean res = perfectNumber(12);
		if(res) {
			System.out.println("The number is perfect number.");
		}
		else {
			System.out.println("The number is not perfect number.");
		}
		

	}

}
