//Ivin George,38
//Method Overloading
package oopj24csb38;
import java.util.Scanner;
public class MethodOverloading {
		double calculateArea(double x,double y){
			return 0.5*x*y;
		}
		int calculateArea(int x,int y){
			return x*y;
		}
		double calculateArea(double x){
			return 3.14*x*x;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    MethodOverloading obj=new MethodOverloading();
		System.out.println("Enter the base of the triangle:");
		double base=sc.nextDouble();
		System.out.println("Enter the height of the triangle:");
		double height=sc.nextDouble();
		System.out.println("Enter the width of the rectangle:");
		int width=sc.nextInt();
		System.out.println("Enter the lenght of the rectangle:");
		int len=sc.nextInt();
		System.out.println("Enter the radius of the circle:");
		double radius=sc.nextDouble();
		double triangleArea=obj.calculateArea(base,height);
		int rectangleArea=obj.calculateArea(width,len);
		double CricleArea=obj.calculateArea(radius);
		System.out.println("the area of triangle with base: "+base+" and height :"+height+" is :"+triangleArea);
		System.out.println("the area of rectangle with width: "+width+" and lenght :"+len+" is :"+rectangleArea);
		System.out.println("the area of circle with radius: "+radius+" is :"+CricleArea);
	}
}	

