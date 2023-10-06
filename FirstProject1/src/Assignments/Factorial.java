
package Assignments;
//Write a program to find the factorial of a number(static method)
// Output – “Factorial of <given number> is <result>
import java.util.Scanner;
public class Factorial {
	static int number;
	static int factorial = 1;
	
	
	static void fact(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number:");
		number = s1.nextInt();
		/*while(number>0){
			factorial = factorial * number;
			number = number - 1;
		}*/
		
		for(int i=1;i<=number;i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorial of the number is: "+factorial);
	}
	public static void main(String[] args) {
		
		fact();		
		
	}

}
