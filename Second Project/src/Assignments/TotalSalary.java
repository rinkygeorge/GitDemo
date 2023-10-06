package Assignments;

public class TotalSalary extends Hra {
	int totalsal;
	
	/*public int totsal(int basicpay, int hra, int pf, int bonus){
		return totalsal = basicpay+hra+pf+bonus;
	}*/
	
	public void totsal(){
		
	int totalsalary = basicpay+hra+pf+bonus;
	System.out.println("Salary Slip");
	System.out.println("************");
	System.out.println("Basic Pay: "+basicpay);
	System.out.println("Deduction: "+deduction);
	System.out.println("HRA: "+hra);
	System.out.println("PF: "+pf);
	System.out.println("Bonus: "+bonus);
	System.out.println("Total Salary: "+totalsalary);
}
	
	/*public void display(int basicpay, int deduction, int hra, int pf, int bonus, 
			int totalsalary){
		System.out.println("Salary Slip");
		System.out.println("************");
		System.out.println("Basic Pay: "+basicpay);
		System.out.println("Deduction: "+deduction);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+totalsalary);
	}*/

	public static void main(String[] args) {
		
	/*	Hra h1 = new Hra();
		int basicpay = h1.inputdata();*/
		
		
		
		
		/*int hra = ts.calhra(basicpay);
		int pf =  ts.calpf(basicpay);
		int bonus = h1.bonus;
		int deduction = h1.deduction;		
		int totalsalary = ts.totsal(basicpay,hra,pf,bonus);
		ts.display(basicpay,deduction,hra,pf,bonus,totalsalary);
		*/

	}

}
