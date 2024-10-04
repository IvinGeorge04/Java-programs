import java.util.*;
public class Fibonacci
{
    public static void main(String[] args)
    {
        int n,first=0,second=1,next,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms of fibonacci series:");
        n=sc.nextInt();
        System.out.print(first+" "+second+" ");
        while(i<n)
        {
            next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
            i++;
        }
    }
}