package Tutorial;
import pack2.Women;
import java.util.Scanner;
public class Man {
	public String name;
	public int age;
	public Man(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayMe() {
		System.out.println("Man's name: "+name+", Age :"+age);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name and age of man :");
		String name=sc.next();
		int age=sc.nextInt();
		Man m=new Man(name,age);
		
		System.out.println("Enter the name and age of women :");
		String name1=sc.next();
		int age1=sc.nextInt();
		Women w=new Women(name1,age1);
		m.displayMe();
		w.displayMe();
	}

}
