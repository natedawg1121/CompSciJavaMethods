package Ch05.Exercises;

import java.util.Scanner;

public class GivenABC {
	public static void main(String[] args) {
		int a, b, c;
        double x1, x2, d;

        Scanner gib = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = gib.nextInt();
        System.out.print("Enter b: ");
        b = gib.nextInt();
        System.out.print("Enter c: ");
        c = gib.nextInt();
        d = b * b - 4 * a * c;

        if(d > 0) {
            x1 = ( - b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The first root is: " + x1);
            System.out.println("The second root is: " + x2);
        } else if(d == 0) {
            System.out.println("The roots are real and equal");
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Root: " + x1);
        } else {
            System.out.println("The roots are imaginary");
        }
        gib.close();
    }
}