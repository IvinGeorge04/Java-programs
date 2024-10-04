import java.util.*;
public class duplicateElements
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n=sc.nextInt();
        int[] A=new int[n];
        int[] B=new int[101];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<=100;i++)
        {
            B[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=100;j++)
            {
                if(j==A[i])
                {
                    B[j]+=1;
                }

            }
        }
        
            for(int j=0;j<=100;j++)
            {
                if(B[j]>0)
                    {
                        System.out.println(j+" : "+B[j]+" times");
                    }

            }
        
    }
}