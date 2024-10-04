package oopj24csb38;
//ivin George,38
//method overriding and super
import java.util.Scanner;
class employee2{
	float Gross_sal,salary;
	float DA,HRA;
	employee2(float salary,float DA,float HRA){
		this.DA=DA;
		this.salary=salary;
		this.HRA=HRA;
	}
	void display() {
		System.out.println(".....EMPLOYEE......");
	}
	
	void cal_salary() {
		Gross_sal=salary+(salary*(DA/100))+(salary*(HRA/100));
		System.out.println("The Gross Salary of employeee is: "+Gross_sal);
	}
}
class engineer extends employee2{
	engineer(float salary,float DA,float HRA){
		super(salary,DA,HRA);
	}
	void display() {
		super.display();
		super.cal_salary();
		System.out.println(".....Engineer......");
	}
	void cal_salary() {
		System.out.println("The Gross Salary of the engineer is: "+2*Gross_sal);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Salary of the empolyee: ");
		float salary=sc.nextFloat();
		System.out.println("Enter the DA% of the Employee: ");
		float DA=sc.nextFloat();
		System.out.println("Enter the HRA% of the Employee: ");
		float HRA=sc.nextFloat();
		engineer ob=new engineer(salary,DA,HRA);
		ob.display();
		ob.cal_salary();
	}

}
