import java.util.*;
public class transpose
{
    public static void main(String[] args)
    {
        int i,j,row1,col1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col of matrix:");
        row1=sc.nextInt();
        col1=sc.nextInt();
        int[][] A=new int[row1][col1];
        int[][] B=new int[col1][row1];
        System.out.println("Enter the matrix1:");
        {
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    A[i][j]=sc.nextInt();
                }
            }
        }
        for(i=0;i<row1;i++){
            for(j=0;j<col1;j++)
            {
                B[j][i]=A[i][j];
            }
        } 
        System.out.println("The transpose matrix is:");
        for(i=0;i<col1;i++)
        {
            for(j=0;j<row1;j++)
            {
                System.out.print(B[i][j]+"\t");
            }System.out.print("\n");
        }   

    }
}    