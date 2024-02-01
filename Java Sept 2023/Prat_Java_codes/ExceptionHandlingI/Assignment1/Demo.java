package ExceptionHandlingI.Assignment1;

import java.util.InputMismatchException;

public class Demo {

	public static void main(String[] args) {
		try {
		int n1= Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		System.out.println(n1/n2);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Input invalid");
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}

}
