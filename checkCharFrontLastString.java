import java.util.*;
//ivin G
//to compare the first two characteres with th last charater of the string
public class checkCharFrontLastString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String A=sc.nextLine();
        String s1=A.substring(0,2);
        if(A.endsWith(s1))
        {
            System.out.println("The first two character appears at the end of the string");
        }
        else
        {
            System.out.println("The first two character doest not  appears at the end of the string");
        }
    }
}