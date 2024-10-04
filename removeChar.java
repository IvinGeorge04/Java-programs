import java.util.*;
//Ivin G
//to remove character from the string
public class removeChar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String A=sc.nextLine();
        System.out.println("Enter the Character to be removed:");
        String ch=sc.next();
        char[] b=ch.toCharArray();
        int count=0;
        char[] c=A.toCharArray();
        for(int i=0;i<A.length();i++)
        {
            if(b[0]==c[i])
            {count++;
                for(int j=i;j<A.length()-1;j++)
                {
                    c[j]=c[j+1];
                }
            }
        }
        for(int i=0;i<c.length-count;i++)
        {
            System.out.print(c[i]);
        }
        
    }
}