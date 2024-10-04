package Tutorial;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score of the student:");
		int score=sc.nextInt();
		try {
			if(score<0||score>100) {
				throw new InvalidScoreException("The score must be btw 0 and 100");
			}else {
				System.out.println("The score of the student: "+score);
			}
		}catch(InvalidScoreException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
