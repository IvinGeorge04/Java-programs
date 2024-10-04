import java.util.*;
public class PrimeNos
{
    public static void main(String[] args)
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("The prime no btw thw range to 1 to 100 are:");
        for(int i=2;i<=100;i++)
        {
            flag=1;
            for(int j=2;j<=(i/2);j++)
            {
                if((i%j)==0)
                {
                    flag=0;
                    break;
                }

            }
            if (flag==1)
            {
                System.out.print(i+" ");
            }
        }
    }
}