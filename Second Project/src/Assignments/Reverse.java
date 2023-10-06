
/*Two constructors, one for calculation reverse and other for display 
“Finding reverse…”*/
package Assignments;

import java.util.Scanner;

public class Reverse {
	static int number; static int reverse = 0; static int remainder;

	Reverse(int number, int remainder, int reverse) {
		
		this();
		this.number = number;
		this.reverse = reverse;
		this.remainder = remainder;
		
		while (number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println(reverse);

	}
	Reverse(){
		System.out.println("Finding Reverse");
	}

	public static int input() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = s1.nextInt();
		return number;

	}

	public static void main(String[] args) {

		int number = input();
		Reverse r1 = new Reverse(number, reverse, remainder);

	}

}
