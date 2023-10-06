package Assignments;

import java.util.Scanner;
public class Grade {
	
	int maths, science, english;
	 int totalmarks;
	
	Grade(int maths, int science, int english){
		
		
		this.maths = maths;
		this.science = science;
		this.english = english;
		
	
		
	}
	int gettotalmarks(){
		totalmarks = this.maths+this.science+this.english;
		return totalmarks;
	}
	

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		//for(int i=0;i<2;i++){
			System.out.println("Enter marks:");
			System.out.println("maths:");
			int maths = s1.nextInt();
			System.out.println("science:");
			int science = s1.nextInt();
			System.out.println("english:");
			int english = s1.nextInt();			
			Grade g1 = new Grade(maths, science, english);
			int totalmarks = g1.gettotalmarks();
			
			
			
			System.out.println("Total marks "+totalmarks);
			if(totalmarks<150){
				System.out.println("Grade B");
			}
			else{
				System.out.println("Grade A");
			}
		
		//}
			
			
		

	}

}
