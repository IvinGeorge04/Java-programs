package oopj24csb38;
//Ivin George,38
// hierachial inheritance
import java.util.Scanner;
class employee{
	int age;
	long phoneNo;
	String name,address;
	float salary;
	void print_employee() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println("Phone Number: "+phoneNo);
	}
	void print_salary() {
		System.out.println("Salary: "+salary);
	}
}
class officer extends employee{
	String specialization;
	void print_specialization() {
		System.out.println("Specialization: "+specialization);
	}
}
class manager extends employee{
	String department;
	void print_department() {
		System.out.println("Department: "+department);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		officer b=new officer();
		manager b1=new manager();
		System.out.print("Enter the officer's name: ");
		b.name=sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Address: ");
		b.address=sc.nextLine();
		System.out.print("Enter the Specialization: ");
		b.specialization=sc.next();
		System.out.print("Enter Age: ");
		b.age=sc.nextInt();
		System.out.print("Enter Phone Number: ");
		b.phoneNo=sc.nextLong();
		System.out.print("Enter Salary: ");
		b.salary=sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter the manager's name: ");
		b1.name=sc.nextLine();
		System.out.print("Enter Address: ");
		b1.address=sc.nextLine();
		System.out.print("Enter Department: ");
		b1.department=sc.next();
		System.out.print("Enter Age: ");
		b1.age=sc.nextInt();
		System.out.print("Enter Phone Number: ");
		b1.phoneNo=sc.nextLong();
		System.out.print("Enter Salary: ");
		b1.salary=sc.nextFloat();
		System.out.print("\n");
		System.out.println("OFFICER DETAILS:");
		b.print_employee();
		b.print_salary();
		b.print_specialization();
		System.out.print("\n");
		System.out.println("MANAGER'S DETAILS:");
		b1.print_employee();
		b1.print_salary();
		b1.print_department();
	}
}
	