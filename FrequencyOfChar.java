//Ivin George,38
//Frequency of a character
package oopj24csb38;
import java.util.Scanner;
public class FrequencyOfChar {
	public static void main(String[] args) {
		char c;
		do {
			int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		int n=str.length();
		for(int i=0;i<n;i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		System.out.println("No of occurence: "+count);
		System.out.println("Do you want to continue or not:(Y/N)");
		c=sc.next().charAt(0);
		}while (c=='y' ||c=='Y');
		System.out.println("Exiting....");
	}
}
