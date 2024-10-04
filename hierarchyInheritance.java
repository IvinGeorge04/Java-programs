import java.util.Scanner;
//Ivin George 
// program to implement Hierarchical Inheritance
class Employee2{
    String name;
    String ID;
    void display(){
        System.out.println("Name: "+name+"\nID: "+ID);
    }
}
class partTime extends Employee2{
    float salary;
    void salary(){
        System.out.println("Salary per hour: "+salary);
    }
}
class fullTime extends Employee2{
    float salary;
    void salary(){
         System.out.println("Anual Salary: "+salary);
    }

}
public class hierarchyInheritance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        partTime ob=new partTime();
        fullTime ob1=new fullTime();
        System.out.println("Part-time Employee details");
        System.out.print("Enter the name of the empolyee:");
        ob.name=sc.nextLine();
        System.out.print("Enter the employee id:");
        ob.ID=sc.next();
        System.out.print("Enter the Salary:");
        ob.salary=sc.nextFloat();
        System.out.println("Full-time Employee details");
        sc.nextLine();
        System.out.print("Enter the name of the empolyee:");
        ob1.name=sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the employee id:");
        ob1.ID=sc.next();
        System.out.print("Enter the Salary:");
        ob1.salary=sc.nextFloat();
        System.out.println("\nPART TIME EMPLOYEE:");
        ob.display();
        ob.salary();
        System.out.println("\nFULL TIME EMPLOYEE:");
        ob1.display();
        ob1.salary();
    }
}