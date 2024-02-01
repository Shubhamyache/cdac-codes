package Interfaces;

public class MeritComparer extends Student implements Comparer {

	@Override
	public int Compare(Object o1, Object o2) {
		Student s1=null, s2=null;
		if(o1 instanceof Student)
		{
			s1=(Student)o1;
		}
		if(o2 instanceof Student)
		{
			s2=(Student)o2;
		}
		if(s1.getMerit()>s2.getMerit()) {
		return 1;}
		else if(s1.getMerit()<s2.getMerit()) 
		{
			return -1;}
		else
			return 0;
	}

}
