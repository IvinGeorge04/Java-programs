import java.util.*;
//Ivin G
//to find the reverse of the string
public class stringReverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String A=sc.nextLine();
        char[] B=A.toCharArray();
        int n=B.length;
        char[] C=new char[n];
        for(int i=0,j=n-1;j>=0;i++,j--)
        {
            C[i]=B[j];
        }
        System.out.print("The reversed string is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(C[i]);
        }
    }
}