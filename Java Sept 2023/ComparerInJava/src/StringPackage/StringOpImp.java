package StringPackage;

public class StringOpImp implements StringOperations{

	@Override
	
	public String reverse(String str) {
		char ch;
		String rStr="";
		
		for(int i=(str.length()-1);i>=0;i--) {
			ch = str.charAt(i);
			rStr = rStr+ch;
			
			
		}
		return rStr;
	}

	@Override
	public String toUpperCase(String str) {
		String new_string="";
		for(int i=0;i<(str.length());i++) {
			char ch = str.charAt(i);
			if(ch>='a'&&ch<='z') {
				ch = (char)(str.charAt(i)-32);
				new_string = new_string+ch;	
			}
			
		}
		
		return new_string;
	}

	@Override
	public int length(String str) {
		
		return str.length();
	}

	@Override
	public boolean isPallindrome(String str) {
		String rString = "";
		char ch;
		for(int i = 0;i<str.length();i++) {
			ch = str.charAt(i);
			rString = ch + rString;
		}
		if(rString==str) {
			return true;
		}
		
		return false;
	}

	@Override
	public String append(String str1, String str2) {
		
		return str1+str2;
	}

}
