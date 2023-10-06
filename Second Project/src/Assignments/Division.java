package Assignments;

public class Division extends Addition {
	int result;
	
	
	public void summ(){
		int sum = super.sum();
		if(sum%10==0){
			System.out.println("Divisible by 10: ");
		}
		else
		{
			System.out.println("Not divisible by 10");
		}
				
	}

	public static void main(String[] args) {
		Division d1 = new Division();
		 d1.summ();
		
		
		
	}

}
