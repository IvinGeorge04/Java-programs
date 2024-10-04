//Ivin George,38
//pallindrome
package oopj24csb38;
import java.util.*;
public class Pallindrome {
	public static void main(String[] args) {
		int flag=1;
		Scanner sc=new Scanner(System.in);
		String A=new String();
		System.out.println("Enter the string");
		A=sc.nextLine();
		int n=A.length();
		for(int i=0,j=n-1;i<=n/2;i++,j--){
			if(A.charAt(i)!=A.charAt(j)){
				flag=0;
				System.out.println("The string "+ A+" is not palindrome");
				break;
			}
		}
		if(flag==1){
			System.out.println("The string "+ A+" is palindrome");
		}
	}
}
