package Assignments;

public class Hra extends Salary{
	
	int hra;
	int pf;
	
	/*public int calhra(int basicpay){
		hra =  (int) (basicpay * 0.05);
		return hra;
	}
	public int calpf(int basicpay){
		return pf = (int) (basicpay * 0.2);
		
	}
	*/
	public void calc()
	{
		hra = (int) (basicpay * 0.05);
		pf = (int) (basicpay * 0.2);
	}

	public static void main(String[] args) {
		
		/*Hra h1 = new Hra();
		int basicpay = h1.inputdata();
		 h1.calhra(basicpay);
		 h1.calpf(basicpay);*/
		
		
	}

}
