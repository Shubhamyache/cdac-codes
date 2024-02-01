package PracticeJava;

public class String_reg_exp {

	public static void main(String[] args) {
		
		String strvar = "abc%^$ t&";
		
		String speical_charString = strvar.replaceAll("[a-zA-Z ]", "");
		int special_len = speical_charString.length();
		System.out.println(strvar);
		System.out.println("Special chars are : "+special_len);
	}

}
