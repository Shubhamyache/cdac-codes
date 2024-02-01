public class MyNumMain
{
	public static void main(String[] args){
	
		MyNum m1 = new MyNum(10);
		
		
		System.out.println("Is Negative number: "+(m1.isNeg()));
		System.out.println("Is positive number: "+(m1.isPos()));
		System.out.println("Is zero number: "+(m1.isZero()));
		System.out.println("Is odd number: "+(m1.isOdd()));
		System.out.println("Is even number: "+(m1.isEven()));		
	}
}