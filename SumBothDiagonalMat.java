import java.util.*;
public class SumBothDiagonalMat
{
    public static void main(String[] args)
    {
        int i,j,sum=0,sum1=0,row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col of square matrix:");
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
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(i==j)
                {
                    sum+=A[i][j];
                }
                if(i+j==col-1)
                {
                    sum1+=A[i][j];
                }
            }
        }
        System.out.println("The sum of primary diagonal is: "+sum);
        System.out.println("The sum of secondary diagonal is: "+sum1);
    }
}