import java.util.*;
//Ivin G
/*count the total no. of chars, words, lines, alphabets, 
digits,white spaces in a given strin*/
public class countIntCharWord
{
    public static void main(String[] args)
    {
        int alpha=0,word=0,line=1,character=0,digit=0,space=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String A=sc.nextLine();
        A.toLowerCase();
        character=A.length();
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)>='a' && A.charAt(i)<='z')
            {
                alpha++;
            }
            else if(A.charAt(i)>='0' &&A.charAt(i)<='9')
            {
                digit++;
            }
            else if(A.charAt(i)==' ')
            {
                space++;
            }
            else if(A.charAt(i)=='\n')
            {
                line++;
            }
            if(A.charAt(i)==' '||A.charAt(i)=='.'){
            
                word++;
            }
            
        }
        System.out.print("\nCharaters="+character);
            System.out.print("\nalphabets="+alpha);
            System.out.print("\nDigits="+digit);
            System.out.print("\nspaces="+space);
            System.out.print("\n Lines="+line);
            System.out.print("\n words="+word);
    }
}