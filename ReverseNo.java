import java.util.*;
public class ReverseNo
{
    public static void main(String[] args)
    {
        int num,i,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        num=sc.nextInt();
        int n=num;
        for(i=0;num>0;i++)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("The reverse of "+n+" is: "+rev);
    }
}