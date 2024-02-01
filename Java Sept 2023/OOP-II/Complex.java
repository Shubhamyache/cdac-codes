public class Complex{
	private int real;
	private int imag;
	
	public Complex(){}
	public Complex(int r, int i)
	{
		real = r;
		imag = i;
	}
	public void display()
	{
		if(imag<0){
			System.out.println(real+""+imag+"i");
		}
		else{
				System.out.println(real+"+"+imag+"i");		
		}
	}
}