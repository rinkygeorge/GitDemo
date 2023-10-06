package corejava;

import java.util.Scanner;

public class StringSample {
	

	public String getInput() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter string:");
		String name = s1.nextLine();
		return name;

	}

	public String charac(String name) {
		int len = name.length();
		int mid = len / 2;
		String s;
		if (len % 2 == 0) {

			s = name.charAt(mid) + "" + name.charAt(mid - 1) + "";
			return s;

		} else {
			s = name.charAt(mid) + "";
			return s;

		}

	}

	public static void main(String[] args) {

		StringSample s1 = new StringSample();
		String sample = s1.getInput();
		String characs = s1.charac(sample);
		System.out.println(characs);
	}

}
