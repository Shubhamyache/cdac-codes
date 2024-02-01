package _03_Stack;

public class TenPrime {
	public static boolean isPrime(int no) {
		boolean flag = true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		IntStack iStack = new IntStack(10);
		
		int count=0;
		int num=2;
		
		while(count<10) {
			
				if(isPrime(num))
				{
					iStack.push(num);
					count++;				
					
				}
				
			
			num++;	
			
		}
		iStack.display();
		
	}
}

