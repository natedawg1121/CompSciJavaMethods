package Ch05.Exercises;

import java.util.Scanner;

public class GasMileage {
	public static double gasBought(int miles, double mpg) {
		return miles / mpg;
	}
  
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    
		System.out.print("Gas Mileage: ");
		double mpg = input.nextInt();
		System.out.print("Miles Traveled: ");
		int miles = input.nextInt();
		input.close();

		double gallons = gasBought(miles, mpg);
		System.out.printf("You spent %.1f gallons of gas\n", gallons);
	}
}