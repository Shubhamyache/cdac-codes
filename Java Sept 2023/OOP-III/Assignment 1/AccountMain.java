public class AccountMain{
	public static void main(String[] args){
		Account a1 = new Account();
		a1.display();
		
		Account a2 = new Account(1234, 100000);
		a2.updateIntRate(8.5f);
		a2.display();
	}
}