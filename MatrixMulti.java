//package oopj24csb38;
//Ivin George,38
//Matrx Maultipilcaion
import java.util.Scanner;

public class MatrixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,row1,row2,col1,col2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and col of matrix1");
		row1=sc.nextInt();
		col1=sc.nextInt();
		System.out.println("Enter the row and col of Matrix2:");
		row2=sc.nextInt();
		col2=sc.nextInt();
		int[][] A=new int[row1][col1];
		int[][] B=new int[row2][col2];
		int[][] C=new int[row1][col2];
		if (col1!=row2)
		{
			System.out.println("The matrix maltiplication is not possible");
			return;
		}
		System.out.println("Enter the Matrix1:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the Matrix2:");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				C[i][j]=0;
				for(k=0;k<col1;k++)
				{
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		System.out.println("the product matrix is:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				//C[i][j]=sc.nextInt();
				System.out.print(C[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
