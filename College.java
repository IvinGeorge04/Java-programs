import java.util.Scanner;
//Ivin George
//managing student information in a college environment.
class Student{
    String name,sem,course,branch,type;
    void details(){
        System.out.println("Name: "+name);
        System.out.println("Semester=: "+sem);
        System.out.println("Course: "+course);
        System.out.println("Branch: "+branch);
        System.out.println("Type: "+type);
    }
}
class Hostler extends Student{
    String hstl_name;
    Hostler(String name,String sem,String course,String branch,String type,String hstl_name){
        this.name=name;
        this.sem=sem;
        this.course=course;
        this.branch=branch;
        this.type=type;
        this.hstl_name=hstl_name;
    }
    void hostel_detial(){
        super.details();
        System.out.println("Hostel name is: "+hstl_name);
    }
}
class DayScholar extends Student{
    String bus_route;
    DayScholar(String name,String sem,String course,String branch,String type,String bus_route){
        this.name=name;
        this.sem=sem;
        this.course=course;
        this.branch=branch;
        this.type=type;
        this.bus_route=bus_route;
    }
    void busRoute(){
        super.details();
        System.out.println("Bus route is: "+bus_route);
    }
}
class College{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String name=sc.nextLine();
        System.out.print("Enter the semester: ");
        String sem=sc.next();
        System.out.print("Enter the course: ");
        String course=sc.next();
        System.out.print("Enter the branch: ");
        String branch=sc.next();
        System.out.print("Enter the student type(Hostler/Dayscholar): ");
        String type=sc.next();
        sc.nextLine();
        if((type.toLowerCase()).equals("hostler")){
            System.out.print("Enter the hostel name: ");
            String hstl_name=sc.nextLine();
            Hostler h=new Hostler(name,sem,course,branch,type,hstl_name);
            System.out.println("\nSTUDENT DETAILS: ");
            h.hostel_detial();
        }
        else if((type.toLowerCase()).equals("dayscholar")){
            System.out.print("Enter the Bus route: ");
            String bus_route=sc.nextLine();
            DayScholar d=new DayScholar(name,sem,course,branch,type,bus_route);
            System.out.println("\nSTUDENT DETAILS: ");
            d.busRoute();
        }
        else{
            System.out.print("\n Invlaid Student type");
        }

    }
}