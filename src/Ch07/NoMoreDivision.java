package Ch07;

import java.util.Scanner;

public class NoMoreDivision {
    private static Scanner gib = new Scanner(System.in);

    public static void main(String[] agrs) {
        System.out.print("Input first integer: ");
        int a = gib.nextInt();
        System.out.print("Input second integer: ");
        int b = gib.nextInt();

        int r = 0;

        while (a >= b) {
            a -= b;
            r++;
        }
        System.out.println("The quotient is " + r + ", the remainder is " + a);
    }
}