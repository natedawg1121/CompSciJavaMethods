package Ch07;

import java.util.Scanner;

public class AsteriskPrint {
    public static void main(String[] args) {
        Scanner gib = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int input = gib.nextInt();
        printStarTriangle(input);
    }

    public static void printStarTriangle(int n) {
        String spaces = "";
        for (int j = 0; j < n; j++) {
            for (int i = 7; i > j; i--) {
                spaces += " ";
            }
            System.out.print(spaces);
            spaces = "";
            for (int k = 0; k < 1+j*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
