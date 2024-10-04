import java.util.*;
public class searchin2DArray
{
    public static void main(String[] args)
    {
        int i,j,row,col;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row and col:");
        row=sc.nextInt();
        col=sc.nextInt();
        int[][] A=new int[row][col];
        System.out.print("\n Enter the elements:\n");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.print("\n Enter the element to be serached:");
        int num=sc.nextInt();
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(A[i][j]==num)
                {
                    System.out.print("\n the element is found at the position:("+(i+1)+","+(j+1)+")");
                }
            }
        }

    }
}