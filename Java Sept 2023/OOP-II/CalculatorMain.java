public class CalculatorMain
{
	public static void main(String[] args){
		float res;
		Calculator c1 = new Calculator(10,20);
		res = c1.Addition();
		System.out.println("The Addition is: "+res);
		res = c1.Substraction();
		System.out.println("The Substraction is: "+res);
		res = c1.Multiplication();
		System.out.println("The Multiplication is: "+res);
		res = c1.Division();
		System.out.println("The Division is: "+res);
	}
}