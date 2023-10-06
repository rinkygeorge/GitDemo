package Assignments;
import java.util.Scanner;

public class Onseason {
	int price1;



	public Onseason(int price1) {

		this.price1 = price1;
	}



	public void discount() {

		float discountedprice =  (float) (price1 * 0.15);
		System.out.println("Discounted price "+discountedprice);

	}

}
