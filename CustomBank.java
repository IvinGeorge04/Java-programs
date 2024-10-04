package oopj24csb38;
import java.util.Scanner;
class InsufficientFundsException extends Exception{
	private String message;
	InsufficientFundsException(String msg){
		message=msg;
	}
	public String getMessage() {
		return message;
	}
}
class InvalidAmountException extends Exception{
	private String message;
	InvalidAmountException(String msg){
		message=msg;
	}
	public String getMessage() {
		return message;
	}
}
class MyCustomBank{
	Scanner sc=new Scanner(System.in);
	public int accNo;
	public String accType;
	public String name;
	public long balance;
	void OpenAccount() {
		System.out.print("Enter Account No: ");
		this.accNo=sc.nextInt();
		System.out.print("Enter Account Type: ");
		this.accType=sc.next();
		System.out.print("Enter Name: ");
		this.name=sc.next();
		System.out.print("Enter Balance: ");
		this.balance=sc.nextLong();
	}
	public void DisplayAccount() {
		System.out.println("Name of account holder: "+name);
		System.out.println("Account no: "+accNo);
		System.out.println("Account Type: "+accType);
		System.out.println("Balance: "+balance);
	}
	public void SearchAccount(int accNo1) {
			System.out.println("Name of account holder: "+name);
			System.out.println("Account no: "+accNo);
			System.out.println("Account Type: "+accType);
			System.out.println("Balance: "+balance);
	}
	public void DepositAmount () {
		System.out.print("Enter the amount you want to deposit: ");
		long deposit=sc.nextInt();
		try {
			if(deposit<=0) {
				throw new InvalidAmountException("Invalid amount; amount must be greater than 0");
			}
			else {
				balance+=deposit;
				System.out.println("Deposit Successful! New balance: "+balance);
			}
		}catch(InvalidAmountException e) {
			System.out.print(e.getMessage());
		}
	}
	public void Withdraw() {
		System.out.print("Enter the amount you want to withdraw: ");
		long withdraw=sc.nextInt();
		try {
			if (withdraw <= 0) {
	                throw new InvalidAmountException("Invalid amount; must be greater than 0.");
	        }
	        if (balance < withdraw) {
	                throw new InsufficientFundsException("Insufficient balance for withdrawal.");
	        }
			
			balance-=withdraw;
			System.out.println("withdrawal Successful! New balance: "+balance);
			
		}catch(InsufficientFundsException |InvalidAmountException e) {
			System.out.print(e.getMessage());
		}	}	}
public class CustomBank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of customers: ");
		int n=sc.nextInt();
		sc.nextLine();
		MyCustomBank[] b=new MyCustomBank[n];
		for(int i=0;i<n;i++) {
			b[i]=new MyCustomBank();
			System.out.println("Enter the Acount "+(i+1)+" Details: ");
			b[i].OpenAccount();
			
			System.out.println();
		}
		do {
			System.out.println("\n****Bankiing System Application****");
			System.out.println("1.Display all Account \n.2.SearchAccount \n3.Deposit amount \n4.Withdraw \n5.Exit");
			System.out.println("Enter the choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				for(int i=0;i<n;i++) {
					System.out.println("Acount: "+(i+1));
					b[i].DisplayAccount();
				}
				break;
			case 2:
				int flag=0;
				System.out.println("Enter the account no to be searched: ");
				int accNo1=sc.nextInt();
				for(int i=0;i<n;i++) {
					if(b[i].accNo==accNo1) {
						b[i].DisplayAccount();
						flag=1;
					}
				}
				if(flag==0) {
					System.out.println("Invalid account no");
				}
				break;
			case 3:
				int flag1=0;
				System.out.println("Enter the account no: ");
				int accNo2=sc.nextInt();
				for(int i=0;i<n;i++) {					if(b[i].accNo==accNo2) {
						b[i].DepositAmount();
						flag1=1;
					}
				}
				if(flag1==0) {
					System.out.println("Invalid account no");
				}
				break;
			case 4:
				int flag2=0;
				System.out.println("Enter the account no: ");
				int accNo3=sc.nextInt();
				for(int i=0;i<n;i++) {
					if(b[i].accNo==accNo3) {
						b[i].Withdraw();
						flag2=1;
					}
				}
				if(flag2==0) {
					System.out.println("Invalid account no");
				}
				break;
			case 5:
				System.out.println("See you soon...\n"
						+ "\n"
						+ "*********************************\n"
						+ "    Thank You :) Visit again\n"
						+ "***********************************");
				return;
			default:
				System.out.print("Invlaid choice");
				break;
			}
		}while(true);
	}
}
