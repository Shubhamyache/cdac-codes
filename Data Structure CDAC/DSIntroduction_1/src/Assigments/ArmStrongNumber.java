package Assigments;

public class ArmStrongNumber {
	public static int digitCount(int no){
		int cnt=0;
		while(no!=0) 
		{
			no = no/10;
			cnt++;
		}
		return cnt;
	}

	public static int power(int base, int index) {
		int res=1;
		for(int i=1;i<= index;i++) {
			res = res*base;
		}
		return res;
	}
	public static void armStrongNumber(int term) {

		int num=1;

		int temp=term;


		int mod;
		while(num <term) {
			int sum=0;
			int numtemp = num;
			int newnum = num;

			int index = digitCount(num);
			while(newnum!=0){
				mod = newnum%10;
				newnum = newnum/10;
				sum = sum + power(mod,index);	

			}
			if(numtemp==sum) {
				System.out.println(num);
			}
			num++;
		}
	}
	public static void main(String[] args) {
		armStrongNumber(10000);



	}

}
