package Assignments;
//Write a program to deposit and withdraw amount from bank account(Withdrawal amount do not exceeds the current balance). 
//Add an extra method to check the account balance
import java.util.Scanner;
public class BankPgm {
	
	static int currentbalance = 0;
	static int deposit;
	static int withdraw;
	
	static void balance(){
		System.out.println("Current balance:"+currentbalance);
	}
	static void deposit1(){
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the amount:");
		deposit = s2.nextInt();
		currentbalance = currentbalance + deposit;
		System.out.println("New balance is "+currentbalance);
	}
	
	static void withdraw1(){
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter the amount:");
		withdraw = s3.nextInt();
		if(withdraw<currentbalance){
		currentbalance = currentbalance-withdraw;
		}
		else{
			System.out.println("Insufficient amount");
		}
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<5;i++){
		System.out.println("Choose one option");
		System.out.println("a - Check current balance");
		System.out.println("b - Deposit");
		System.out.println("c - Withdraw");
		System.out.println("d - End");
		
		String option = s1.nextLine();
			
		switch(option.charAt(0)){
		case 'a':  balance();
					break;
		case 'b': 	deposit1();
					break;
					
		case 'c': withdraw1();
					break;
		default: System.out.println("End of transaction");
				  break;
		}
		}

	}

}
