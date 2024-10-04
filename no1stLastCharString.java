import java.util.*;
//Ivin G
/*o read a given string and return the string without 
the first or last characters if they are the same, otherwise return the string 
without the characters*/
public class no1stLastCharString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        int n=str.length();
        if((str.substring(0,1)).equalsIgnoreCase(str.substring(n-1,n)))
        {
            System.out.println("The first and the last characters of the string are same");
            System.out.print("\n"+str.substring(1,n-1));
        }
        else
        {
            System.out.println("The first and the last characters of the string are not same");
            System.out.println(str);
        }
    }
}