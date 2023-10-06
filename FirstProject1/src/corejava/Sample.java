package corejava;

public class Sample {

	int a, b, c;
	int sum;

	public int sum(int a, int b) {

		this.a = a;
		this.b = b;
		sum = a + b;
		return sum;

	}
	
	public int sum(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;
		sum = a + b + c;
		return sum;

	}

	public float sum(float n1, float n2) {

		float sum = n1 + n2;
		return sum;

	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1.sum(5, 6));
		System.out.println(s1.sum(5, 6, 7));
		System.out.println(s1.sum(5.5f, 7.3f));

	}

}
