package Assigments;

public class PrimeUpto100 {
	
	public static void printPrime() {
		int num=100;
		boolean flag = true;
		for(int i=1;i<num;i++) 
		{
			flag = true;
				if(i==1) 
				{
					System.out.println("1 is neither prime not composite..");
					continue;
				}
				
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0) 
				{
					flag = false;
				}
			
			}
		if(flag) {
			System.out.println(i);
		}
		
		}
		
	}

	public static void main(String[] args) {
		System.out.println("The prime numbers are: ");
		
		
		printPrime();
		
	}

}
