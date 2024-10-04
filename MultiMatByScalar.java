import java.util.*;
public class MultiMatByScalar
{
    public static void main(String[] args)
    {
        int i,j,k,row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row nd col of matrix:");
        row=sc.nextInt();
        col=sc.nextInt();
        int[][] A=new int[row][col];
        int[][] B=new int[row][col];
        int[][] C=new int[row][col];
        System.out.println("Enter the matrix:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(A[i][j]+"\t");
            }System.out.print("\n");
        }
        System.out.println("Enter the scalar value to multiply with the matrix:");
        int n=sc.nextInt();
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(i==j)
                {
                    B[i][j]=n;
                }
                else{
                    B[i][j]=0;
                }
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {C[i][j]=0;
                for(k=0;k<col;k++)
                {
                    C[i][j]+=A[i][k]*B[k][j];
                }
                
            }
        }
        System.out.println("the product matrix is :");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(C[i][j]+"\t");
            }System.out.print("\n");
        }


    }
}