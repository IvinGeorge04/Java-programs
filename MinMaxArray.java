import java.util.*;
public class MinMaxArray
{
    public static void main(String[] args)
    {
        int min,max,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit:");
        n=sc.nextInt();
        int[] A=new int[n];
        System.out.println("Enter the elements:");
        for (i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        min=A[0];
        max=A[0];
        for(i=0;i<n;i++){
            if (min>A[i])
            {
                min=A[i];
            }
            if (max<A[i])
            {
                max=A[i];
            }
        }
        System.out.print("\n The Maximum value is:"+max);
        System.out.print("\n The Minimum value is:"+min);

    }
}