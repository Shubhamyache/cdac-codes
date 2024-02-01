package ComparerPackage;

public class NameComparer extends Student implements Comparer {

	public NameComparer() {
		// TODO Auto-generated constructor stub
	}

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
		return s1.getName().compareTo(s2.getName());
	}

}
