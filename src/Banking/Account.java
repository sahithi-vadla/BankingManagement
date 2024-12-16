package Banking;
import java.util.Scanner;
public class Account {
	
	double balance;
	String custName="  sahithi  ";
	int custId=   10503060;
	int prevTransaction;

	
	public void  BankAccount(String customerName,int customerId) {
		custName=customerName;
		custId=customerId;
		System.out.println("welcome to safe bank");}
	
	
	public void deposit(int amount) {
		if(amount>100) {
			balance+=amount;
			prevTransaction=amount;
			System.out.println("money deposited---");
			
		}
	}public void sample() {
		
	}
	public void withdraw(int amount) {
		if(amount>100 && amount<=balance) {
			System.out.println();
			balance-=amount;
			prevTransaction=-amount;
			System.out.println("--money withdraw insufficient balance---");
			
		}
	}public void getTransactionDetails() {
		if(prevTransaction>100) {
			System.out.println("deposited :"+prevTransaction);
		}else if(prevTransaction<100){
			System.out.println("withdrawn :"+Math.abs(balance));
		}else {
			System.out.println("----No transaction done----");
		}
	}public void mainMenu() {int n;
	Scanner sc=new Scanner(System.in);
	System.out.println( "hi welcome to sbi bank--"   +custName);
	System.out.println("your Id---"  +custId);
		System.out.println("1.check balance");
		System.out.println("2.Deposit");
		System.out.println("3.withdraw");
		System.out.println("4.prev Transaction details");
		System.out.println("5.exit");
		do{System.out.println("enter option:  ");
		n=sc.nextInt();	
		switch(n) {
		case 1:System.out.println(balance);break;
		
		case 2:System.out.println();
		System.out.println("enter amount to deposit:   ");
			int amount=sc.nextInt();
			deposit(amount);
		System.out.println();break;
		
		case 3:System.out.println();
			System.out.println("enter withdraw amount:  ");
			int amount2=sc.nextInt();
			withdraw(amount2);break;
		
		case 4:getTransactionDetails();
		System.out.println("balance amount");break;
		
		case 5:break;
		default: System.out.println("enter valid option");
		}
		}while(n!=5);}
}
