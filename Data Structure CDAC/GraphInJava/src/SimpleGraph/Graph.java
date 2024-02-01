package SimpleGraph;

import java.util.Scanner;


public class Graph {
	int ver;
	int arr[][];
	
	public Graph(int ver) 
	{
		this.ver = ver;
		arr = new int[ver][ver];
	}
	Scanner scanner = new Scanner(System.in);
	
	public void acceptGraph() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) 
			{
				System.out.println("Enter adjacency for "+i+"th and "+j+": ");
				arr[i][j] = scanner.nextInt();				
			}
		}
	}
	
	public void addEdge(int row, int column) {
		arr[row][column] = 1;
		arr[column][row]=1;
		
	}
	
	public void outDegree() {
		int count = 0;
		for(int i=0;i<ver;i++) {
			count =0;
			for(int j=0;j<ver;j++ ) {
				if(arr[i][j]==1) {
					count++;
				}
				System.out.println("outDegree of ["+i+", "+j+"]: "+count);
			}
		}
			
	}
	
	public void inDegree() {
		int count = 0;
		for(int i=0;i<ver;i++) {
			count =0;
			for(int j=0;j<ver;j++ ) {
				if(arr[j][i]==1) {
					count++;
				}
				System.out.println("InDegree of ["+i+", "+j+"]: "+count);
			}
		}
				
	}
	
	public void depthFS(int start) {
		boolean v[] = new boolean[ver];
		v[start]=true;
		System.out.println(start);
		travDFS(start, v);
		
	}
	
	public void travDFS(int start, boolean v[]) {
		for(int j=0;j<ver;j++) 
		{
			if(arr[start][j]==1 && v[j]==false) {
				v[j]=true;
				System.out.println(j);
				travDFS(j, v);
			}
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++ ) {
				System.out.print(arr[i][j]+" ");
				
			}
		}
	}

}
