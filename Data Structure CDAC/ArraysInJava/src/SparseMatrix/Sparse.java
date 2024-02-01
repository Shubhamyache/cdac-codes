package SparseMatrix;

public class Sparse {
	public static int countNonZero(int[][] original) {
		int count=0;
		for(int i=0;i<original.length;i++) {
			for(int j=0;j<original.length;j++)
			if(original[i][j]!=0) {
				count++;
			}
			
		}
		return count;
		
	}

	public static void main(String[] args)
	{
		int original[][] = {{0,0,7,0,0,0,0},
							{0,0,0,0,0,0,9},
							{0,0,0,0,0,0,0},
							{0,0,0,0,4,0,0},
							{0,0,3,0,0,0,0},
							{2,0,0,0,0,0,0},
							{0,0,0,0,7,0,0}};
		int non_zero = countNonZero(original);
		int[][] sparse = new int[non_zero+1][3];
		int row = 7;
		int col = 7;
		sparse[0][0]=7;
		sparse[0][1]=7;
		sparse[0][2]=non_zero;
		int k=1;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(original[i][j] != 0) {
					sparse[k][0]=i;
					sparse[k][1]=j;
					sparse[k][2]=original[i][j];
					k++;
				}
			}
		}
		for(int i=0;i<non_zero+1;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print(sparse[i][j]+"\t");
			}
		}
		
		
		
				
		}
		
}

