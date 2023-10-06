package corejava;

public class StringProgram {

	public static void main(String[] args) {
//		String name = "Rinky"; //literals
//		System.out.println(name);
		
		String s1 = new String("HelloWorld"); //another method to create string
		/*System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		System.out.println(s1.substring(1));
		System.out.println(s1.contains("World"));
		System.out.println(s1.charAt(5));
		System.out.println(s1.equals("Helloworld"));
		System.out.println(s1.equalsIgnoreCase("helloworld"));
		System.out.println(s1.concat(" Program"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace('o','e')); */
		
		
		/*StringBuffer b1 = new StringBuffer("My Name");
		System.out.println(b1.length());
		System.out.println(b1.append(" is Rinky"));
		//System.out.println(b1.reverse());
		System.out.println(b1.replace(11,16,"Arun"));
		System.out.println(b1.charAt(5));
		System.out.println(b1.insert(10, " Joseph"));
		System.out.println(b1.delete(3,8));
		*/
		StringBuilder sb= new StringBuilder("Rinky George");
		System.out.println(sb.length());
		System.out.println(sb.append(" is a girl"));
		System.out.println(sb.replace(6,12,"Arun"));
		
		
	
		

	}

}
