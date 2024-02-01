package ComparerPackage;

import StringPackage.StringOpImp;

public class StringMain {

	public static void main(String[] args) {
		String str = "shubham";
		String res;
		StringOpImp s = new StringOpImp();
		res = s.toUpperCase(str);
		System.out.println(res);
		System.out.println(s.reverse(str));

		
		
		// TODO Auto-generated method stub

	}

}
