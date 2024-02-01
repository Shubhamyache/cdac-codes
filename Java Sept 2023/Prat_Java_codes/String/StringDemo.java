package String;

public class StringDemo {

	public static void main(String[] args) {
		String s="z";
		/*for(int i=0;i<s.length();i++)
		{
		System.out.println(s.charAt(i));
		}
		for(int i=0;i<s.length();i++)
		{

		System.out.println((int) s.charAt(i));
		}*/

		/*for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				System.out.println((char)(s.charAt(i)+32));
			}
			if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				System.out.println((char)(s.charAt(i)-32));
			}
		}*/
		System.out.println("isVowel= "+isVowel(s));
		
		}
		public static int isVowel(String s)
		{
			String c="aeiouAEIOU";
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				for(int j=0; j<c.length();j++)
				{
					if(s.charAt(i)==c.charAt(j))
					{
						count++;
					}
				}
			}
			return count;
		}
	}

	
