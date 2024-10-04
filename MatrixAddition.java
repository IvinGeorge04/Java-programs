import java.util.*;
public class MatrixAddition
{
    public static void main(String[] args)
    {
        int i,j,row1,row2,col1,col2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col of matrix1:");
        row1=sc.nextInt();
        col1=sc.nextInt();
        System.out.println("Enter the row and col of matrix2:");
        row2=sc.nextInt();
        col2=sc.nextInt();
        int[][] A=new int[row1][col1];
        int[][] B=new int[row2][col2];
        int[][] C=new int[row1][col1];
        if (row1==row2 && col1==col2)
        {
            System.out.println("Enter the matrix1:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    A[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the matrix2:");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    B[i][j]=sc.nextInt();
                }
            }
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    C[i][j]=A[i][j]+B[i][j];
                }
            }
            System.out.println("the matrix1 is:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }System.out.print("\n");
            }
            System.out.println("the matrix2 is:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print(B[i][j]+"\t");
                }System.out.print("\n");
            }
            System.out.println("the sum of Matrix 1 and 2 is:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print(C[i][j]+"\t");
                }System.out.print("\n");
            }

        }
        else{
            System.out.println("The matrix addition is not possible");
        }
        
    }
}