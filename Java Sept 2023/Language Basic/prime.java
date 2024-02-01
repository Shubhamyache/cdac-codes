public class prime{
	public static void main(String[] args){
		int num = 70;
		int flag =0;
		if(num==1){
			System.out.println("1 is neither prime nor composite");
		}
		else{
			for(int i = 2;i<num;i++){
				if(num%i==0){
					flag = 1;	
				}
			}
		}
		if(flag==1){
			System.out.println("NOt prime.");
		}
		else{
			System.out.println("The number is prime.");
		}
	}
}