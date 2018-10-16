package Ch00;

public class DemoFields {
	//Fields
	
	// Primitive data types = boolean, byte, char, short, int, long, float, double

	// long is basically bigInt | default = 0
	// float is a bigger variation of double | default = 0.0
	// char is a single unicode character | default = 
	// short is basically smallInt | default = 0
	// a byte is a very small integer | default = 0

	private static byte a, b;
	
	public static void someMethod(int a, float b) {
		float product;
		a = 0;
		System.out.println(a);
		product = a * b;
		System.out.println(product);
	}

	public static void main(String args[]) {
		a = -128;
		someMethod(a, b);
		System.out.println(Math.abs(a));
	}
}