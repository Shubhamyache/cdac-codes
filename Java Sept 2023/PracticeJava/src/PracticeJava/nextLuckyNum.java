package PracticeJava;

public class nextLuckyNum {
	public static int nextLuckyNumber(int num,int digit,int occurance) {
		while(true) 
		{
			
			int mod ;
			int count=0;
			int temp=num;
			
			while(temp>0)
			{
				mod = temp%10;
				if(mod==digit) 
					count++;
				
				
				temp = temp/10;
				
			}
			if(count==occurance)
				return num;
			
			num++;
		}
		
	}

	public static void main(String[] args) {
		
		int res = nextLuckyNumber(27,3,3);
		System.out.println(res);
		// TODO Auto-generated method stub

	}

}
