package _02_Array;

import java.util.Scanner;

public class DemoSparse {
	public static void main(String[] args) {
		int row,col,nonzero=0,i,j,k;
		int org[][],sp[][];
		//--------- Accept row and col size --------
		System.out.println(" Enter Row size And Col Size ");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		//-------- allocate meme for org array------- 
		org=new int[row][col];
		//--------accept org array ----------
		for( i=0;i<row;i++)
		{
			System.out.println(" enter " +col +" elements ");
			for(j=0;j<col;j++)
			{
				org[i][j]=sc.nextInt();
			}
		}
		//---------- Count Non zero Elements ----------
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				if(org[i][j]!=0)
					nonzero++;
		}
		//----------- Allocate Mem for sparse--------
		sp=new int[nonzero+1][3];
		//--------------- Create sparse ---------
		k=1;
		sp[0][0]=row;
		sp[0][1]=col;
		sp[0][2]=nonzero;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++) {
				if(org[i][j]!=0)
				{
					sp[k][0]=i;
					sp[k][1]=j;
					sp[k][2]=org[i][j];
					k++;
					
				}
			}
		}
		//---------- Display------------
				System.out.println("-------- Array Is ---------");
				System.out.println();
				for(i=0;i<nonzero+1;i++)
				{
					System.out.println();
					for(j=0;j<3;j++)
						System.out.print("\t"+sp[i][j]);
				}
				System.out.println();
			
		}
	
}
