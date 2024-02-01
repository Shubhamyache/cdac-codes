public class Account
{
	private int accNO;
	private double balance;
	private static float int_rate;
	
	public static void updateIntRate(float i){
		int_rate = i;
		
	}
	
	public Account(){
		accNO = 1;
		balance = 100;
	}
	public Account(int a, double b){
		accNO = a;
		balance = b;
	}
	public void display(){
		System.out.println("accNO:"+accNO);
		System.out.println("balance:"+balance);
		System.out.println("Balance with interest:"+(balance+(balance*int_rate)/100));

	}
	static{
		int_rate = 4.5f;
	}
}