package Tutorial;
import pack2.Even;
import java.util.*;
public class EvenCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int a=Even.checkNum(num);
		if(a==1) {
			System.out.println("number "+num +" is even");
		}else {
			System.out.println("number "+num +" is not even");
		}
		sc.close();
	}

}
