package Assigments;

public class Palindrome {
	public static boolean palindrome(int num) {
		int mod;
		int sum=0;
		int temp = num;
		while(num != 0) {
			mod = num%10;
			num = num/10;
			sum = sum*10 + mod;
			
			
		}
		if(sum==temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean res;
		
		res = palindrome(818);
		if(res) {
			System.out.println(" This num is an palindrome :)");
			
		}
		else
		{
			System.out.println("!! This is not an palindrome :(");
		}
		// TODO Auto-generated method stub

	}

}
