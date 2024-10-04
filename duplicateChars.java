import java.util.*;
public class duplicateChars
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String A=new String();
        int[] B=new int[130];
        System.out.println("Enter the string:");
        A=sc.nextLine();
        int n=A.length();
        A.toUpperCase();
        for(int i=0;i<130;i++)
        {
            B[i]=0;
        }
        for(int i=0;i<A.length();i++)
        {
            int m=A.charAt(i);
            for(int j=0;j<130;j++)
            {
                if(j==m)
                {
                    B[j]+=1;
                }

            }
        }
        for(int i=0;i<A.length();i++)
        {
            int m=A.charAt(i);
            for(int j=0;j<130;j++)
            {
                if(j==m)
                {
                    if(B[j]>1)
                    {
                        System.out.println(A.charAt(i)+" : "+B[j]);
                        B[j]=0;
                    }
                }

            }
        }
        

    }
}