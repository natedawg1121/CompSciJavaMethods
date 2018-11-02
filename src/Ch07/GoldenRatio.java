package Ch07;

import java.util.Scanner;

public class GoldenRatio {
    public static void main(String[] args) {
        double y = 1;
        Scanner gib = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = gib.nextInt();
        for (int i = 1; i < x; i++) {
            y = 1.0 + (1.0 / y);
        }
        System.out.println("x = " + y);
    }
}