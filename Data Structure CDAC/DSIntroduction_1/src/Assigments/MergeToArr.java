package Assigments;

public class MergeToArr {
	public static void mergeArray(int a[],int b[]) {
		int cArraysize = a.length + b.length;
		int c[] = new int[cArraysize];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0, j = a.length;j<cArraysize;i++,j++) {
			
			c[j] = b[i];
		}
		for(int i = 0;i<cArraysize;i++) {
			System.out.print(" "+c[i]);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int b[]= {11,22,33,44,55};
		mergeArray(a, b);

	}

}
