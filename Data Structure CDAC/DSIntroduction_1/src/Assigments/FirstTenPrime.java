package Assigments;

public class FirstTenPrime {
	public static void TenPrime() {
		int count =0;
		int num=2;
		boolean flag = true;
		while(count < 10) 
		{
			
				flag = true;
				for(int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						flag = false;
						break;
					}
				
					
				}
				if(flag) 
				{
					count++;
					System.out.print(" "+num);
				}
				
			
			num++;
			
		}
		
	}

	public static void main(String[] args) {
		TenPrime();
		
	}

}
