package Assignments;
import java.util.Scanner;

public class AreaOfFigures {
	static double radius, circle;
	static int rectangle, length, width, side, square;
	
	static void circle(){
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter radius");
		radius = s2.nextInt();
		circle = 3.14*radius*radius;
		System.out.println("Area of circle is "+circle);
		
	}
	static void rectangle(){
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter length");
		length = s3.nextInt();
		System.out.println("Enter width");
		width = s3.nextInt();
		rectangle = length*width;
		System.out.println("Area of rectangle is "+rectangle);
		
	}
	static void square(){
		Scanner s4 = new Scanner(System.in);
		System.out.println("Enter side");
		side = s4.nextInt();
		side = side*side;
		System.out.println("Area of square is "+side);
		
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Select the options to find the area:");
		System.out.println("a. Circle");
		System.out.println("b. Rectangle");
		System.out.println("c. Square");
		
		String option = s1.nextLine();
		switch(option.charAt(0)){
		case 'a': circle();
					break;
		case 'b': rectangle();
					break;
		case 'c': square();
					break;
		default: System.out.println("Invalid option");
		}
		
	
		
		
	}

}
