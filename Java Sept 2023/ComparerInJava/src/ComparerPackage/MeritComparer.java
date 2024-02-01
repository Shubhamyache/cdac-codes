package ComparerPackage;

public class MeritComparer extends Student implements Comparer{

	
	@Override
	public int comparer(Object o1, Object o2) {
		Student s1 = null;
		Student s2 = null;
		if(o1 instanceof Student) {
			s1 = (Student)o1;
			
		}
		if(o2 instanceof Student) {
			s2 = (Student)o2;
		}
		// TODO Auto-generated method stub
		return s1.getRollno()-s2.getRollno();
	}

}
