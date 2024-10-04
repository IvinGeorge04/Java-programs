package oopj24csb38;
//Ivin George,38
//Abstract class implementation
import java.util.Scanner;
abstract class shape{
	abstract void NoOfSides();
}
class triangle extends shape{
	int sides,angle;
	triangle(int sides){
		this.sides=sides;
	}
	void NoOfSides() {
		angle=(sides-2)*180;
		System.out.println("Shape with "+sides+" sides");
		System.out.println("I am Triangle. I have "+sides+" sides.");
		System.out.println("Sum of Angles="+angle);
	}
}
class rectangle extends shape{
	int sides,angle;
	rectangle(int sides){
		this.sides=sides;
	}
	void NoOfSides() {
		angle=(sides-2)*180;
		System.out.println("Shape with "+sides+" sides");
		System.out.println("I am Rectangle. I have "+sides+" sides.");
		System.out.println("Sum of Angles="+angle);
	}
}
class hexagon extends shape{
	int sides,angle;
	hexagon(int sides){
		this.sides=sides;
	}
	void NoOfSides() {
		angle=(sides-2)*180;
		System.out.println("Shape with "+sides+" sides");
		System.out.println("I am Hexagon. I have "+sides+" sides.");
		System.out.println("Sum of Angles="+angle);
	}
}
public class AbstractImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sides;
		char ch;
		do {
			System.out.println("Enter the number of sides for the geometric shape:");
			sides=sc.nextInt();
			if (sides==3) {
				triangle t=new triangle(sides);
				t.NoOfSides();
			}
			else if(sides==4) {
				rectangle rect=new rectangle(sides);
				rect.NoOfSides();
			}
			else if(sides==6) {
				hexagon hex=new hexagon(sides);
				hex.NoOfSides();
			}
			else {
				System.out.println("Shape with "+sides+" sides is not supported.");
			}
			System.out.println("Do you want to continue?(Y/N):");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		System.out.println("Exiting program.Goodbye!");
	}

}
