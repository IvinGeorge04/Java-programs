package Tutorial;
import java.util.*;
public class NumberException {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size:");
			int n=sc.nextInt();
			int[] A=new int[n];
			int sum=0,c=0;
			System.out.println("Enter the numbers:");
			for(int i=0;i<n;i++) {
				A[i]=sc.nextInt();
			}
			System.out.println("The numbers are: ");
			for(int i=0;i<n;i++) {
				try {
					if(A[i]>0) {
						System.out.println(A[i]);
						sum=sum+A[i];
						c++;
					}
					else {
						throw new InvalidNumberException("invalid number "+A[i]);
					}
				}catch(InvalidNumberException e) {
					System.out.println(e.getMessage());
				}
			}
			if(c>0) {
				System.out.println("the sum of positive number is"+sum);
				float avg=sum/c;
				System.out.println("The average is:"+avg);
			}
		}
}
