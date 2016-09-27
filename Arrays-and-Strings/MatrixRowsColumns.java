// Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

// Steps:
// Create a matrix and enter the elements of a matrix
// Create 2 arrays rows[] and columns[]
// For every element '0' in an array, store boolean values for row and column numbers in the respective arrays.
// for every row and column stored in row[] and column[], set all its elements to 0

import java.util.*;

public class MatrixRowsColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no. of rows: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("enter the no. of columns: ");
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		boolean[] row = new boolean[a.length]; 
		boolean[] column = new boolean[a[0].length];		
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			row[i]=false;
		}
		for(int i=0;i<a[0].length;i++)
		{
			column[i]=false;
		}
		System.out.println("enter the elements of matrix:");
		// entering the elements of a matrix and storing boolean values for row and column numbers in array
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				a[i][j] = sc.nextInt();
				
				if(a[i][j]==0)
				{
					row[i]=true;
					column[j]=true;
				}
			}
			System.out.println();
		}
		
		System.out.println("elements of matrix are:");
		// Printing the initial elements of a matrix 
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[0].length; j++)
			{
				System.out.print(a[i][j]+"  ");

			}
			System.out.println();
		}
		//Printing the final elements of a matrix after changing it to 0's
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[0].length; j++)
			{ 
				if (row[i] || column[j]) 
				{
					a[i][j]=0; 
				}
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
