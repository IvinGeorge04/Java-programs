import java.util.Scanner;
//abstract class
abstract class Employee{
    abstract void calculateMonthlySalary();
    String name;
}
class FullTimeEmployee extends Employee{
    String name;
    float salary;
    FullTimeEmployee(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    void calculateMonthlySalary(){
        System.out.println(name+"'s Salary: Rs"+(salary+1000.0));
    }

}
class PartTimeEmployee extends Employee{
    String name;
    float hour,salary;
    PartTimeEmployee(String name,float salary,float hour){
        this.name=name;
        this.hour=hour;
        this.salary=salary;
    }
    void calculateMonthlySalary(){
        salary=salary*hour*25;
        System.out.println(name+"'s Salary: Rs"+salary);
    }

}
class Intern extends Employee{
    String name;
    float salary;
    Intern(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    void calculateMonthlySalary(){
        System.out.println(name+"'s Stipend: Rs"+salary);
    }
}
class EmployeeTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        float salary;
        do{
            sc.nextLine();
            System.out.print("Enter employee's name: ");
            String name=sc.nextLine();
            System.out.print("Enter employee's job type(full-time,part-time,intern): ");
            String type=sc.next();
            switch(type.toLowerCase()){
                case "full-time":
                    System.out.print("Enter the monthly salary: ");
                    salary=sc.nextFloat();
                    FullTimeEmployee full=new FullTimeEmployee(name,salary);
                    full.calculateMonthlySalary();
                    break;
                case "part-time":
                    System.out.print("Enter the hourly wage: : ");
                    salary=sc.nextFloat();
                    System.out.print("Entert he no of hours worked /day: ");
                    float hour=sc.nextFloat();
                    PartTimeEmployee part=new PartTimeEmployee(name,salary,hour);
                    part.calculateMonthlySalary();
                    break;
                case "intern":
                    System.out.print("Enter the stipend amount: ");
                    salary=sc.nextFloat();
                    Intern i=new Intern(name,salary);
                    i.calculateMonthlySalary();
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
            System.out.print("Do you want to continue(Y/N): ");
            ch=sc.next().charAt(0);
            //sc.nextInt();
        }while(ch=='y'||ch=='Y');

    }
}