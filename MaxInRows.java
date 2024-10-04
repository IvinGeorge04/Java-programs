import java.util.*;
public class MaxInRows
{
    public static void main(String[] args)
    {
        int i,j,row,col,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and cols of matrix:");
        row=sc.nextInt();
        col=sc.nextInt();
        int[][] A=new int[row][col];
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
        System.out.println("The maximum elements in each row:");
        for(i=0;i<row;i++)
        {sum=0;
            for(j=0;j<col;j++)
            {
                sum+=A[i][j];
            }System.out.println("Row "+(i+1)+" : "+sum);
        }
    }
}