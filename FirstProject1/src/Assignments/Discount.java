package Assignments;


import java.util.Scanner;
public class Discount {
	static int amount;
	static int discount;
	static int finalamount;
	static int items;
	static int price;
	static int sum = 0;
	
	public static  int totamt(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number of items");	
		items = s1.nextInt();
		for(int i =0;i<items;i++){
			System.out.println("Enter the price:");
			price = s1.nextInt();
			sum = sum + price;
		}
		System.out.println("Total Amount is "+ sum);
		return sum;
		
	}
public static int discount(){
	System.out.println("You are eligible for 20% discount");
	return discount = (int) (sum*0.2);
}
	public static void main(String[] args) {
		
		totamt();
		
		if(sum>5000){
			discount();
			finalamount = sum - discount;
			System.out.println("Discounted amount is "+ finalamount);
		}
		else{
			System.out.println("No discount");
			
		}
		

	}

}
