package MapCollection;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Coccocola";
		Map<Character ,Integer> mapstr = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(mapstr.containsKey(ch)) {
				int n = mapstr.get(ch);
				mapstr.put(ch,++n);
			}
			else {
				mapstr.put(ch,1);
			}
		}
		
		//converting map to set
	
		//Set<Map.Entry<Character,Integer>> setMap = mapstr.entrySet();
		
		mapstr.forEach((Character ch, Integer i)->{System.out.println(ch+" : "+i);});

	}

}
