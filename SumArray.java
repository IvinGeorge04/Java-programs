import java.util.*;
public class SumArray
{
    public static void main(String[] args)
    {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit:");
        n=sc.nextInt();
        int[] A=new int[n];
        System.out.println("Enter the elements:");
        for (i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
            sum+=A[i];
        }
        System.out.print("The sum of elements in array is: "+sum);
        
    }
}