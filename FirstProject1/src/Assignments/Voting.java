package Assignments;
//Write a program to check whether the candidate is eligible for Voting
//(Use static method and boolean return type).
import java.util.Scanner;
public class Voting {
	
	static int age;
	
	static boolean eligible(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = s1.nextInt();
		if(age>18){
		return true;
		}
		else{
			return false;
		}
		
		
	}
	

	public static void main(String[] args) {
		
if(eligible()==true){
	System.out.println("Eligible for voting");
}
else{
	System.out.println("Not eligible");
}
	}

}
