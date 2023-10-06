package Assignments;

import java.util.Scanner;

public class SeasonMainClass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the season");
		String season = s1.next();

		if(season.charAt(0)=='o') {
			System.out.println("Enter the price");
			int price1 = s1.nextInt();

			Onseason o1 = new Onseason(price1);
			o1.discount();
		}
		else {
			int price2 = s1.nextInt();
			System.out.println("Enter the price");
			Offseason o2 = new Offseason(price2);
			
		}






	}

}
