package Assignments;

import java.util.Scanner;

public class ClassGrade {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter option:");
		System.out.println("a. Age>18");
		System.out.println("b. Age<18");
		String option = s1.nextLine();
		switch (option.charAt(0)) {
		case 'a':
			System.out.println("You are eligible for voting");
			break;
		case 'b':
			System.out.println("You're not eligible");
			break;
		default:
			System.out.println("Invalid option");

		}

	}

}
