package Operations;

import java.util.Scanner;

public class MyNumMain {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a Positive Number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		IntOperations m = new MyNumber();
		System.out.println("The number "+num+" is even: "+m.isEven(num));
		System.out.println("The number "+num+" is odd: "+m.isOdd(num));
		System.out.println("The number "+num+" is prime: "+m.isPrime(num));
		System.out.println("The factorial of "+num+" is "+m.callFactorial(num));

		
		
	}

}
