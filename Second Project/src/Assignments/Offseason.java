package Assignments;

import java.util.Scanner;

public class Offseason {
	int price2;
	
	
	

	public Offseason(int price2) {
		this.price2 = price2;
	}

	public void discount() {
		float discountedprice =  (float) (price2 * 0.15);
		System.out.println("Discounted price "+discountedprice);
		
	}

	public static void main(String[] args) {
		

	}

}
