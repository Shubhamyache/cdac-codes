package Assigments;

public class BinaryNum {
	public static void binaryToDec(int num) {
		int mod;
		double decNum=0;
		int count=0;
		int temp = num;
		int temp2 = num;
		int mod2;
//		boolean flag = true;
//		while(temp2!=0) {
//			mod2 = temp2%10;
//			temp2 = temp2/10;
//			
//			if(mod2 != 0 || mod2 != 1) {
//				flag = false;
//				break;
//			}
//			
//			
//		}
//		if(flag) 
//		{
			while(num!=0) 
			{
				mod = num%10;
				num = num/10;
				
				
				
				if(mod==1)
				{
				decNum = decNum + mod*Math.pow(2, count);
				
				}
				count++;	
			}
			System.out.println("The decimal number of "+temp+" is "+decNum);
		}
//		else
//			System.out.println("The number is not binary.");
//				
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryToDec(1111);

	}

}
