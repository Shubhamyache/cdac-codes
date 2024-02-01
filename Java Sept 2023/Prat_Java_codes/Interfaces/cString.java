package Interfaces;

public class cString implements StringOperation {

	@Override
	public String reverse(String str) {
		String newstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			newstr=newstr+ch;
			
		}
		return newstr;

	}

	@Override
	public void toUpperCase(String str) {
		for(int i=0; i<str.length();i++)
		{
		if((str.charAt(i))>='a' && str.charAt(i)<='z')
		{
			System.out.print((char)(str.charAt(i)-32));
		}
		else if((str.charAt(i))>='A' && str.charAt(i)<='Z')
			
			System.out.print((char)(str.charAt(i)));
			
		}
		

	}

	@Override
	public int length(String str) {
		
		return str.length();
	}

	@Override
	public boolean isPallindrome(String str) {
		String s=new String();
		 s= reverse(str);
		if(str.equalsIgnoreCase(s))
		{
			return true;
		}
		return false;
	}

	@Override
	public String append(String s1, String s2) {
		
		return s1+" "+s2;
	}

}
