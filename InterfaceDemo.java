package oopj24csb38;
//Ivin George,38
//Interface
abstract class Animal {
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	abstract void eat();
	void walk() {
		System.out.println("This animal walk by "+legs+" legs");
	}
}
class Spider extends Animal{
	Spider(int legs){
		super(legs);
	}
	void eat() {
		System.out.println("Spider eats insects.");
	}
}
interface Pet{
	abstract void getName();
	abstract void setName(String name);
	abstract void play();
}
class Cat extends Animal implements Pet{
	String name;
	Cat(String name,int legs){
		super(legs);
		this.name=name;
	}
	public void play() {
		System.out.println("Cat plays with rats");
	}
	public void getName() {
		System.out.println("This cat's name is "+name);
	}
	public void setName(String name) {
		this.name=name;}
	void eat() {
		System.out.println("Cat eats fishes.");
	}
}
class Fish extends Animal implements Pet{
	String name;
	Fish(String name){
		super(0);
		this.name=name;
	}
	public void play() {
	}
	public void getName() {
		System.out.println("This fish's name is "+name);
	}
	public void setName(String name) {
		this.name=name;
	}
	void eat() {
		System.out.println("Fish eat plants.");
	}
	void walk() {
		System.out.println("Fish has no legs");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		System.out.println("\nFISH");
		Fish d=new Fish("Mimi");
		d.getName();
		d.walk();
		d.eat();
		d.setName("Momo");
		d.getName();
		System.out.println("\nCAT");
		Cat c=new Cat("Fluffy",4);
		c.getName();
		c.walk();
		c.play();
		c.eat();
		c.setName("Moose");
		c.getName();
		System.out.println("\nSPIDER");
		Spider e=new Spider(8);
		e.eat();
		e.walk();
	}
}
