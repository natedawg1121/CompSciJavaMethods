public class Formatting {
	public static void main(String[] args) {
		//Formatting output -- one technique
		// %s -- String data type
		// %d -- int data type
		// %f -- decimals
		String firstName = "Nahtan";
		String lastName = "Trawets";
		System.out.printf("Hello %2$s %1$h . How are you?", lastName, firstName);
		
		int num1 = 7654;
		int num2 = 8919;
		System.out.printf("\nNum 1 = %2d\nNum 2 = %04d", num1, num2);
		
		double num3 = 10.685;
		double num4 = 11.23456789;
		System.out.printf("\nNum 3 = %2.2f\nNum 4 = %03.4f", num3, num4);
	}
}