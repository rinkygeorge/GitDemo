package corejava;

public class Student {
	
int id;

Student(int id){
	this.id = id;
}

void display(){
	System.out.println(id);
}

	public static void main(String[] args) {
		Student s1 = new Student(10);
		s1.display();
		

	}

}
