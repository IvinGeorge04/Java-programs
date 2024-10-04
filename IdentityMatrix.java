import java.util.*;
public class IdentityMatrix
{
    public static void main(String[] args)
    {
        int i,j,size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the identity matrix:");
        size=sc.nextInt();
        int[][] A=new int[size][size];
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                if(i==j)
                {
                    A[i][j]=1;
                }
                else{
                    A[i][j]=0;
                }
            }
        }
        System.out.println("The Identity MAtrix is:");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                System.out.print(A[i][j]+"\t");
            }System.out.print("\n");
        }

    }
}