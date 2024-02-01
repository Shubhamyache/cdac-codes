public class Calculator{
	private int no1, no2;
	
	public Calculator(){}
	public Calculator(int x, int y)
	{
		no1 = x;
		no2 = y;
	}
	
	public int Addition(){
		
		return no1+no2;
	}
	
	public int Substraction(){
		
		return no1-no2;
	}
	
	public int Multiplication(){
		
		return no1*no2;
	}
	
	public float Division(){
		
		return no1/no2;
	}
}