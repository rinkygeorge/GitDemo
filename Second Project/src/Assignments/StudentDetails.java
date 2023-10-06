package Assignments;

public class StudentDetails {
	String name, college;
		int rollno;
	
	StudentDetails(String name, String college, int rollno){
		this.name = name;
		this.college = college;
		this.rollno = rollno;
		
	}
	
	public void display() {
		System.out.println("Student name is "+name);
		System.out.println("Rollno is "+rollno);
		System.out.println("College: "+college);
	}

	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails("Rinky","AMS",3);
		StudentDetails sd1 = new StudentDetails("Arun","MES",4);
		sd.display();
		sd1.display();


	}

}
