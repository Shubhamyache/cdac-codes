package ExceptionHandling;

public class CommandLine {
	public static void main(String[] args) {
		try
		{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("DIvision: "+num1+"/"+num2+"="+(num1/num2));
		}
		
		catch(ArithmeticException e) {
			System.out.println("Don't divide by zero..");
		}
		catch(Exception e) {
			System.out.println("Don't enter string invalid argument");;
		}
		
		
		
	}
		
}
