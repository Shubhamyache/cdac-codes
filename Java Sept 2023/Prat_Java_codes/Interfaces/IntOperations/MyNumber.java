package Interfaces.IntOperations;

public class MyNumber implements IntOperations {
	private int num;
	

	public MyNumber() {
		super();
	}

	public MyNumber(int num) {
		super();
		this.num = num;
	}

	@Override
	public boolean isOdd(int num) {
		if(num%2==0)
		{
			return true;
		}
			
	
		return false;
	}

	@Override
	public boolean isEven(int num) {
		if(num%2!=0)
		{return true;}
		return false;
	}

	@Override
	public boolean isPrime(int num) {
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		
		return true;
	}

	@Override
	public double calFactorial(int num) {
		double f=1;
		for(int i=1;i<=num;i++)
		{
			f*=i;
		}
		return f;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "isEven= "+isEven(num)+"\nisOdd= "+isOdd(num)+"\nisPrime= "+isPrime(num)+"\nFactorial= "+calFactorial(num);
	}
	

}
