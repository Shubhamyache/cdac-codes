package ExceptionHand;


public class StringIO {
	public static void main(String[] args) {
		String str = "ShuBNNNKJham";
		String strLine = "Hi im engineer";
		String nullStr= null;
		for(int i=0;i<str.length();i++){
			char res = str.charAt(i);
			if(res >= 'A' && res <='Z'){
				System.out.println("Capitals: "+res);
			}
			if(res >= 'a' && res <= 'z'){
			System.out.println("small: "+res);
		}

		}

		
		
	}

}
