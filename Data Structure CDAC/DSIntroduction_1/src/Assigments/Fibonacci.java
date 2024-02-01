package Assigments;


public class Fibonacci {
	public static void fibonacci(int num) {
		int a =0,b=1,c=a+b;
		System.out.println("Fibonacci series: ");
		for(int i=0;i<num;i++) {
			
			System.out.print(a+", ");
			c=a+b;
			a =b;
			b=c;
		}
		System.out.print("\b");
		
	}

	public static void main(String[] args) {
		fibonacci(8);
		
		

	}

}
