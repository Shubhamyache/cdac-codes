package _03_Stack;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Cstack charStack = new Cstack(10);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String for reversal: ");
		
		String nameString = scanner.next();
		for(int i=0;i<nameString.length();i++) {
			charStack.push(nameString.charAt(i));
		}
		charStack.display();
		
	}

}
