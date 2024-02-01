package Interfaces;

public class NameComparer extends Student implements Comparer {

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
		
		return s1.getName().compareToIgnoreCase(s2.getName());
	}

}
