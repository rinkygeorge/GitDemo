package corejava;

public class Employee {

	int basicsalary=1000;
	
	Employee(){
		System.out.println("Parent constructor");
	}

	
	void display(){
		System.out.println("Parent Method");
		System.out.println(basicsalary);
	}
	void sampleMsg() {
		System.out.println("Parent class");
	}
}


