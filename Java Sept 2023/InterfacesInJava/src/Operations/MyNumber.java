package Operations;

public class MyNumber implements IntOperations {

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		if(num%2!=0) {
		return true;
		}
		else
			return false;
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		if(num%2==0) {
			return true;
			}
		else
			return false;
		
	}

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public int callFactorial(int num) {
		int fact=1;
		// TODO Auto-generated method stub
		for(int i=1;i<=num;i++) {
			fact = fact*i;
			
		}
		
		return fact;
	}

}
