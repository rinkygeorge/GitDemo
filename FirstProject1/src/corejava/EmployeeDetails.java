package corejava;
import java.util.Scanner;
public class EmployeeDetails {
	int id;
	String name;
	
	/*public void getDetails() { //getting i/p from console
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter id");
		id = s1.nextInt();
		System.out.println("Enter name");
		name = s1.next();
		display();
		
	}*/
	/*public void displayDetails(int id, String name) { //instance method
		this.id = id;
		this.name = name;
				
	}*/
	
	EmployeeDetails(int id, String name){ //constructor
		this.id = id;
		this.name = name;
	}
	public void display() {
		System.out.println("Id is "+id+" and name is "+name);
	}

	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails(1, "Arun");
		//e1.displayDetails(1, "rinky");
		e1.display();
	}

}
