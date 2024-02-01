public class PrimeNew
{
	public static void main(String[] args){
		boolean flag = true;
		int count = 0;
		int num = 100;
		for(int i = 11; i<num;i++){
			flag = true;
			for(int j = 2;j<i;j++){ 
				if(i%j==0){
					flag = false;
				}	
			}
			if(flag==true){
				count++;
				
				System.out.println(i);
			}
			
		}
		System.out.println("The number of prime numbers are: "+count);
	}
}