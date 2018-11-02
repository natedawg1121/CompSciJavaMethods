package Ch07;

import java.util.Scanner;

public class NbResultCheck {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = gib.nextInt();
        System.out.print("Input b: ");
        int b = gib.nextInt();

        int p = 1;

        while (p <= n) {
            n = n - p;
            p = p * b;
        }

        System.out.println("n = " + n);
    }
}
