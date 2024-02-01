package Interfaces;

public class ComparerDemo {

	public static void main(String[] args) {
		Student []s=new Student[2];
		s[0]=new Student(10,"Pratiksha",60.6f);
		s[1]=new Student(25,"Dhana",70.4f);
		/*Comparer c= new RollComparer();
		for(int i=0;i<s.length-1;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
				if(c.Compare(s[i], s[j])>0)
				{
					Student temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			for(int k=0;k<s.length;k++)
			{
			System.out.println(s[k]);
			}
		}*/
		/*Comparer c1= new NameComparer();
		for(int i=0;i<s.length-1;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
				if(c1.Compare(s[i], s[j])>0)
				{
					Student temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);
		}*/
		Comparer c2= new MeritComparer();
		for(int i=0;i<s.length-1;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
				if(c2.Compare(s[i], s[j])>0)
				{
					Student temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i]);
		}

	}

}
