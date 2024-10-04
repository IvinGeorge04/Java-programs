import java.util.Scanner;
//Ivin George
//program to implement Single Inheritance
class employee{
        String name;
        String emp_id;
    void displayEmp(){
        System.out.println("name: "+name+"\n ID: "+emp_id);
    }
}
class manager extends employee{
    String department; 
    void manage(){
        System.out.print("Department :"+department);
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        employee ob=new employee();
        manager ob1=new manager();
        System.out.println("Employee details");
        sc.nextLine();
        System.out.print("Enter the name of the empolyee:");
        ob.name=sc.nextLine();
        System.out.print("Enter the employee id:");
        ob.emp_id=sc.next();
        System.out.println("Manager details");
        sc.nextLine();
        System.out.print("Enter the name of the manager: ");
        ob1.name=sc.nextLine();
        System.out.print("Enter the manager id:");
        ob1.emp_id=sc.next();
        System.out.print("Enter the department: ");
        ob1.department=sc.next();
        System.out.println("\nEMPLOYEE DETAILS");
        ob.displayEmp();
        System.out.println("\nMANAGER DETAILS");
        ob1.displayEmp();
        ob1.manage();
    }
}