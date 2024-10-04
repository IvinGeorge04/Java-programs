import java.util.*;
public class SymmetricMatrix
{
    public static void main(String[] args)
    {
        int i,j,size,flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the identity matrix:");
        size=sc.nextInt();
        int[][] A=new int[size][size];
        System.out.println("Enter the matrix:");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                if(A[i][j]!=A[j][i])
                {
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("It is a symmetric matrix");
        }
        else
        {
            System.out.println("It is not a symmetric matrix");
        }
    }
}