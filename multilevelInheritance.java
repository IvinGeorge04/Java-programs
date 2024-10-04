import java.util.Scanner;
//Ivin George,38
// program to implement Multilevel Inheritance
class Vechicle{
    String model;
    int year;
}
class Car extends Vechicle{
    int doors;
}
class ElectricCar extends Car{
    String batteryCap;
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Year :"+year);
        System.out.println("No of doors :"+doors);
        System.out.println("batter Capacity:"+batteryCap);
    }
}
public class multilevelInheritance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ElectricCar ob=new ElectricCar();
        System.out.println("Enter the car model: ");
        ob.model=sc.next();
        System.out.println("Enter the year: ");
        ob.year=sc.nextInt();
        System.out.println("Enter the no of doors: ");
        ob.doors=sc.nextInt();
        System.out.println("Enter the batteyr capcity of the car: ");
        ob.batteryCap=sc.next();
        System.out.println("\nThe car details:");
        ob.display();

    }
}