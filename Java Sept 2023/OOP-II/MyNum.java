public class MyNum{
	private int number;
	
	public MyNum(){}
	public MyNum(int num)
	{
		number = num;
	}
	boolean isNeg(){
		if(number<0){
			return true;
		}
		else
			return false;
	}
	boolean isPos(){
		if(number>0){
			return true;
		}
		else
			return false;
	}
	boolean isZero(){
		if(number==0){
			return true;
		}
		else
			return false;
	}
	boolean isOdd(){
		if(number%2==1){
			return true;
		}
		else
			return false;
	}
	boolean isEven(){
		if(number%2==0){
			return true;
		}
		else
			return false;
	}
	
}