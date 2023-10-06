package corejava;

public class VehicleConstructor {
	
	String name;
	String modelno;
	
	VehicleConstructor(String name){
		this.name = name;
		
	}
	
	VehicleConstructor(String name, String modelno){
		this(name); //reused constructor
		this.modelno = modelno;
		
	}
	
	void display(){
		System.out.println(name+" "+modelno);
	}

	public static void main(String[] args) {
		VehicleConstructor vc = new VehicleConstructor("SUV", "XXX");
		vc.display();
		
		
	}

}
