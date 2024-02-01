package ComparerPackage;

public class ComparerMain {

	public static void main(String[] args) {
		Student [] arr = new Student[3];
		arr[0]=new Student(3,"Shubham",92);
		arr[1]=new Student(2,"Bhushan",90);
		arr[2]=new Student(1,"Pratiksha",85);
		
		Comparer c = new NameComparer();
		Comparer c1 = new MeritComparer();
		Comparer c2 = new RollComparer();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(c1.comparer(arr[i], arr[j])>0){
				Student temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
