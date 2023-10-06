package Assignments;
import java.util.Scanner;

public class Salary {
	
	 int basicpay;
	 int deduction;
	 int bonus;
	 
	
	 public int inputdata(){
		 Scanner s1 = new Scanner(System.in);
			System.out.println("Enter basic pay:");
			basicpay = s1.nextInt();
			System.out.println("Enter deduction:");
			deduction = s1.nextInt();
			System.out.println("Enter bonus:");
			bonus = s1.nextInt();
			return basicpay;
	 }

	public static void main(String[] args) {
		
	}

}
